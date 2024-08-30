import java.util.Scanner;

    public class HesapMakinesi {
        public static void main(String args[]){
            Scanner inp = new Scanner(System.in);
            int sayi1,sayi2,select;
            System.out.print("Sayı giriniz: ");
            sayi1 = inp.nextInt();
            System.out.print("Sayı giriniz: ");
            sayi2 = inp.nextInt();
            System.out.println("Toplama işlemi için 1 e basınız lütfen!");
            System.out.println("Çıkarma işlemi için 2 ye basınız lütfen!");
            System.out.println("Çarpma işlemi için 3 e basınız lütfen!");
            System.out.println("Bölme işlemi için 4 e basınız lütfen!");
            System.out.print("Seçiminizi yapınız: ");
            select = inp.nextInt();
            switch(select){
                case 1 :
                    System.out.print("Toplama işlemi yapılıyor: ");
                    System.out.print("Sonuc: "+ (sayi1+sayi2));
                    break;
                case 2 :
                    System.out.print("Çıkarma işlemi yapılıyor: ");
                    System.out.print("Sonuc: "+  (sayi1 - sayi2));
                    break;
                case 3 :
                    System.out.print("Çarpma işlemi yapılıyor: ");
                    System.out.print("Sonuc: "+ (sayi1 * sayi2));
                    break;
                case 4 :
                    System.out.print("Bölme işlemi yapılıyor: ");
                    System.out.print("Sonuc: "+ (sayi1 / sayi2));
                    break;

        }
}
    }
