class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
      
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums)
            set.add(i);
        PriorityQueue<Integer> p=new PriorityQueue<>(set);
       // System.out.println(h);
       //  System.out.println(set);
       //  System.out.println(p);
        int c=0;
     while(!p.isEmpty()){
            int d=p.poll();
         // System.out.println("d :"+d);
         int count1=0;
            for(int i=0;i<numsDivide.length;i++){
                if(numsDivide[i]%d==0)
                {  count1++;
                    continue;
                }
                else{
                    c+=h.get(d);
                    break;
                }
                    
            }
         if(count1==numsDivide.length){
             return c;
         }
        }
        return -1;
    }
}