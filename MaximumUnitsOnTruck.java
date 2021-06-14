class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Comparator co=new Comparator<int[]>()
        {
            public int compare(int a[],int b[])
            {
                if(a[1]==b[1])
                {
                    return b[0]-a[0];
                }
              return b[1]-a[1];
            
            }
        };
        Arrays.sort(boxTypes,co);
        int count=0;
        for(int a[]:boxTypes)
        {
            int number=a[0];
            int units=a[1];
            for(int i=0;i<number;i++)
            {
                if(truckSize>0)
                {count=count+units;
                 truckSize--;}
                else
                    break;
            }
        }
        return count;
        
    }
}