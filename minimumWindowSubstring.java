class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<t.length();i++){
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }
        String ans="";
        String res="";
        int max=Integer.MAX_VALUE;
        int j=-1;
        int i=-1;
        int totalLength=t.length();
        
        HashMap<Character,Integer>map1=new HashMap<>();
        //accquire
        int count=0;
        boolean flag1=false;
        boolean flag2=false;
        while(true){
            flag1=false;
         flag2=false;
        while(i<s.length()-1 && count<totalLength){
            i++;
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
            if(map1.getOrDefault(s.charAt(i),0)<=map2.getOrDefault(s.charAt(i),0))
                count++;
            flag1=true;
        }
        
        //collect
        while(j<i && count==totalLength){
            ans=s.substring(j+1,i+1);
            if(ans.length()<max)
            {
                max=ans.length();
                res=ans;
            }
            j++;
            if(map1.get(s.charAt(j))==1)
                map1.remove(s.charAt(j));
            else
            map1.put(s.charAt(j),map1.get(s.charAt(j))-1);
            if(map1.getOrDefault(s.charAt(j),0)<map2.getOrDefault(s.charAt(j),0))
                count--;
            flag2=true;
        }
            if(!flag1 && !flag2)
                break;
        }
        return res;
    }
}