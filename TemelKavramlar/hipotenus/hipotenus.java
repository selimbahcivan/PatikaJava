import java.util.Scanner;

public class hipotenus {
  public static void main(String[] args) {

        int x,y;
        double z;

        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci Dik Kenarı Giriniz : ");
        x = inp.nextInt();

        System.out.print("İkinci Dik Kenarı Giriniz : ");
        y = inp.nextInt();

        z = Math.sqrt((x*x+y*y));

        System.out.println("Hipotenüs = " +z);

    }
}