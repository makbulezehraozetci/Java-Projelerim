import java.util.Scanner;
public class DortveBesKuvvetYazdiran {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int n,i,j;
        System.out.print("Sınır sayıyı giriniz: ");
        n = inp.nextInt();
        System.out.println("Dördün kuvvetleri: ");
        for(i=1; i<n; i*=4){
            System.out.println(" "+i);
        }
        System.out.println("Beşin kuvvetleri: ");
        for(j=1; j<n; j*=5){
            System.out.println(" "+j);
        }



    }
}
