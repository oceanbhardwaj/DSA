class Solution {
    public String largestNumber(int[] nums) {
        Integer array[]=new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            array[i]=nums[i];
        }
        Comparator co=new Comparator<Integer>(){
            public int compare(Integer s1,Integer s2){
                String str1=s1+""+s2;
                String str2=s2+""+s1;
                return str2.compareTo(str1);
            }
        };
      Arrays.sort(array,co);
        StringBuilder sb=new StringBuilder();
        for(Integer i:array){
            sb.append(i+"");
        }
        int i=0;
        if(sb.toString().startsWith("0")){
            while(i<sb.toString().length() && sb.toString().charAt(i)=='0')
                i++;
        }
       return i>=sb.toString().length()?"0":sb.toString().substring(i);
    }
}