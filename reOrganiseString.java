class Solution {
    class Pair
    {
        char c;
        int freq;
        Pair(char c,int freq)
        {
            this.c=c;
            this.freq=freq;
        }
    }
    public String reorganizeString(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((o1,o2)->o2.freq-o1.freq);
        for(char c:h.keySet())
        {
          pq.add(new Pair(c,h.get(c)));  
        }
        ArrayList<Pair> a=new ArrayList<>();
        String res="";
        char prev='A';
        while(!pq.isEmpty())
        {
            Pair curr=pq.poll();
         char c1=curr.c;
            int f1=curr.freq;
            if(prev!=c1)
            {
                res=res+c1;
                if(!a.isEmpty())
                    pq.add(a.get(0));
                a=new ArrayList<Pair>();
                if(f1-1!=0)
                { a.add(new Pair(c1,f1-1));
                }
                prev=c1;
            }
            else
            {
            return "";
            }
            
        }
        if(!a.isEmpty())
        {
            if(prev==a.get(0).c)
                return "";
        }
        return res;
    }
}