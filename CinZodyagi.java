import java.util.Scanner;
public class CinZodyagi {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int dogumtarih;
        System.out.print("Doğum tarihinizi giriniz: ");
        dogumtarih = inp.nextInt();
        if(dogumtarih %12 == 0){
            System.out.print("Çin zodyağınız Maymun ");
        }
        else if(dogumtarih %12 == 1){
            System.out.print("Çin zodyağınız Horoz ");
        }
        else if(dogumtarih %12 == 2){
            System.out.print("Çin zodyağınız Köpek ");
        }
        else if(dogumtarih %12 == 3){
            System.out.print("Çin zodyağınız Domuz ");
        }
        else if(dogumtarih %12 == 4){
            System.out.print("Çin zodyağınız Fare ");
        }
        else if(dogumtarih %12 == 5){
            System.out.print("Çin zodyağınız Öküz ");
        }
        else if(dogumtarih %12 == 6){
            System.out.print("Çin zodyağınız Kaplan ");
        }
        else if(dogumtarih %12 == 7){
            System.out.print("Çin zodyağınız Tavşan ");
        }
        else if(dogumtarih %12 == 8){
            System.out.print("Çin zodyağınız Ejderha ");
        }
        else if(dogumtarih %12 == 9){
            System.out.print("Çin zodyağınız Yılan ");
        }
        else if(dogumtarih %12 == 10){
            System.out.print("Çin zodyağınız At ");
        }
        else if (dogumtarih % 12 == 11) {
            System.out.print("Çin zodyağınız Koyun ");
        }



    }
}
