import java.util.Scanner;
public class Desen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int n = inp.nextInt();
        DecInc(n , n, true);

        
    }

    static void DecInc(int n , int temp, boolean x) {
        
        if (temp <= 0) {
            x = false;
        }
        int nextStep = x ? (temp - 5) : (temp + 5) ; 
        if(nextStep <= n){
            DecInc(n, nextStep, x);
        } 
        System.out.print(temp + " ");
    }
}