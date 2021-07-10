 public int countOccurence(int[] arr, int n, int k) 
    { 
    HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            int d=arr[i];
           int count=1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]==d)
                count++;
                
            }
            if(count>n/k)
            { h.add(d);
                }
        }
        return h.size();
    }
}
///////////////////////////////////////////
class Solution 
{
    
    public int countOccurence(int[] arr, int n, int k) 
    {
        HashMap<Integer,Integer> h=new HashMap<>();
        int count=0;
        for(int i:arr)
        {
            h.put(i,h.getOrDefault(i,0)+1);
            
        }
        for(int i:h.keySet())
        {
            if(h.get(i)>n/k)
            count++;
        }
        return count;
    }
}
/////////////////////////////////////////////////
public int countOccurence(int[] arr, int n, int k) 
    {
        Arrays.sort(arr);
        int last=Integer.MIN_VALUE;
        int prev=arr[0];
        int count=1;
        int d=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]==prev)
            {count++;
            if(count>n/k && last!=prev)
            {
                last=prev;
                d++;
                
                
            }
                prev=arr[i];
            }
            else
            {
                count=1;
                prev=arr[i];
            }
        }
        return d;
    }
}
///////////////////////////////////////////////////////////////
class Solution 
{
   class Pair
   {
       int ele;
       int count;
       
   }
    public int countOccurence(int[] arr, int n, int k) 
    {
        Pair temp[]=new Pair[k-1];
        //inisalise
        for(int i=0;i<k-1;i++)
        {
            temp[i]=new Pair();
            temp[i].count=0;
        }
        //process
        for(int i=0;i<n;i++)
        {
            int j;
            // CASE 1-WHEN ARR[I] IS PRESENT IN TEMP
            for( j=0;j<k-1;j++)
            {
                if(temp[j].ele==arr[i])
                {
                    temp[j].count+=1;
                    break;
                }
            }
            //CASE 2 NOT PRESENT
            if(j==k-1)
            { int l;
                //CASE 2.1--IF ANY VACANT POSITION AVAILABLE
                for( l=0;l<k-1;l++ )
                {
                    if(temp[l].count==0)
                    {
                        temp[l].ele=arr[i];
                        temp[l].count=1;
                        break;
                    }
                }
                //Case 2.2--IF NO VACANT POSITION
                if(l==k-1)
                {
                    //REMOVE 1 COUNT FROM EVERY ELEMENT
                    for(int m=0;m<k-1;m++)
                    {
                        temp[m].count-=1;
                    }
                }
            }
        }
        int ac=0;
        int max=0;
        for(int h=0;h<k-1;h++)
        {  ac=0;
            int element=temp[h].ele;
            for(int a=0;a<n;a++)
            {
                if(element==arr[a])
                ac++;
            }
            if(ac>n/k)
            max++;
        }
        return max;
    }
}

