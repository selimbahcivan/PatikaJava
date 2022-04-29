import java.util.Scanner;
public class MinMax{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,min=0,max=0;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = inp.nextInt();

        for(int i = 1; i <= n; i++ ){ 
            System.out.print(i+". Sayıyı giriniz : ");
            int num = inp.nextInt();
           
            if(i == 1){
                min = num ; 
                max = num ;
            }
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }
        System.out.println("Max : " +max);
        System.out.print("Min : " +min);
            

    }
}