class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
       int arr[]=new int[n+m];
       int index=0;
       int i=0;int j=0;
       while(i<n && j<m)
       {
           if(arr1[i]<arr2[j])
           {
               arr[index++]=arr1[i];
               i++;
           }
           else
           {
               arr[index++]=arr2[j];
               j++;
           }
       }
       while(i<n)
       {
           arr[index++]=arr1[i++];
       }
       while(j<m)
       {
           arr[index++]=arr2[j++];
       }
       int in=0;
       for(int i1=0;i1<n;i1++)
       {
           arr1[i1]=arr[in++];
       }
       for(int j1=0;j1<m;j1++)
       {
           arr2[j1]=arr[in++];
       }
       
    }
}
/////////////////////////////////o(n2)///////////
class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
        //o(n*mlogm)
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr1[i]<=arr2[j])
            continue;
            else
            {
                int temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
                //i++;
                //j++;
                Arrays.sort(arr2);
            }
        }
        
    }
}
///////////////////////////////////////////////////
class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
        //o(n*mlogm)
        int j=0;
        int k=n-1;
        int i=0;
        while(i<=k && j<m)
        {
            if(arr1[i]<=arr2[j])
            i++;
            else
            {
                int temp=arr1[k];
                arr1[k]=arr2[j];
                arr2[j]=temp;
                j++;
                k--;
               
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
    }
}

