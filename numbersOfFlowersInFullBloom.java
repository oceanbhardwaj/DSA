class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] persons) {
        int arr[]=new int[persons.length];
       
       // Arrays.sort(flowers,co);
        for(int i=0;i<persons.length;i++){
            int res=persons[i];
            int count=0;
            for(int a[]:flowers){
                int x=a[0];
                int y=a[1];
                if(res>=x && res<=y)
                {
                    count++;
                }
            }
            arr[i]=count;
        }
        return arr;
    }
}