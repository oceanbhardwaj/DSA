class CountIntervals {

    TreeMap<Integer,Integer> map;
    long count;
    public CountIntervals() {
        map=new TreeMap<>();
        count=0;
    }
    
    public void add(int left, int right) {
      if(map.floorKey(right)==null || map.get(map.floorKey(right))<left){//no overlapping
          map.put(left,right);
        count+=(right-left+1);
    }else{  //overlapping
       
          int l=left;
          int r=right;
          while(true){
		  int leftadded=map.floorKey(r);
        int rightadded=map.get(leftadded);
        count-=(rightadded-leftadded+1);
        map.remove(leftadded);
        l=Math.min(leftadded,l);
         r=Math.max(rightadded,r);
          if(map.floorKey(r)==null || map.get(map.floorKey(r))<l)
          {
           break;
           
          }
       
    }
           map.put(l,r);
        count+=(r-l+1);
    }
    } 
    public int count() {
        return (int)count;
    }
}

/**
 * Your CountIntervals object will be instantiated and called as such:
 * CountIntervals obj = new CountIntervals();
 * obj.add(left,right);
 * int param_2 = obj.count();
 */