class StockSpanner {

    
    Stack<Integer> s;
    ArrayList<Integer> a;
    int i;
    int ans;
    public StockSpanner() {
       s=new Stack<>();
        a=new ArrayList<>();
        i=0;
        ans=0;
    }
    
    public int next(int price) {
        
        if(!s.isEmpty()){
            if(a.get(s.peek())<=price){
                while(!s.isEmpty() && a.get(s.peek())<=price){
                    s.pop();
                }
            }
        }
            if(s.isEmpty())
                ans=i+1;
            else
                ans=i-s.peek();
          
          s.push(i);
            a.add(price);
            i++;
         
         return ans;
        }
   
            
    
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */