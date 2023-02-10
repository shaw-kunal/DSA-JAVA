import java.util.*;
public class IntersectionOf2Array2
 {
    public static void main(String[] args) {
        int[]  a = {10,2,5,8,9,8};
        int[]  b = {2,5,9,6,8,8};
        Arrays.sort(a);//2,5,8,9,10
        Arrays.sort(b);  //2 5 6 9
        int i = 0 , j = 0 , k= 0;
        ArrayList<Integer> al = new ArrayList<>();
        
        while(i < a.length  && j < b.length)
        {
            if(a[i] == b[j])
            {
                al.add(a[i]);
                i++;
                j++;
            }
            else if(a[i] > b[j])
             j++;           
            else 
               i++;
            
        }
        System.out.println(al);
        

    }
    
}
