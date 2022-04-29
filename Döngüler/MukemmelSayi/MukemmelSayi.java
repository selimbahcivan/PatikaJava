import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, total = 0;
        System.out.print("Bir Sayı Giriniz : ");
        n = inp.nextInt();

        for(int i = 1 ; i < n ; i++){
            if(n % i == 0 ){
                total += i ;
            }
        }
        if(n == total){
            System.out.print( n + " Mükemmel Sayıdır");
        }
        else{
            System.out.print( n + " Mükemmel Sayı Değildir");

        }
    }
}