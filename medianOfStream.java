class MedianFinder {

    //TLE O(N2LOGN) O(N)
    ArrayList<Integer> a;
    public MedianFinder() {
        a=new ArrayList<Integer>();
    }
    
    public void addNum(int num) {
        a.add(num);
        Collections.sort(a);
    }
    
    public double findMedian() {
        if(a.size()%2==1)//odd
            return (double)a.get(a.size()/2);
        int d=a.size()/2;
        return (double)((double)a.get(d)+(double)a.get(d-1))/2;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
 ----------------------------------------------------
 class MedianFinder {

//Heap o(nlogn) o(n)
    PriorityQueue<Integer> max;
    PriorityQueue<Integer> min;
    public MedianFinder() {
       max=new PriorityQueue<>(Collections.reverseOrder());
       min=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(max.isEmpty() || max.peek()>num)
            max.add(num);
        else
            min.add(num);
        while(max.size()>min.size()+1){
            min.add(max.poll());
            
        }
        while(min.size()>max.size()+1){
            max.add(min.poll());
        }
    }
    
    public double findMedian() {
       if(max.size()>min.size())
           return max.peek();
        else if(min.size()>max.size())
            return min.peek();
        else{
            return (double)(((double)max.peek()+(double)min.peek())/2);
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */