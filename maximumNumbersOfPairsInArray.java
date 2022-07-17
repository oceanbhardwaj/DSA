class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
       
        int count=0;
        int left=0;
        int arr[]=new int[2];
      
       for(int i:nums){
           h.put(i,h.getOrDefault(i,0)+1);
       }
         System.out.println(h);
        for(int i:h.keySet()){
            if(h.get(i)==2)
            {count++;
           h.put(i,0);
            }
            else if(h.get(i)==1)
            {left++;
             h.put(i,0);
               
            
            }
            else if(h.get(i)>2){
                int d=h.get(i)/2;
                int mod=h.get(i)%2;
                count+=d;
                   // if(mod!=0)
                h.put(i,mod);
            }
                
        }
        for(int i:h.keySet()){
            if(h.get(i)>0)
                left++;
        }
        System.out.println(h);
        arr[0]=count;
        arr[1]=left;
        return arr;
    }
}