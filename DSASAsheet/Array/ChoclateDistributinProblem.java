import java.util.*;
public class ChoclateDistributinProblem 
{
    public static int findMinDiff(int[] a , int n , int m )
    {   int mindiff = Integer.MAX_VALUE;
        if(m==0 || n== 0)
        return 0 ;

        if(n<m)
        return 0 ;
        
        // now logic is that  we first sort the array
        Arrays.sort(a);
        // after travers array where we look on  each substring of size of  m 
        
        for(int i=0 ;i+m-1<n;i++)
        {    
            int diff = a[i+m-1] -a[i];
            if(diff< mindiff)
            mindiff = diff;


        }
 



   return mindiff ;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        System.out.println("enter the " + n + " element");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the no of studen");
        int m = sc.nextInt();
        System.out.println("the minimum diff:"+ findMinDiff(a, n , m));

    }
 
}
