class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> list=new ArrayList<>();
        int carry=0;
        
        for(int i=digits.length-1;i>=0;i--){
            int sum=0;
            if(i==digits.length-1)
                sum=1;
             sum+=digits[i]+carry;
            carry=sum/10;
            sum=sum%10;
            list.add(sum);
        }
        if(carry!=0)
            list.add(carry);
        int arr[]=new int[list.size()];
        int d=list.size()-1;
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(d--);
        }
        return arr;
    }
}
-------------------------------------------------------------------------------------------------
class Solution {
    public int[] plusOne(int[] digits) {
        int digit=0;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
            return digits;
            }
            digits[i]=0;
        }
        int arr[]=new int[digits.length+1];
        arr[0]=1;
        
        return arr;
    }
}