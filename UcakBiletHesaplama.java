import java.util.Scanner;

public class UcakBiletHesaplama {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);

        int mesafe, yas, yolculuktipi;
        double tutar = 0, yasindirimi = 0, sontutar = 0, tip2indirim = 0;

        System.out.println("Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır!");

        System.out.print("Gideceğiniz mesafeyi giriniz km cinsinden: ");
        mesafe = inp.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = inp.nextInt();

        if (mesafe <= 0 || yas <= 0) {
            System.out.print("Hatalı veri girdiniz!");
            return;
        }

        System.out.print("Yolculuk tipinizi giriniz (1: Tek Yön, 2: Gidiş-Dönüş): ");
        yolculuktipi = inp.nextInt();

   
        if (yolculuktipi != 1 && yolculuktipi != 2) {
            System.out.print("Hatalı yolculuk tipi girdiniz!");
            return;
        }

        tutar = mesafe * 0.10;

        switch (yolculuktipi) {
            case 1: 
                if (yas < 12) {
                    yasindirimi = tutar * 0.50;
                } else if (yas >= 12 && yas < 24) {
                    yasindirimi = tutar * 0.10;
                } else if (yas > 65) {
                    yasindirimi = tutar * 0.30;
                }
            
                sontutar = tutar - yasindirimi;
                System.out.print("Ödeyeceğiniz tutar: " + sontutar + " TL");
                break;

            case 2: 
                if (yas < 12) {
                    yasindirimi = tutar * 0.50;
                } else if (yas >= 12 && yas < 24) {
                    yasindirimi = tutar * 0.10;
                } else if (yas > 65) {
                    yasindirimi = tutar * 0.30;
                }
            
                sontutar = tutar - yasindirimi;
               
                tip2indirim = sontutar * 0.20;
                sontutar = (sontutar - tip2indirim) * 2;
                System.out.print("Ödeyeceğiniz tutar: " + sontutar + " TL");
                break;

            default:
                System.out.print("Geçersiz yolculuk tipi!");
        }
    }
}
