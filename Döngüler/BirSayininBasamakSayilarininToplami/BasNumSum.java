import java.util.Scanner;
public class BasNumSum{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int num = inp.nextInt();
        int digit = 0, total = 0,tempNum;

        tempNum = num;
        while(tempNum != 0){  //1234 
           int basValue = tempNum % 10 ;
           total += basValue;
           tempNum /= 10;
        }
        System.out.print(num + " sayısının rakamları toplamı : " +total);





        
    }
}