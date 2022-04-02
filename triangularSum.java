class Solution {
    public int triangularSum(int[] nums) {
       
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:nums)
            a.add(i);
        int count=nums.length;
        while(count>1){
              ArrayList<Integer> b=new ArrayList<>();
            for(int i=1;i<a.size();i++){
                b.add((a.get(i-1)+a.get(i))%10);
                
            }
            //System.out.println(b);
            count=b.size();
           a=new ArrayList<>(b);
              //System.out.println("After :"+a);
        }
        return a.get(0);
    }
}