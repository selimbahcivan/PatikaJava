import java.util.Scanner;
public class Kombinasyon{
    public static void main(String[] args) {
        int n,r,x=1,comb,y=1;
        Scanner inp = new Scanner(System.in);
        
        System.out.print("n : ");
        n = inp.nextInt();
        System.out.print("r : ");
        r = inp.nextInt();
        if(n > 0 && r > 0 && n > r){
            for(int i = n; i > n-r; i-- ) {
                
                x *= i; 

            }
            for(int k = r; k > 0; k--){
                y *= k;
            }
            comb = x / y ;

            System.out.print(comb);
        }
        else if (n == r || r == 0){
            System.out.print(1);
        }
        else{
            System.out.print("Hatalı bir sayı girdiniz !");
            
        }

    }
}