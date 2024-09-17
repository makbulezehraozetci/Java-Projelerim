import java.util.Scanner;
public class UcVeDordeTamBolunenSayilariHesaplama {
    /*1-Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların
     ortalamasını hesaplayan programı yazınız.*/
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int i,n,toplam=0,sayac=0;
        System.out.print("N sayısını giriniz: ");
        n = inp.nextInt();
        double ort=1;
        for(i=0 ; i<n ; i++){
            if(i%3 == 0 && i%4 == 0){
                sayac++;
                toplam += i;
                ort = toplam/sayac;
            }
        }
        System.out.print("Ortalama: "+ort);



    }
}
