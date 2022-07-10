class SmallestInfiniteSet {

    PriorityQueue<Integer> q;
    HashSet<Integer> h;
    public SmallestInfiniteSet() {
        q=new PriorityQueue<>();
        h=new HashSet<>();
        for(int i=1;i<=1000;i++)
        { q.add(i);
         h.add(i);
        }
    }
    
    public int popSmallest() {
        int d=q.peek();
        h.remove(d);
        return !q.isEmpty()?q.poll():-1;
    }
    
    public void addBack(int num) {
        if(!h.contains(num)){
        q.add(num);
        h.add(num);    
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */