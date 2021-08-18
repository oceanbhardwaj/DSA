class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-3;i++)
        {
            if (arr[i] > 0 && arr[i] > k) break;
            //get complement
            if(i>0 && arr[i-1]==arr[i])
            continue;
            int complement=k-arr[i];
            for(int j=i+1;j<arr.length-2;j++)
            {
                if(j>i+1 && arr[j]==arr[j-1])
                continue;
                ArrayList<Integer> a=new ArrayList<>();
                int curr=complement-arr[j];
                int left=j+1;
                int right=arr.length-1;
                
                while(left<right)
                {
                     a=new ArrayList<>();
                    int old_left=left;
                int old_right=right;
                    if(arr[left]+arr[right]==curr)
                    {
                        a.add(arr[i]);
                        a.add(arr[j]);
                        a.add(arr[left]);
                        a.add(arr[right]);
                        //Collections.sort(a);
                        res.add(a);
                      while(left<right && arr[old_left]==arr[left])
                    left++;
                    while(left<right && arr[old_right]==arr[right])
                    right--;
                    }
                    else if(arr[left]+arr[right]>curr)
                    right--;
                    else
                    left++;
                    
                    
                }
                
            }
        }
       // Collections.sort(res);
        return res;
    }
}