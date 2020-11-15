class OrderedStream {
int index=1;
    HashMap<Integer,String> h;
    public OrderedStream(int n) {
        h=new HashMap<>();
    }
    
    public List<String> insert(int id, String value) {
        h.put(id,value);
        ArrayList<String> a=new ArrayList<>();
        while(h.containsKey(index))
            a.add(h.get(index++));
        
        return a;
        
    }
}