import java.util.Scanner;


public class SinifGecme {
    public static void main(String args[]){

        Scanner inp = new Scanner(System.in);

        int mat,fizik,turkce,kimya,muzik,toplam=0,ort,sayac=0;

        System.out.print("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();
        if(mat<100) {
            sayac++;
            toplam += mat;
        }
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = inp.nextInt();
        if(fizik<100){
            toplam += fizik;
            sayac++;
        }
        System.out.print("Turkce notunuzu giriniz: ");
        turkce = inp.nextInt();
        if(turkce<100) {
            toplam += turkce;
            sayac++;
        }
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();
        if(kimya<100) {
            toplam += kimya;
            sayac++;
        }
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = inp.nextInt();
        if(muzik<100) {
            toplam += muzik;
            sayac++;
        }

        ort = toplam/sayac;

        System.out.print("Ortalamanız: " + ort);
        if(ort<55)
            System.out.println("Maalesef geçemediniz!");
        else{
            System.out.print("Tebrikler geçtiniz!");
        }




    }
}
