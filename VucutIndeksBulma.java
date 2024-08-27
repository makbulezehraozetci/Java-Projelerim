import java.util.Scanner;
public class VucutIndeksBulma {
    public static void main (String args[]){
        Scanner inp = new Scanner (System.in);
        double kilo,boy,indeks;
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = inp.nextDouble();
        System.out.print("Lütfen boyunuzu giriniz: ");
        boy = inp.nextDouble();

        indeks = kilo / (boy*boy);
        System.out.print("Vücut kitle indeksiniz: "+indeks);



    }
}
