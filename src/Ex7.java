/**
 * Created by cata on 10/23/2016.
 */
public class Ex7 {
    public static void main(String[] args) {
        int[] a = {11, 13, 9, 8, 16, 15};
        for (int i=0; i<a.length-1; i++){
            if (a[i]>a[i+1]) {
                SkeletonJava.printConsole (a[i]+" "+a[i+1]);
            }

        }


    }
}