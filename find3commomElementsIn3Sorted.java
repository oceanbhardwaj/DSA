/*package whatever //do not write package name here */

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        ArrayList<Integer> a=new ArrayList<>();
        HashSet<Integer> h1=new LinkedHashSet<>();
        for(int i:A)
        h1.add(i);
        HashSet<Integer> h2=new LinkedHashSet<>();
        for(int j:B)
        {
            if(h1.contains(j))
            h2.add(j);
        }
        HashSet<Integer> h3=new LinkedHashSet<>();
        for(int j:C)
        {
            if(h2.contains(j))
            h3.add(j);
        }
        for(int i:h3)
        a.add(i);
        return a;
    }
}
///////////////////////////////////////////////////////////
class Solution 
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        int i = 0, j = 0, k = 0;
        ArrayList<Integer> res = new ArrayList<Integer>();
        int last = Integer.MIN_VALUE;

        while (i < n1 && j < n2 && k < n3)
        {
            if (A[i] == B[j] && A[i] == C[k] && last!=A[i]) 
            {
                res.add (A[i]);
                last = A[i];
                i++;
                j++;
                k++;
            }
            else if (Math.min (A[i], Math.min(B[j], C[k])) == A[i]) i++;
            else if (Math.min (A[i], Math.min(B[j], C[k])) == B[j]) j++;
            else k++;
        }
        return res;
    }
}