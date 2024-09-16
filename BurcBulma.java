import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String dogumayi;
        int dogumgun;

        System.out.print("Doğduğunuz ayı giriniz: ");
        dogumayi = inp.nextLine();
        System.out.print("Doğduğunuz günü giriniz: ");
        dogumgun = inp.nextInt();

        if ((dogumayi.equals("ocak") && dogumgun >= 1 && dogumgun <= 21) || (dogumayi.equals("aralık") && dogumgun >= 22 && dogumgun <= 31)) {
            System.out.print("Burcunuz Oğlak");
        } else if ((dogumayi.equals("ocak") && dogumgun >= 22 && dogumgun <= 31) || (dogumayi.equals("subat") && dogumgun >= 1 && dogumgun <= 19)) {
            System.out.print("Burcunuz Kova");
        } else if ((dogumayi.equals("subat") && dogumgun >= 20 && dogumgun <= 29) || (dogumayi.equals("mart") && dogumgun >= 1 && dogumgun <= 20)) {
            System.out.print("Burcunuz Balık");
        } else if ((dogumayi.equals("mart") && dogumgun >= 21 && dogumgun <= 31) || (dogumayi.equals("nisan") && dogumgun >= 1 && dogumgun <= 20)) {
            System.out.print("Burcunuz Koç");
        } else if ((dogumayi.equals("nisan") && dogumgun >= 21 && dogumgun <= 30) || (dogumayi.equals("mayıs") && dogumgun >= 1 && dogumgun <= 21)) {
            System.out.print("Burcunuz Boğa");
        } else if ((dogumayi.equals("mayıs") && dogumgun >= 22 && dogumgun <= 31) || (dogumayi.equals("haziran") && dogumgun >= 1 && dogumgun <= 22)) {
            System.out.print("Burcunuz İkizler");
        } else if ((dogumayi.equals("haziran") && dogumgun >= 23 && dogumgun <= 30) || (dogumayi.equals("temmuz") && dogumgun >= 1 && dogumgun <= 22)) {
            System.out.print("Burcunuz Yengeç");
        } else if ((dogumayi.equals("temmuz") && dogumgun >= 23 && dogumgun <= 31) || (dogumayi.equals("ağustos") && dogumgun >= 1 && dogumgun <= 22)) {
            System.out.print("Burcunuz Aslan");
        } else if ((dogumayi.equals("ağustos") && dogumgun >= 23 && dogumgun <= 31) || (dogumayi.equals("eylül") && dogumgun >= 1 && dogumgun <= 22)) {
            System.out.print("Burcunuz Başak");
        } else if ((dogumayi.equals("eylül") && dogumgun >= 23 && dogumgun <= 30) || (dogumayi.equals("ekim") && dogumgun >= 1 && dogumgun <= 22)) {
            System.out.print("Burcunuz Terazi");
        } else if ((dogumayi.equals("ekim") && dogumgun >= 23 && dogumgun <= 31) || (dogumayi.equals("kasım") && dogumgun >= 1 && dogumgun <= 21)) {
            System.out.print("Burcunuz Akrep");
        } else if ((dogumayi.equals("kasım") && dogumgun >= 22 && dogumgun <= 30) || (dogumayi.equals("aralık") && dogumgun >= 1 && dogumgun <= 21)) {
            System.out.print("Burcunuz Yay");
        } else {
            System.out.print("Geçersiz bir tarih girdiniz.");
        }
    }
}
