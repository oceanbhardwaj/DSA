class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,ArrayList<Integer>> h=new LinkedHashMap<>();
        HashSet<Integer> set=new LinkedHashSet<>();
        for(int a[]:matches){
            h.putIfAbsent(a[1],new ArrayList<>());
            h.get(a[1]).add(a[0]);
            set.add(a[0]);
            set.add(a[1]);
        }
        List<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> a1=new ArrayList<>();
        for(int i:set){
            if(!h.containsKey(i))
                a1.add(i);
        }
        Collections.sort(a1);
        res.add(a1);
        ArrayList<Integer> a2=new ArrayList<>();
        for(int i:h.keySet()){
          int d=h.get(i).size();
            if(d==1)
                a2.add(i);
        }
           Collections.sort(a2);
        res.add(a2);
        return res;
    }
}