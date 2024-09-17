import java.util.Scanner;
public class Kombinasyon {
    public static void main(String args[]){

        Scanner inp = new Scanner(System.in);
        int n,r,kombinasyon=1,nkomb=1,rkomb=1,nrkomb=1;
        System.out.print("N sayısını giriniz: ");
        n = inp.nextInt();
        System.out.print("R sayısını giriniz: ");
        r = inp.nextInt();
        //kombinasyon = nkomb / (rkomb * nrkomb);
        for(int i=1 ; i<=n ; i++){
            nkomb *= i;
        }
        for(int i=1 ; i<=r ; i++){
            rkomb *= i;
        }
        for(int i=1 ; i<=n-r ; i++){
            nrkomb *= i;
        }
        kombinasyon = nkomb / (rkomb * nrkomb);


        System.out.print("Kombinasyon: "+kombinasyon);
    }
}
