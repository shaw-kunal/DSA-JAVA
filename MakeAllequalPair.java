
import java.util.*;
import java.lang.*;
import java.io.*;
public class MakeAllequalPair
 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
            int n = sc.nextInt();
            int arr[] = new int[n];
            int fre[] = new int[10001];
            for(int i = 0 ; i<n ; i++)
            {
                arr[i] = sc.nextInt();
                fre[arr[i]]++;
            }
            Arrays.sort(fre);
            for(int a1: fre)
            System.out.print(a1+" ");
            System.out.println(n-fre[1000]);
		    
		}
		
	}

    
}
