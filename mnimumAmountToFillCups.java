class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> q=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i:amount){
            if(i!=0)
           q.add(i); 
        }
        int count=0;
        while(q.size()>1){
            int s1=q.poll();
            int s2=q.poll();
            if(s1>=1 && s2>=1){
                count+=1;
                
            }
            s1=s1-1;
            s2=s2-1;
            if(s1>0)
                q.add(s1);
            if(s2>0)
                q.add(s2);
        }
        while(!q.isEmpty()){
            int d=q.poll();
            count=count+d;
        }
        return count;
    }
}