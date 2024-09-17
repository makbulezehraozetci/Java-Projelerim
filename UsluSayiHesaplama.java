import java.util.Scanner;
public class UsluSayiHesaplama {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        /*Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.*/
        int taban,us,total=1,sayac=0;
        System.out.print("Taban giriniz: ");
        taban = inp.nextInt();
        System.out.print("Üs giriniz: ");
        us = inp.nextInt();

        for(int i=taban; sayac<us ; ){
            total *= i;
            sayac++;

        }
        System.out.print("Girdiğiniz sayının üssü: "+total);



    }
}
