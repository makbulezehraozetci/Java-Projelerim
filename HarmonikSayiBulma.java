import java.util.Scanner;
public class HarmonikSayiBulma {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        double sayi,harmonik=1;
        System.out.print("Sayı giriniz: ");
        sayi = inp.nextInt();

        for(int i=2 ; i<=sayi; i++){
            harmonik += 1/(sayi);
        }
        System.out.print("Harmonik toplam: "+harmonik);


    }
}
