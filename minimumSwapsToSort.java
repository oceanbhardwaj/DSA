class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        int count=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<nums.length;i++)
        {
            h.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(arr[i]==nums[i])
            continue;
            else
            {
                count++;
                //swap(h.get(arr[i]),i);
                int h1=i;
                int h2=h.get(arr[i]);
                int temp=nums[h2];
                h.put(nums[h2],h1);
                h.put( nums[h1],h2);
                
                nums[h2]=nums[h1];
                nums[h1]=temp;
                
                
            }
        }
        return count;
        
        
        
    }
}