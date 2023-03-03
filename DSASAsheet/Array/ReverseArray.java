import java.util.*;
public class ReverseArray 
{


    public static void reverseArray(int a[], int n)
    {
      for(int i= 0 ,j= n-1;i<n/2;i++, j-- ){
         int temp  = a[i];
         a[i] = a[j];
         a[j] = temp;
        
      
      for (int x : a) 
        System.out.print(x +" ");
        System.out.println(" ");
        
        
      
    }





    }
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);


        System.out.println("enter the size of array");
        int n = sc.nextInt();
        System.out.println("enter the " + n+ " element");
        int[] a = new int[n] ;
        for(int i =0 ; i< n ; i++)
        {
            a[i] = sc.nextInt();
            
        }
        reverseArray(a,n);
        
    }

    
}
