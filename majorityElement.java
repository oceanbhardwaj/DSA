class Solution
{
    static int majorityElement(int a[], int size)
    {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i:a)
        {
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(int i:h.keySet())
        {
            if(h.get(i)>size/2)
            return i;
        }
        return -1;
    }
}
//////////////////////////////////
class Solution
{
    static int majorityElement(int a[], int size)
    {
        int maj=0;
        int count=1;
        for(int i=1;i<size;i++)
        {
            if(a[maj]==a[i])
            count++;
            else
            count--;
            if(count==0)
            {
                maj=i;
                count=1;
            }
        }
        count=0;
        for(int i=0;i<size;i++)
        {
            if(a[maj]==a[i])
            count++;
            if(count>size/2)
            return a[maj];
            
        }
        return -1;
    }
}