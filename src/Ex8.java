/**
 * Created by cata on 10/23/2016.
 */
public class Ex8 {
    public static int power(int b, int e){
        int prod=1;
        for (int i=0; i<e; i++){
            prod=prod*b;
        }
        return prod;
    }
    public static void main(String[] args) {
        int x=4;
        int n=5;
        int sum=0;
        for (int i=0; i<=n;  i++){
            sum=sum+power(x,i);
        }
        System.out.println(sum);
    }
}
