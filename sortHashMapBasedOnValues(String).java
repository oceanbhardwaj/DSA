/*package whatever //do not write package name here */

import java.util.*;

@SuppressWarnings("unchecked")
class GFG {
	public static void main (String[] args) {
	//sort a HashMap Based on values
	HashMap<Integer,String> h=new HashMap<>();
	h.put(1,"abc");
	h.put(2,"abcd");
	h.put(67,"aac");
	h.put(3,"zd");
	h.put(2,"ef");
	h.put(4,"dd");
	System.out.println("h before Sorting :"+h);
	//Sorting
	List<Map.Entry<Integer,String>> list=new ArrayList<>(h.entrySet());
	
		System.out.println("list before Sorting :"+list);
		Comparator co=new Comparator<Map.Entry<Integer,String>>(){
		    public int compare(Map.Entry<Integer,String> e1,Map.Entry<Integer,String> e2){
		       // return e1.getValue()-e2.getValue();
		       return (e1.getValue()).compareTo(e2.getValue());
		    }
		};
	//	Collections.sort(list,(i1,i2)->i1.getValue()-i2.getValue());
	Collections.sort(list,co);
			System.out.println("list after Sorting :"+list);
			//put back to HashMap
			h=new LinkedHashMap<Integer,String>();
			for(Map.Entry<Integer,String> it:list){
			    h.put(it.getKey(),it.getValue());
			}
			System.out.println("h after Sorting :"+h);	
			
	
	}
}