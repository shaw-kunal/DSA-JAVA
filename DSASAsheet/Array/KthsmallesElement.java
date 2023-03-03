import java.util.*;

// Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. 
// It is given that all array elements are distinct.
 
public class KthsmallesElement 
{
     

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
        Arrays.sort(a);
        System.out.println("enter the value of k");
        int k = sc.nextInt();
        
        System.out.println(a[k-1]);
        

    }
    
}
