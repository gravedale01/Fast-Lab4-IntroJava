/**
 * Created by cata on 10/23/2016.
 */
public class Ex3 {
    public static void main(String[] args) {
        int sum=0;
        while(true) {
            int nrCurent = SkeletonJava.readIntConsole("Introduceti numarul: ");
            if(nrCurent==0) {
                break;
            }
            if(nrCurent>4 && nrCurent<11) {
                sum = sum+nrCurent;
            }
        }
        SkeletonJava.printConsole("Suma este: " + sum);
    }
}
