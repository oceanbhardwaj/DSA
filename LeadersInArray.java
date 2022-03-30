//Method 1   o(n2)
class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
       ArrayList<Integer> a=new ArrayList<>();
       boolean flag=true;
       for(int i=0;i<n;i++){
           flag=true;
           for(int j=i+1;j<n;j++){
               if(arr[i]<arr[j])
               flag=false;
           }
           if(flag)
           a.add(arr[i]);
       }
       return a;
    }
    
}
-------------------------------------------------------------------------
Method 2   o(n)
class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
       ArrayList<Integer> a=new ArrayList<>();
       int max=arr[n-1];
       a.add(max);
       for(int i=n-2;i>=0;i--){
           if(arr[i]>=max)
          { a.add(arr[i]);
           max=arr[i];}
       }
       Collections.reverse(a);
       return a;
    }
}
