import java.util.Scanner;
public class YildizUcgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Satır Sayısını Giriniz :");
        int n = inp.nextInt();

        for(int i = 1; i<=n;i++){
            for(int k = 1; k <= (n - i) ; k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i)-1;j++ ){
                System.out.print("*");     
            }
            System.out.println(); 
        }
        for(int i = n-1;i>0;i--){
            for(int x = n ; x > i ; x--){
                System.out.print(" ");
            }
            for(int y = 1 ; y <= (2*i)-1; y++ ){
                System.out.print("*"); 
            }
            System.out.println(); 
        }
    }
}