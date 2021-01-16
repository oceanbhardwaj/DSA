import java.util.*;
class BucketSortNegativeNumbers
{
	
public static void main(String[] args) 
{ double arr[]= {-0.897, 0.565, 0.656, 
                   -0.1234, 0, 0.3434}; 

        ArrayList<Double > positive  =new ArrayList<>();
        ArrayList<Double > negative=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]>0)
        		positive.add(arr[i]);
        	else
        		negative.add(-1*arr[i]);
        } 
        ArrayList<Double> pos[]=new ArrayList[positive.size()];
        ArrayList<Double> neg[]=new ArrayList[negative.size()];
        for(int i=0;i<pos.length;i++)
        {
        	pos[i]=new ArrayList<>();
        }
        for(double i:positive)
        {
        	int d=(int)(positive.size()*i);
        	pos[d].add(i);
        }
        for(int i=0;i<pos.length;i++)
        {
        	Collections.sort(pos[i]);
        }
        positive.clear();
        for(int i=0;i<pos.length;i++)
        {
        	ArrayList<Double> a1=pos[i];
        	for(Double j:a1)
        	{
        		positive.add(j);
        	}
        }
//negative
        for(int i=0;i<neg.length;i++)
        {
        	neg[i]=new ArrayList<>();
        }
        for(double i:negative)
        {
        	int d=(int)(negative.size()*i);
        	neg[d].add(i);
        }
        for(int i=0;i<neg.length;i++)
        {
        	Collections.sort(neg[i]);
        }
       negative.clear();
        for(int i=0;i<neg.length;i++)
        {
        	ArrayList<Double> a2=neg[i];
        	for(Double j:a2)
        	{
        		negative.add(0,-1*j);
        	}
        }

        for(Double i:negative)
        	System.out.println(i);

        for(Double i:positive)
        	System.out.println(i);











}
}s