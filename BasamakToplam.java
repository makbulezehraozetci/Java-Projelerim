import java.util.Scanner;
public class BasamakToplam {
    public static void main(String args[]){
        Scanner inp = new Scanner (System.in);
                System.out.print("Sayı Giriniz :");
                int number = inp.nextInt();
                int basNumber = 0;
                int tempNumber = number;
                int basValue;
                int basTop=0;

                while (tempNumber != 0) {
                    tempNumber /= 10;
                    basNumber++;
                }

                tempNumber = number;
                while (tempNumber != 0){
                    basValue = tempNumber %10;
                    basTop += basValue;
                    tempNumber /= 10;

                }
                System.out.print("Basamakların Toplamı: "+basTop);

    }
}
