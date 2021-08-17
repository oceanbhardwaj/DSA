class Solve {
    int[] findTwoElement(int arr[], int n) {
        int ans[]=new int[2];
        int missing=0;
        int repeating=0;
        HashSet<Integer> h=new HashSet<>();
        for(int i:arr)
        {if(h.contains(i))
        {
            repeating=i;
        }
        else{
            h.add(i);
        }
        }
        
        for(int i=1;i<=n;i++)
        {
            if(!h.contains(i))
            {missing=i;
            break;}
        }
        ans[0]=repeating;
        ans[1]=missing;
        return ans;
    }
}
////////////////////////////
class Solve {
    int[] findTwoElement(int arr[], int n) {
        int ans[]=new int[2];
       for(int i=0;i<n;i++)
       {
           int absVal=Math.abs(arr[i]);
           if(arr[absVal-1]>0)
           arr[absVal-1]=-1*arr[absVal-1];
           else
           {
               ans[0]=absVal;
               
           }
       }
       for(int i=0;i<n;i++)
       {
           if(arr[i]>0)
           {
               ans[1]=i+1;
               break;
           }
       }
       return ans;
    }
}