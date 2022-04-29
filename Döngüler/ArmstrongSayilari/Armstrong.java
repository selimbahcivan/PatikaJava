import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");

        int number = input.nextInt();
        int digit = 0;
        int tempNum = number;
        int basValue;
        int basPow;
        int result = 0;
        while(tempNum != 0){ //1234 / 10 = 123 / 10 = 12 / 10 = 1 / 10 = 0

            tempNum /= 10;
            digit ++ ;
        }
        
        tempNum = number;

        while(tempNum != 0){
            basValue = tempNum % 10 ;
            basPow = 1;
            for(int i=1;i<=digit;i++){
                basPow *= basValue;
            }
            result += basPow;
            tempNum /= 10;
        }
        if(result == number){
            System.out.print(result + " Armstrong Sayısıdır.");
        }
        else{
            System.out.print(number + " Armstrong Sayısı Değildir !");
        }

    }
}