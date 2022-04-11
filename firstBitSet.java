class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
       for(int i=0;i<32;i++)
       {
           if((n&(1<<i))!=0)//set
           return i+1;
       }
       return 0;
    }
}