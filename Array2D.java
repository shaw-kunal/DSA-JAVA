import java.util.Scanner;

// multiplication of matrix
public class Array2D 
{       
    
    


    public static void insertion(int[][] a) 
    {    Scanner sc = new Scanner(System.in);
        

        int row = a.length;
        int col = a[0].length;
        System.out.println(row);
        System.out.println(col);
        for(int i = 0 ; i < row; i++ )
        {
            for(int  j = 0 ; j<col; j++)
            { 
                
             a[i][j] = sc.nextInt();
           
          
            }
        }

    }
    public  static void display(int[][] array)
    {
        for(int[] a : array)
        {
            for(int a1 :a)
            {
                System.out.print(a1);
            }
            System.out.println();
        }
    } 

    public static void  multiplication(int[][] a , int[][] b , int[][] c)
    {
         for(int i=0 ; i<3 ; i++)
    {
            for(int j=0 ; j<3 ; j++)
            { 
                c[i][j] = 0 ;
                for(int k=0 ;k<3 ;k++)
                {
                    c[i][j] +=a[i][k]*b[k][j];

                } 
            }
        }

    

    }

    public static void main(String[] args) 
    {
        int a[][]  = new int[3][3];
        int b[][]  = new int[3][3];
        int c[][]  = new int[a.length][b[0].length];
        
        System.out.println("enter the  element in first  array");
        insertion(a);
        System.out.println("enter the  element in second  array");
        insertion(b);
        System.out.println("display matriz");
        display(a);
        display(b);
        multiplication(a,b,c);
        display(c);

        
    }
    
}
