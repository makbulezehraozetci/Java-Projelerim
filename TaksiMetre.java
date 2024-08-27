import java.util.Scanner;
/*Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.*/
public class TaksiMetre {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
       double kmbasi=2.20;
       double acilisucreti = 10;
       double gidilenkm;
       double tutar;
       System.out.print("Gidilen kilometreyi giriniz: ");
       gidilenkm = inp.nextDouble();
       if (gidilenkm<=10/2.20){
           tutar = 20;
       }
       else{
           tutar = acilisucreti + (gidilenkm * kmbasi);
       }
       System.out.println("Ödeyeceğiniz ücret: "+tutar);

    }
}
