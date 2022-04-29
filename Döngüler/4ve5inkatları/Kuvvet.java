import java.util.Scanner;
public class Kuvvet {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Sınır sayısını giriniz : ");
        n = inp.nextInt();
        if(n <= 1){
            System.out.print("Geçersiz sayı !");
        }
        else{
        System.out.println("Dördün Katları");
        for(int i=1;i <= n;i*=4){
            if(i != 1)

            System.out.println(i);
        }
        
        System.out.println("Beşin Katları");
        for(int k=1;k<=n;k*=5){
            if(k != 1){
            System.out.println(k);
            }
        }
    }
                
        

    }
}