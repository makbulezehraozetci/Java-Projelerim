import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,biyoloji,tarih,müzik;
        Scanner inp = new Scanner (System.in);
        System.out.print("Mat notunuzu giriniz: ");
        mat = inp.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = inp.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();
        System.out.print("Biyoloji notunuzu giriniz: ");
        biyoloji = inp.nextInt();
        System.out.print("Tarih notunuzu giriniz: ");
        tarih = inp.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        müzik = inp.nextInt();

        float toplam = (mat + fizik + kimya + biyoloji + tarih + müzik );
        float ort =  toplam / 6;

        System.out.println("Ortalamamız: " + ort);

       String str = (ort>=60) ? "Sınıfı geçti" : "Sınıfta kaldı";

       System.out.println(str);

    }
}