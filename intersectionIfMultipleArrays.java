class Solution {
    public List<Integer> intersection(int[][] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int a[]:nums){
            for(int i=0;i<a.length;i++){
                h.put(a[i],h.getOrDefault(a[i],0)+1);
            }
        }
        List<Integer> res=new ArrayList<>();
        for(int i:h.keySet()){
            if(h.get(i)==n)
                res.add(i);
        }
        Collections.sort(res);
        return res;
    }
}