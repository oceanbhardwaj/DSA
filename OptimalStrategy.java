class OptimalStrategy
{
	public static void main(String[] args) {
		int arr[]={5,10};
		int n=arr.length;
		System.out.println(helper(arr,0,n-1));
	}
	public static int helper(int arr[],int left,int right)
	{    if(arr.length==1)
		return arr[0];
		if(arr.length==2)
			return Math.max(arr[0],arr[1]);
		if(left>=right)
			return 0;
		//if(arr[left]>arr[right])
			int d= arr[left]+Math.min(helper(arr,left+2,right),helper(arr,left+1,right-1));
		
			int e= arr[right]+Math.min(helper(arr,left,right-2),helper(arr,left+1,right-1));
			return Math.max(d,e);
	}
}