/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int parent[]=new int[n+1];
     for(int i=1;i<=n;i++){
         parent[i]=i;
     }
     int k=sc.nextInt();
     for(int i=0;i<k;i++){
         int a=sc.nextInt();
         int b=sc.nextInt();
         union(a,b,parent);
     }
     HashSet<Integer> h=new HashSet<>();
     for(int i=1;i<parent.length;i++)
     h.add(find(i,parent));

     System.out.println(h.size());

        

    }
    public static void union(int a,int b,int parent[]){
        int fx=find(a,parent);
        int fy=find(b,parent);
        if(fx==fy)
        return;
        parent[fy]=fx;
    }
    public static int find(int x,int parent[]){
        if(parent[x]==x)
        return x;
        int parent1=find(parent[x],parent);
       return parent[x]=parent1;
    }
}
