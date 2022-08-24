//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            int N = S.length();
            Solution ob = new Solution();
            String[] element = br.readLine().trim().split("\\s+");
		    int[] f = new int[N];
		    for(int i = 0; i < N; i++){
		        f[i] = Integer.parseInt(element[i]);
		    }
            ArrayList<String> res  = ob.huffmanCodes(S,f,N);
            for(int i = 0; i < res.size(); i++)
            {
                System.out.print(res.get(i)+" ");
            }
            System.out.println();
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    class HuffManNodes{
        char c;
        int freq;
        HuffManNodes left;
        HuffManNodes right;
        // public HuffManNodes(char c,int freq,HuffManNodes left,HuffManNodes right){
        //     this.c=c;
        //     this.freq=freq;
        //     left=null;
        //     right=null;
        // }
    }
    public ArrayList<String> huffmanCodes(String S, int f[], int N)
    {
        ArrayList<String> a=new ArrayList<>();
        //step1 build min heap
        Comparator co=new Comparator<HuffManNodes>(){
            public int compare(HuffManNodes h1,HuffManNodes h2){
                if(h1.freq>=h2.freq)
                return 1;
                return -1;
                
                // if(h1.freq==h2.freq)
                // return h1.c-h2.c;
                
                // return h1.freq-h2.freq;
            }
        };
        //  PriorityQueue<HuffManNodes> pq=
        //     new PriorityQueue<>( new Comparator<HuffManNodes>(){
        //     public int compare(HuffManNodes a, HuffManNodes b){
        //         if(a.freq >= b.freq){
        //             return 1;
        //         }
        //         else{
        //             return -1;
        //         }
        //     }
        // });
       PriorityQueue<HuffManNodes> pq=new PriorityQueue<HuffManNodes>(co);
        for(int i=0;i<N;i++){
            HuffManNodes h=new HuffManNodes();
            h.c=S.charAt(i);
            h.freq=f[i];
            h.left=null;
            h.right=null;
            pq.add(h);
        }
        //step2 build min binary heap
        HuffManNodes root=null;
        while(pq.size()>1){
            
            HuffManNodes h1=pq.poll();
            HuffManNodes h2=pq.poll();
            
            HuffManNodes H=new HuffManNodes();
            H.freq=h1.freq+h2.freq;
            H.c='$';
            H.left=h1;
            H.right=h2;
          root=H;
          pq.add(H);
        }
        //step 3 : root will be root of binary min heap
        //print Codes
        printCodes(a,root,"");
        
       return a; 
        
        
    
    }
    
    public void printCodes(ArrayList<String> a,HuffManNodes root,String output){
        
        if(root==null)
        return;
        if(root.left==null && root.right==null && root.c!='$')
        {
            a.add(output);
            return;
        }
        
        printCodes(a,root.left,output+'0');
        printCodes(a,root.right,output+'1');
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}