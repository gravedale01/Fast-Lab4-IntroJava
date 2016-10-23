/**
 * Created by cata on 10/23/2016.
 */
public class Ex4 {
    public static void main(String[] args) {
        while(true) {
            int nrCurent = SkeletonJava.readIntConsole("Introduceti numarul: ");
            if (nrCurent>=9 && nrCurent<=24){
                SkeletonJava.printConsole("True");
            } else
                SkeletonJava.printConsole("False");
        }
    }
}

