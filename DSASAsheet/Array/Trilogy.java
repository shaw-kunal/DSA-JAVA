class Trilogy
{
    public static int subarray(int[] a)
    {
         int maxp =-1000000000;
         int maxs =-1000000000;
         int max =-1000000000;
         int n = a.length;
         int iop = 0 , ios=0 ; 


        //find the   maximum sum of prefix
         int currsum = 0 ;
         for(int i=0 ; i<n-2; i++ )
         {
             currsum += a[i]; 
             
             if(currsum > maxp){
               maxp = currsum; 
               System.out.print(maxp +" ");

             }
             else{
                iop =i;
                break;
                
             }
         }

System.out.println("afterprefix");
            currsum = 0 ;
         // find the  maximum subarrry from suffix
          for(int i= n-1;i>1; i--)
          { 
            currsum +=a[i];
            
            if(currsum > maxs)
            {
                maxs =currsum;
                System.out.print(maxs +"maxs "+ios + " "+ i +"  ");
            }
            else
            {  System.out.println(ios +" ---"+i);
                ios = i ;
                break;
            }

             
          }
          System.out.println("aftersuffix");
          System.out.println(ios+""+iop);

          if(ios==iop)
            {
                max = a[iop];

                return max+maxp+maxs;
            }
            System.out.println("check");

            // find the subarray from the middle 
            
            for(int i = iop ; i<ios; i++ )
            {
               currsum +=a[i];
               System.out.print(max+" ");

               if(currsum >max)
               {
                  max = currsum;
               }
               if(currsum < 0 )
               {
                currsum = 0 ;
               }
            }
            return max+maxp+maxs;

    }
    public static void main(String[] args)
     { 
        int[] a ={ 34 , -77 , 54, -100 };
        System.out.println(subarray(a));


          
    }
}