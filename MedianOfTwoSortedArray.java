import java.util.Scanner;

public class MedianOfTwoSortedArray
 {  public static double median(int[] a  ,int[] b)
    {    double median = 0.0 ;
        int m = a.length;
        int n = b.length;
        int i = 0 , j = 0 , k = 0;
        int[] arr  = new int[m+n];

        while (i < m && j < n){
               if(a[i] < b[j]){  
                arr[k] = a[i];
                i++; k++;   
            }
            else{
                arr[k] = b[j];
                j++; k++;
            }
           if(i>m){
              while(j<n){
                arr[k] = b[j];
                j++; k++;
              } 
           }
            
           if(j>n) {
            while(i>m){
                   arr[k] = a[i];
                   i++; k++;
            }
           }
        }

        int mid = m+n ;
        if(mid%2 == 1 )
        median = arr[mid/2];
        else
        median = (arr[mid] +arr[mid-1]) /2.0 ;
        return  median ;
    }


    public static void main(String[] args) 
    {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the lenght of first array");
        
        // int m  = sc.nextInt();
        // int[] a = new int[m] ;
        // System.out.println("enter the lenght of second array");

        // int n  = sc.nextInt();
        // int[] b= new int[n] ;
        // for(int i = 0 ; i<m ; i++)
        //    a[i] = sc.nextInt();
        // for(int i = 0 ; i<n; i++)
        //  b[i] = sc.nextInt();
        //  System.out.println("The median of the element is :");
            int[] a ={2 , 3 , 4 , 8} ;
            int[] b ={4 , 11 , 6 , 8 ,9};

    
        System.out.println(median(a,b)); 
            
        
        
    }

    
}
