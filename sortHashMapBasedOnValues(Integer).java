/*package whatever //do not write package name here */

import java.util.*;

@SuppressWarnings("unchecked")
class GFG {
	public static void main (String[] args) {
	//sort a HashMap Based on values
	HashMap<Integer,Integer> h=new HashMap<>();
	h.put(1,21);
	h.put(2,67);
	h.put(67,900);
	h.put(3,6789);
	h.put(2,2);
	h.put(4,5);
	System.out.println("h before Sorting :"+h);
	//Sorting
	List<Map.Entry<Integer,Integer>> list=new ArrayList<>(h.entrySet());
	
		System.out.println("list before Sorting :"+list);
		Comparator co=new Comparator<Map.Entry<Integer,Integer>>(){
		    public int compare(Map.Entry<Integer,Integer> e1,Map.Entry<Integer,Integer> e2){
		        return e1.getValue()-e2.getValue();
		    }
		};
	//	Collections.sort(list,(i1,i2)->i1.getValue()-i2.getValue());
	Collections.sort(list,co);
			System.out.println("list after Sorting :"+list);
			//put back to HashMap
			h=new LinkedHashMap<Integer,Integer>();
			for(Map.Entry<Integer,Integer> it:list){
			    h.put(it.getKey(),it.getValue());
			}
			System.out.println("h after Sorting :"+h);	
			
	
	}
}