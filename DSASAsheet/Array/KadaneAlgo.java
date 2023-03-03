import java.util.*;

public class KadaneAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        System.out.println("enter the " + n + " element");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = 0;
        int cur = 0;
        for (int i = 0; i < n; i++) {
            cur = cur + a[i];
            if (cur > max) {
                max = cur;
            }
            if (cur < 0) {
                cur = 0;
            }
        }
        System.out.println(max);

    }
}
