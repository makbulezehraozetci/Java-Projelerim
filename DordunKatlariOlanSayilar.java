import java.util.Scanner;

public class DordunKatlariOlanSayilar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int i, toplam = 0;
        do {
            System.out.print("Sayı giriniz: ");
            i = inp.nextInt();

            if(i % 4 == 0){
                toplam += i;
            }
        } while(i % 2 == 0);

        System.out.print("Toplam: " + toplam);
    }
}
