class Solution {
    public int[] sortArray(int[] nums) {
         ArrayList<Integer> a=new ArrayList<>();
        for(int i:nums)
        a.add(i);
        sort(a);
        int count=0;
        for(int i:a){
            nums[count++]=i;
        }
      return nums;
    }
    public void sort(ArrayList<Integer> a)
    {
        if(a.size()==1)
        return;
        int temp=a.get(a.size()-1);
        a.remove(a.size()-1);
        sort(a);
        insert(a,temp);
        return;
    }
    public void insert(ArrayList<Integer> A,int temp){
        if(A.size()==0 || A.get(A.size()-1)<=temp)
        {
            A.add(temp);
            return;
        }
        int ele=A.get(A.size()-1);
        A.remove(A.size()-1);
        insert(A,temp);
        A.add(ele);
        return;
    }
   
    
}