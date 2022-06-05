class Solution {
    public int minMaxGame(int[] nums) {
        
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:nums)
            a.add(i);
        boolean flag=true;
        int min;
        int n=a.size();
        while(a.size()>1){
            
            ArrayList<Integer> aa=new ArrayList<>();
           // System.out.println(a);
            while(aa.size()<n/2){
            if(flag){
                // System.out.println("cfgvhbj");
            int d=a.get(0);
            int e=a.get(1);
             min=Math.min(d,e);
                }else{
                 //System.out.println("KLLLLLLLLL");
                int d=a.get(0);
            int e=a.get(1);
             min=Math.max(d,e);
                
                
            }
                // System.out.println("hjk");
            a.remove(0);
            a.remove(0);
                // System.out.println("vnm");
            aa.add(min);
                  flag=!flag;
            
        }
          
        
            a=new ArrayList<Integer>(aa);
            flag=true;
            if(a.size()==1)
                return a.get(0);
            n=aa.size();
        
    }
        return a.get(0);
}}