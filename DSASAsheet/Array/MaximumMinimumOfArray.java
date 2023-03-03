import java.util.*;
public class MaximumMinimumOfArray
 {
    public static void solve(int a[]  , int n )
    { int max , min ;
        if(n ==1)
            max= min = a[0];

       else {
        if(a[0] > a[1]) {
                max =a[0]; min = a[1];
        }
        else{
         max =a[0]; min = a[1];
        }
        for(int i = 2 ; i <n ; i++)
        {
            if(a[i] >max)
             max = a[i];
             if(a[i] < min)
             min = a[i];
        }

       }
       System.out.println("maximum element is :" + max);
       System.out.println("minimum element is :" + min);


        









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
        solve(a, n);






        
    }

    
}
