class CombinationIterator {

    ArrayList<String> subsets;
    Iterator<String> i;
    public CombinationIterator(String characters, int combinationLength) {
        subsets=new ArrayList<>();
        generateSubsets(characters,combinationLength,"",0,subsets);
        System.out.println(subsets);
        i=subsets.iterator();
    }
    public void generateSubsets(String s,int n,String output,int index, ArrayList<String> subsets){
        if(output.length()==n)
        {
            subsets.add(output);
            return;
        }
        if(index>=s.length())
            return;
        
        generateSubsets(s,n,output+s.charAt(index),index+1,subsets); //taking
        generateSubsets(s,n,output,index+1,subsets); //not taking
    }
    public String next() {
        return i.next();
    }
    
    public boolean hasNext() {
        return i.hasNext();
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
 ----------------------------------------------------------------------------------------------------------
 class CombinationIterator {

    ArrayList<String> subsets;
    
    public CombinationIterator(String characters, int combinationLength) {
        subsets=new ArrayList<>();
        generateSubsets(characters,combinationLength,"",0,subsets);
        System.out.println(subsets);
       
    }
    public void generateSubsets(String s,int n,String output,int index, ArrayList<String> subsets){
        if(output.length()==n)
        {
            subsets.add(output);
            return;
        }
        if(index>=s.length())
            return;
        
        generateSubsets(s,n,output+s.charAt(index),index+1,subsets); //taking
        generateSubsets(s,n,output,index+1,subsets); //not taking
    }
    public String next() {
        return subsets.remove(0);
    }
    
    public boolean hasNext() {
        return !subsets.isEmpty();
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
 
 ---------------------------------------------------------------------------------------------
 class CombinationIterator {

    //ArrayList<String> subsets;
    Queue<String> subsets;
    public CombinationIterator(String characters, int combinationLength) {
        //subsets=new ArrayList<>();
        subsets=new LinkedList();
        generateSubsets(characters,combinationLength,"",0,subsets);
        System.out.println(subsets);
       
    }
    public void generateSubsets(String s,int n,String output,int index,  Queue<String> subsets){
        if(output.length()==n)
        {
           // subsets.add(output);
            subsets.add(output);
            return;
        }
        if(index>=s.length())
            return;
        
        generateSubsets(s,n,output+s.charAt(index),index+1,subsets); //taking
        generateSubsets(s,n,output,index+1,subsets); //not taking
    }
    public String next() {
        //return subsets.remove(0);
        return subsets.poll();
    }
    
    public boolean hasNext() {
        //return !subsets.isEmpty();
        return !subsets.isEmpty();
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */