class Solution {
    public int equalPairs(int[][] grid) {
       HashMap<String,Integer> a1=new HashMap<>();//row
        //ArrayList<String> aa1=new ArrayList<String>();
         HashMap<String,Integer> a2=new HashMap<>();//col
        for(int i=0;i<grid.length;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<grid[0].length;j++){
                sb.append(grid[i][j]);
                sb.append("@");
            }
           a1.put(sb.toString(),a1.getOrDefault(sb.toString(),0)+1);
        }
        
         for(int i=0;i<grid[0].length;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<grid.length;j++){
                sb.append(grid[j][i]);
                sb.append("@");
            }
             a2.put(sb.toString(),a2.getOrDefault(sb.toString(),0)+1);
        }
        
        int count=0;
        for(String s:a1.keySet()){
            if(a2.containsKey(s))
                count+=a2.get(s)*a1.get(s);
        }
        // int c=0;
        // for(String s:a2.keySet()){
        //     if(a1.containsKey(s))
        //         c+=a1.get(s);
        // }
        return count;
    }
}