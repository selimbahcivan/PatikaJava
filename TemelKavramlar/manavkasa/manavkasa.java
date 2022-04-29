import java.util.Scanner;

import java.util.Scanner;
public class manavkasa {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5;
        double tutar = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? :");
        int armkg = inp.nextInt();
        tutar += armkg * armut;

        System.out.print("Elma Kaç Kilo ? :");
        int elmkg = inp.nextInt();
        tutar += elmkg * elma;

        System.out.print("Domates Kaç Kilo ? :");
        int domkg = inp.nextInt();
        tutar += domkg * domates;

        System.out.print("Muz Kaç Kilo ? :");
        int muzkg = inp.nextInt();
        tutar += muzkg * muz;

        System.out.print("Patlıcan Kaç Kilo ? :");
        int patkg = inp.nextInt();
        tutar += patkg * patlican;

        System.out.print("Toplam Tutar :" +tutar);
        

    }
}
