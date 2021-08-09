class Solution {
    public List<List<String>> Anagrams(String[] string_list) 
    {
        List<List<String>> res=new ArrayList<List<String>>();
         //System.out.println("cvbjhhnkm");
        for(int i=0;i<string_list.length;i++)
        {  //System.out.println("cvbbbjnkm");
            int ch1[]=new int[26];
            String str=string_list[i];
            //System.out.println("cvbjnkm");
            if(str.equals("$"))
            continue;
            for(int i1=0;i1<str.length();i1++)
            {
                ch1[str.charAt(i1)-'a']++;
            }
            //System.out.println(str);
            ArrayList<String> a=new ArrayList<>();
            a.add(str);
            for(int j=i+1;j<string_list.length;j++)
            {
                String str2=string_list[j];
                int ch2[]=new int[26];
                //System.out.println(str2);
                 if(str2.equals("$"))
                continue;
                for(int j1=0;j1<str2.length();j1++)
            { //System.out.println(str2.charAt(j1)-'a');
                ch2[str2.charAt(j1)-'a']++;
            }
            if(Arrays.equals(ch1,ch2))
            {
                a.add(str2);
                string_list[j]="$";
            }
            
            }
            res.add(a);
        }
        return res;
    }
    
}
