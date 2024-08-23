import java.util.Scanner;
public class AlanBulma{
    public static void main(String[] args){

Scanner inp = new Scanner (System.in);

        int a,b,c;
        double u=0,alan=1;
        System.out.print("Üçgen kenarı giriniz: ");
        a = inp.nextInt();
        System.out.print("Üçgen kenarı giriniz: ");
        b = inp.nextInt();
        System.out.print("Üçgen kenarı giriniz: ");
        c = inp.nextInt();
        u=(a+b+c) / 2;
        alan = (double) Math.sqrt (u * (u-a)* (u-b) * (u-c));

        System.out.print("Üçgenin Alanı: "+alan);

        }
        }

