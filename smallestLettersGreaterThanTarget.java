class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        char ans=letters[0];
        int end=letters.length-1;
        while(start<=end){
            int mid=(start-(start-end)/2);
            if(letters[mid]>target){
                ans=letters[mid];
                end=mid-1;
            }else
                start=mid+1;
        }
        return ans;
    }
}