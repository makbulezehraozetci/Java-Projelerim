import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        //Bir sayının kendisi hariç pozitif tam sayı çarpanları
        // (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
        int sayi,toplam=0;
        System.out.print("Sayı giriniz: ");
        sayi = inp.nextInt();
        for(int i=1 ; i<sayi ; i++){
            if(sayi%i == 0){
                toplam += i;
            }
        }
        if(toplam == sayi){
            System.out.print("Girdiğiniz sayı mükemmel sayıdır");
        }
        else{
            System.out.print("Girdğiniz sayı mükemmel sayı değildir");
        }



    }
}
