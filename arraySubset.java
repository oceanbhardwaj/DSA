class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        Arrays.sort(a1);
        Arrays.sort(a2);
        int count=0;
        int c=0;
        int i=0;int j=0;
        while(i<n && j<m)
        {
            if(a1[i]==a2[j])
            {
                j++;
                i++;
                count++;
            }
            else
            i++;
            if(m==count)
            break;
        }
        return (m==count)?"Yes":"No";
    }
}
//////////////////////////////////////////////////////

class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        HashSet<Long> h=new HashSet<>();
        for(long i:a1)
        {
            h.add(i);
        }
        for(long i:a2)
        {
            if(!h.contains(i))
            return "No";
        }
        return "Yes";
    }
}