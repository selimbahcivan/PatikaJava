import java.util.Scanner;
public class dairealan{
    public static void main(String[] args) {
        double pi = 3.14;
        int r,a;
        Scanner inp = new Scanner (System.in);

        System.out.print("Yarıçapı Giriniz : ");
        r = inp.nextInt();

        System.out.print("Açıyı Giriniz : ");
        a = inp.nextInt();

        double alan = (pi * (r*r) * a) / 360 ;

        System.out.print("Alan : " +alan);


    }
}