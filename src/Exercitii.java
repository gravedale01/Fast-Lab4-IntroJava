/**
 * Created by cata on 10/22/2016.
 */
public class Exercitii {
    public static void main(String[] args) {

        /*int a=SkeletonJava.readIntGUI("introdu primul numar");
        int b=SkeletonJava.readIntGUI("introdu al doilea numar");
        int c=SkeletonJava.readIntGUI("introdu al treilea numar");
        int d=SkeletonJava.readIntGUI("introdu al patrulea numar");
        int e=SkeletonJava.readIntGUI("introdu al cincilea numar");
        double avg = (a+b+c+d+e)/5.0;
        SkeletonJava.printGUI("media este:" +avg);*/

        /*int max=SkeletonJava.readIntGUI("cate vrei:");

        int suma=0;
        for(int i=0; i<max; i++) {

            int val = 1+1;
            int nrCurent=SkeletonJava.readIntGUI("introduceti numarul" + val + ":");
            suma = suma + nrCurent;
        }
        double avg = suma/(double)max;

        SkeletonJava.printGUI("media este:"+avg);*/


        /*int suma=0; //suma numerelor
        int counter=0; //numar de cate ori citesc
        while(true) {//iterez la infinit
            counter++; //maresc cu unu contorul
            int nrCurent = SkeletonJava.readIntGUI("introduceti numarul" + counter +":");
            if(nrCurent<0) { //conditia de iesire din while
                counter--; //pt a nu considera la medie acest ultim numar
                break;
            }
            suma = suma + nrCurent; // suma este suma dinainte plus numarul curent, a
        }
        double avg = suma/(double)counter; //media

        SkeletonJava.printGUI("media este:"+avg);*/

        int max=0;
        int counter=0;
        while(true) {
            counter++;
            int nrCurent = SkeletonJava.readIntGUI("introduceti numarul" + counter +":");
            if(nrCurent<0) {
                counter--;
                break;
            }
            if(max<nrCurent)
                max=nrCurent;
        }

        SkeletonJava.printGUI("max este:"+max);

    }
}
