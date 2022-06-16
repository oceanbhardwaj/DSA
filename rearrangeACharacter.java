class Solution {
    static  class Pair{
        char key;
        int val;
        Pair(char key,int val){
            this.key=key;
            this.val=val;
        }
    }
    public String reorganizeString(String str) {
       	
   HashMap<Character,Integer> h=new HashMap<>();
	for(int i=0;i<str.length();i++){
	    char ch=str.charAt(i);
	    h.put(ch,h.getOrDefault(ch,0)+1);
	}
        //System.out.println(pq);
	PriorityQueue<Pair> pq=new PriorityQueue<Pair>((o1,o2)->o2.val-o1.val);
	for(char i:h.keySet()){
	    pq.add(new Pair(i,h.get(i)));
        //System.out.println(i + "  jkl;  "+h.get(i));
	}
         // System.out.println(pq);
  StringBuilder sb=new StringBuilder();
	while(pq.size()>1){
	    Pair p1=pq.poll();
	    Pair p2=pq.poll();
        System.out.println(p1.key+"  jkl;  "+p2.key);
	    sb.append(p1.key);
        sb.append(p2.key);
	    int val1=p1.val-1;
	    int val2=p2.val-1;
	    if(val1!=0)
	    pq.add(new Pair(p1.key,val1));
	    if(val2!=0){
	        pq.add(new Pair(p2.key,val2));
	    }
	    
	   
	    
	    
	}
	if(!pq.isEmpty() && pq.peek().val>1)
	return "";
        if(!pq.isEmpty())
	sb.append(pq.peek().key);
	return sb.toString();
    }
}

-------------------------------------------------------------------------------------------
class Solution {
    
    public String reorganizeString(String str) {
       	
   HashMap<Character,Integer> h=new HashMap<>();
	for(int i=0;i<str.length();i++){
	    char ch=str.charAt(i);
	    h.put(ch,h.getOrDefault(ch,0)+1);
	}
        //System.out.println(pq);
	PriorityQueue<Character> pq=new PriorityQueue<Character>((o1,o2)->h.get(o2)-h.get(o1));
	for(char i:h.keySet()){
	    pq.add(i);
       
	}
      
  StringBuilder sb=new StringBuilder();
	while(pq.size()>1){
	  char c1=pq.poll();
        char c2=pq.poll();
        sb.append(c1).append(c2);
        h.put(c1,h.get(c1)-1);
        h.put(c2,h.get(c2)-1);
        if(h.get(c1)!=0)
            pq.add(c1);
        if(h.get(c2)!=0)
            pq.add(c2);
	    
	   
	    
	    
	}
	if(!pq.isEmpty() && h.get(pq.peek())>1)
	return "";
        if(!pq.isEmpty())
	sb.append(pq.peek());
	return sb.toString();
    }
}