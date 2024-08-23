import java.util.Scanner;
public class KdvTutari {
    public static void main(String[] args)  {
        double girilenfiyat, kdvlifiyat,kdvtutari;
        Scanner inp = new Scanner (System.in);
        System.out.print("Ürün fiyatını giriniz: ");
        girilenfiyat = inp.nextInt();
        if(girilenfiyat<=1000){
            kdvlifiyat = girilenfiyat + (girilenfiyat * 18 / 100);
        }
        else{
            kdvlifiyat = girilenfiyat + (girilenfiyat * 8 / 100);
        }
        System.out.println("Kdv'siz Fiyat: "+girilenfiyat);
        System.out.println("Kdv'li Fiyat: " +kdvlifiyat);
        kdvtutari=kdvlifiyat-girilenfiyat;
        System.out.print("Kdv tutarı: "+kdvtutari);




    }
}
