import java.util.Scanner;
public class Harmonik {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("N Sayısını Giriniz : ");
        int n = inp.nextInt();
        double total = 0.0;
        for(int i=1;i<=n;i++){
            total += (1.0/i); 
        }
        System.out.print("Toplam : " +total);
    }
}