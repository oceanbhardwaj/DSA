class Solution {
    public int[] countRectangles(int[][] rectangles, int[][] points) {
        //sort rectangles by length
        Comparator co=new Comparator<int[]>(){
            public int compare(int a[],int b[]){
                if(a[0]==b[0])
                    return a[1]-b[1];
                return a[0]-b[0];
                }
            };
        Arrays.sort(rectangles,co);
        
        //store length in some array
        int lenOfRect[]=new int[rectangles.length];
        for(int i=0;i<rectangles.length;i++){
            lenOfRect[i]=rectangles[i][0];
            System.out.println(lenOfRect[i]);
        }
        
        //store height
        int numberOfRectAtHeightP[][]=new int[rectangles.length][101];
        
        for(int p=0;p<=100;p++){  //height 
            int rect=0;
            for(int i=0;i<rectangles.length;i++){
                int h=rectangles[i][1];
                if(h>=p)
                    rect++;
               numberOfRectAtHeightP[i][p]=rect; 
            }
        }
        int res[]=new int[points.length];
        //finding rect
        int val=0;
        for(int i=0;i<points.length;i++){
           int startOfRect=binarySearch(lenOfRect,points[i][0]);
            //int res1[]={1,1,1,1,3};
                       //int startOfRect=binarySearch(res1,1);

          System.out.println(startOfRect);
            if(startOfRect==0){
              val=numberOfRectAtHeightP[lenOfRect.length-1][points[i][1]];
                
            }
            else
            {
                val=numberOfRectAtHeightP[lenOfRect.length-1][points[i][1]]-numberOfRectAtHeightP[startOfRect-1][points[i][1]];
            }
            res[i]=val;
            //System.out.println("val :"+val);
        }
        return res;
        
        
        
        
        
        
    }
    
    //binarySearch
    public int binarySearch(int arr[],int target){
        int ans=arr.length;
        int start=0;
        int end=arr.length-1;
       
         //System.out.println("target :"+target); 
        while(start<=end){
            int mid=(start+end)/2;
              
             if(arr[mid]>=target)
            {ans=mid;
              //System.out.println("inside this >"); 
                end=mid-1;
            
        }
            else{
                  //System.out.println("inside this <"); 
                start=mid+1;
                
            }
        }
       //System.out.println("xdfcgvhbjnkml"); 
        
       return ans; 
        
        
        
        
    }
}