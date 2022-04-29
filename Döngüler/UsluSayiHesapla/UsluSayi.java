import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args) {
        int n,e,total=1;
        Scanner inp = new Scanner (System.in);

        System.out.print("Üssü alınacak sayı : ");
        n = inp.nextInt();

        System.out.print("Üs olacak sayı : ");
        e = inp.nextInt();

        if(e != 0){
            for(int i=1; i <= e ; i++){
                total *= n ;
            }
            System.out.print("Sonuç : " +total);
        }
        else{
            System.out.print("Sonuç : " + 1);
        }
    }
}