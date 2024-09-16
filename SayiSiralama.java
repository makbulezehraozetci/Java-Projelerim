import java.util.Scanner;

public class SayiSiralama {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);

        int a,b,c;
        System.out.print("Birinci sayıyı giriniz: ");
        a = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        b = inp.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        c = inp.nextInt();

        if(a>b && b>c){
            System.out.print("a > b > c");
        }
        else if(a>b && b<c){
            System.out.print("a > c > b");
        }
        else if(a<b && a>c){
            System.out.print("b > a > c");
        }
        else if(b>c && a<c){
            System.out.print("b > c > a");
        }
        else if(c>a && a>b){
            System.out.print("c > a > b");
        }
        else if(c>b && b>a){
            System.out.print("c > b > a");
        }


    }
}
