import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        int x = 0 , y = 1 , z = 0;
        System.out.print("Eleman sayısı : ");
        n = inp.nextInt();
        
        for(int i = 1 ; i <= n ; i++){
            System.out.print(z + " ");
            x = y ;
            y = z ;
            z = x + y ;
        }
    }
}