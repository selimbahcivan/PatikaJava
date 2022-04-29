import java.util.Scanner;

public class PowerWithRecursive {
    static int power (int x, int y) {
        if( y == 1 ){
            return x;
        }
        return power(x,y-1) * x ; 
        
    }
    public static void main(String[] args) {
        int base , expo; 
        Scanner inp = new Scanner(System.in);

        System.out.print("Base : ");
        base = inp.nextInt();
        System.out.print("Exponential : ");
        expo = inp.nextInt();

        System.out.println(base + " üssü " + expo + " = " + power(base, expo));
    }
}