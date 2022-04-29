import java.util.Scanner;
public class BolunenSayiOrt {
    public static void main(String[] args) {
        int sayi,count=-1,total=0,avr;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        sayi = inp.nextInt();

        for(int i=0;i<=sayi;i++){
            if(i % 12 == 0){
                count += 1;
                total += i;
            }
            else{
                continue;
            }
        }
        avr = total / count ;
        System.out.print("Ortalama : " +avr);
        
    }
}