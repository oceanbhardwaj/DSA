class Solution {
    class Pair{
        int val;
        int key;
        Pair(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((o1,o2)->o2.val-o1.val);
        for(int i:h.keySet()){
            pq.add(new Pair(i,h.get(i)));
        }
        int arr[]=new int[k];
        int count=0;
        while(k>0 && !pq.isEmpty()){
            arr[count++]=pq.poll().key;
            k--;
        }
        return arr;
    }
}

-------------------------------------------------------------------MIN PRIORITY QUEUE--------------------------------------------------------
class Solution {
    class Pair{
        int val;
        int key;
        Pair(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((o1,o2)->o1.val-o2.val); //min
        for(int i:h.keySet()){
            if(pq.size()==k){
                if(pq.peek().val<h.get(i))
                {
                    pq.poll();
                     pq.add(new Pair(i,h.get(i)));
                   
                        
                }
            }else
                
            pq.add(new Pair(i,h.get(i)));
        }
        int arr[]=new int[k];
        int count=0;
        while(k>0 && !pq.isEmpty()){
            arr[count++]=pq.poll().key;
            k--;
        }
        return arr;
    }
}
----------------------------------------------------
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //QUICKSELECT
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        //unique elements
        int arr[]=new int[h.size()];
        int count=0;
        for(int i:h.keySet())
            arr[count++]=i;
        
        QuickSelect(h.size()-k,0,h.size()-1,arr,h);
        return Arrays.copyOfRange(arr,h.size()-k,h.size());
    }
    public void QuickSelect(int k,int low,int high,int arr[],HashMap<Integer,Integer>h){
        if(low<=high){
            int pi=partition(low,high,arr,h);
            if(pi==k)
                return;
            if(pi>k){
                 QuickSelect(k,low,pi-1,arr,h);
                
            }else
                QuickSelect(k,pi+1,high,arr,h);
        }
    }
    public int partition(int low,int high,int arr[],HashMap<Integer,Integer>h){
        int mid=low;
        int pi=h.get(arr[mid]);
        while(low<high){
            while(low<arr.length && pi>=h.get(arr[low]))
                low++;
            while(high>=0 && pi<h.get(arr[high]))
                high--;
            if(low<high)
                swap(low,high,arr);
        }
        swap(high,mid,arr);
        return high;
        
        
        
    }
    public void swap(int low,int high,int arr[]){
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }
}