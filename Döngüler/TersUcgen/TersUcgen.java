import java.util.Scanner;
public class TersUcgen{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        System.out.print("Basamak Sayısını Giriniz  :");
        n = inp.nextInt();
        
       for(int i = n ; i > 0 ; i--) {

           for(int j = n ; j > i - 1 ; j--){
               System.out.print(" ");
           }

           for(int k = 1 ; k <= 2 * i - 1 ; k++){
                System.out.print("*");
           }
           System.out.println();
       }
    }
}