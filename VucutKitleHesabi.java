package Giris;
import  java.util.Scanner;

public class VucutKitleHesabi {

    public static  void main(String[] args){

        double boy;
        double kilo;
        double kitleHesabi;



        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz :");
        kilo= input.nextDouble();


        kitleHesabi=((kilo)/(boy*boy));


        System.out.println("Vücut Kitle İndeksiniz :"+kitleHesabi);


    }

}
