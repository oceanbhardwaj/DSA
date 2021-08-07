class Solution{
    static int minimumNumberOfSwaps(String S){
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='[')
            a.add(i);
        }
        char ch[]=S.toCharArray();
        int ans=0;
        int idx=0;
        int count=0;
        for(int i=0;i<S.length();i++)
        {
           if(ch[i]=='[')
           {count++;
           idx++;}
           else
           {count--;
           if(count<0)
           {
               ans=ans+a.get(idx)-i;
               //swap a.get(idx),i

char temp=ch[a.get(idx)];
ch[a.get(idx)]=ch[i];
ch[i]=temp;
               idx++;
               count=1;
           }
           
           
           }
        }
        return ans;
    }
}