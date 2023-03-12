import java.util.*;
public class ChocolateDistributionProblem
 {
    public static void main(String[] args)
    {
        // first take the input 
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



        // find the substring of  m(no of children) 
        // select those substring which have minimum differnce
        
    }

    public static int findMinDiff(int[] a, int n, int m) {
        int mindiff =Integer.MAX_VALUE;
        if(m==0 || n==0 || n<m)
         return 0;
        //sort the array 
        Arrays.sort(a);
        
                // find the substring of  m(no of children) 

                for(int i=0 ;i+m-1<n ;i++)
                {
                    int diff =a[i+m-1] -a[i];
                    if(diff<mindiff)
                     mindiff =diff;
                }

    
        return mindiff;
    }
    
}
