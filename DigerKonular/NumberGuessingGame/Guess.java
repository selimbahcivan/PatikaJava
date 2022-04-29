import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int) ( Math.random() * 100 );
        
        Scanner inp = new Scanner(System.in);
        int right = 0 ;
        int selected;
        int[] wrongList = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);

        while ( right < 5 ) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = inp.nextInt();

            if( selected < 0 || selected > 99 ) {
                System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz ! ");
                if( !isWrong ) {
                    isWrong = true;
                    System.out.println("Bir dahaki hatalı girişinizde hakkınızdan düşülecektir ! ");
                }
                else {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5-right));
                    
                }    
               
                continue;
            }

            if ( selected == number ) {
                System.out.println("Tebrikler doğru tahmin ! Tahmin ettiğiniz sayı : " +selected);
                isWin = true;
                break;
            }
            else {
               
                System.out.println("Bilemediniz ! ");
                if(selected > number) {
                    System.out.println(" Girdiğiniz sayı gizli sayıdan büyüktür ! ");
                }
                else{
                    System.out.println("Girdiğiniz sayı gizli sayıdan küçüktür ! "); 
                }
                wrongList[right++] = selected;
                
                System.out.println("Kalan hakkınız : " + (5-right));
            } 
        
        if(!isWin ){
            System.out.println(" Kaybettiniz ! ");
            if(!isWrong){
                System.out.println(" Tahminleriniz : " + Arrays.toString(wrongList));
            }
        }
    }
    }
}

