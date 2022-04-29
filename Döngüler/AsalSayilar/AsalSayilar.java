import java.util.Scanner;
public class AsalSayilar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in) ;
        boolean bool;

        for(int i = 2 ; i <= 100 ; i++ ){
            
            bool = false;

            for(int j = 2 ; j <= i / 2 ; j++){
                
                if( i % j == 0){
                    bool = true;
                    break;
                }
            }
            if(!bool){
                System.out.print(i + " ");
            }
        }
    }
  
}