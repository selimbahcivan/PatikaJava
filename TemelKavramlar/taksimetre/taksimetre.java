import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
        //Degiskenleri tanımladık
        int acilis = 10, km;
        int min = 20;
        double kmBasi = 2.20; 
        
        Scanner inp = new Scanner(System.in);

        System.out.print("Kilometreyi Giriniz : ");
        km = inp.nextInt();
        
        double hesap = acilis + km * kmBasi ;

        boolean yirmidenKucukse =  ( hesap < 20);

        double tutar = (yirmidenKucukse) ? min : hesap ;   

        System.out.print("Ödeyeceğiniz Tutar : " +tutar +" TL");

    }
}