import java.util.Scanner;
/*Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
 toplam tutarını ekrana yazdıran programı yazın.*/

public class ManavKasa {
    public static void main (String args[]){
        Scanner inp = new Scanner(System.in);
        double armut,elma,domates,muz,patlican,a,b,c,d,e,tutar;

        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlican = 5.00;
        System.out.print("Armutun kilosunu giriniz: ");
        a = inp.nextDouble();
        System.out.print("Elmanın kilosunu giriniz: ");
        b = inp.nextDouble();
        System.out.print("Domatesin kilosunu giriniz: ");
        c = inp.nextDouble();
        System.out.print("Muzun kilosunu giriniz: ");
        d = inp.nextDouble();
        System.out.print("Patlıcanın kilosunu giriniz: ");
        e = inp.nextDouble();
        tutar = armut*a + elma*b + domates*c + muz*d + patlican*e;

        System.out.print("Ödemeniz gereken ücret: " +tutar);




    }
}
