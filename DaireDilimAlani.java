import java.util.Scanner;
public class DaireDilimAlani {
    public static void main (String args[]){
        Scanner inp = new Scanner(System.in);
        double yaricap, merkezaci,r=0,a=0,alan;
        yaricap = r;
        merkezaci = a;
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = inp.nextDouble();
        System.out.print("Merkez açının ölçüsünü giriniz: ");
        a = inp.nextDouble();

        double pi = 3.14;

        alan = (pi * (r*r) * a) / 360;
        System.out.print("Daire diliminin alanı: "+ alan);









    }
}
