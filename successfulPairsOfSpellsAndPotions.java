class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
      int arr[]=new int[spells.length];
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            int first=spells[i];
            int start=0;
            int end=potions.length-1;
            int ans=potions.length;
            while(start<=end){
            int mid=end+(start-end)/2;
                long d=(long)((long)first*(long)potions[mid]);
                if(d>=success){
                    ans=mid;
                     end=mid-1;
                }else
                   
                start=mid+1;
            }
            ans=potions.length-ans;
           arr[i]=ans; 
        }
        return arr;
    }
}