import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object

        double kdv1 = 0.18;
        double kdv2 = 0.08;

        System.out.print("Tutarı Giriniz : ");

        double girilenTutar = input.nextDouble();

        System.out.println("Girilen Tutar : " + girilenTutar);

        boolean kdvOrani = (girilenTutar < 1000);

        double bindenKucuk = girilenTutar + girilenTutar * kdv1;
        double bindenBuyuk = girilenTutar + girilenTutar * kdv2;


        double kdvliTutar = (kdvOrani) ?  bindenKucuk : bindenBuyuk ;

        System.out.println("KDV'li Tutar : " +kdvliTutar);

        double kdv = (kdvOrani) ? kdv1 : kdv2 ;

        System.out.println("KDV Oranı : " + kdv );

        double kdvTutari = (kdvOrani) ? girilenTutar * kdv1 : girilenTutar * kdv2;

        System.out.println("KDV Tutarı : " + kdvTutari );

    }
}