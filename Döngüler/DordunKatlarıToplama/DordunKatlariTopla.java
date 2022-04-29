import java.util.Scanner;
public class DordunKatlariTopla{
    public static void main(String[] args) {
        int n, total = 0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Bir Sayı Giriniz : ");
            n = inp.nextInt();
            if(n % 4 == 0){
                total += n;
            }
        } while(n > 0 && n % 2 == 0);
        
        System.out.print("Toplamları : " +total);
    }
}