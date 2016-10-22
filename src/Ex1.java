/**
 * Created by cata on 10/22/2016.
 */
public class Ex1 {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 6, 7, 8, 10, 12, 14, 23};
        int n = 2;
        for (int i=0; i<=a.length; i++){
            if (i==a.length) {
                System.out.println(-1);
                break;
            }
            if (n==a[i]) {
                System.out.println(i);
                break;
            }

        }
    }
}
