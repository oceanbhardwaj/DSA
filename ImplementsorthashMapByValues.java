import java.util.*;
class ImplementsorthashMapByValues
{

	public static void main(String[] args) {
	   HashMap<String,Integer> h=new HashMap<String,Integer>();
	   h.put("f",1);
	   h.put("a",2);
	    h.put("g",3);
	     h.put("k",4);
	      h.put("l",5);
	       h.put("v",6);
	       

      Map<String,Integer> hm=sortbyvalue(h);
      System.out.println(hm);
  }
	 public static HashMap<String,Integer> sortbyvalue(HashMap<String,Integer> h)
	  {
	  	List<Map.Entry<String,Integer>> list=new LinkedList<Map.Entry<String,Integer>>(h.entrySet());
	  	Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){
	  		public int compare(Map.Entry<String,Integer> o1,Map.Entry<String,Integer> o2)
	  		{
	  			return o1.getValue()-o2.getValue();
	  		}
	  	});
	  	HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
	  }
	}