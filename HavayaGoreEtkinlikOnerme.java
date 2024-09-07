import java.util.Scanner;

public class HavayaGoreEtkinlikOnerme {
    public static void main(String args[]){

        Scanner inp = new Scanner(System.in);

        int sicaklik;
        System.out.print("Hava sıcaklığını giriniz: ");
        sicaklik = inp.nextInt();

        if(sicaklik < 5 ){
            System.out.print("Kayak yapabilirsin");
        }
        else if(sicaklik >= 5 && sicaklik < 15){
            System.out.print("Sinemaya gidebilirsin");
        }
        else if(sicaklik >= 15 && sicaklik < 25){
            System.out.print("Pikniğe gidebilirsin");
        }
        else if(sicaklik >= 25){
            System.out.print("Yüzmeye gidebilirsin");
        }



    }





}
