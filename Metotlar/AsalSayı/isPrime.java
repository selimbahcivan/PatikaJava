import java.util.Scanner;

public class isPrime{
    static boolean isPrime(int x , int y){
        if(x == 1){
            return false;
        }
        if(y >= x) {
            return true;
        }
        if(x % y == 0){
            return false;
        }
        else {
            return isPrime(x, y+1);
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int n = inp.nextInt();
        System.out.print(isPrime(n,2) ? n + " Asal Sayıdır" : n + " Asal Sayı Değildir ");
    }
}