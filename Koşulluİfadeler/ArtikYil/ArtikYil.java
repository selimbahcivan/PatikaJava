import java.util.Scanner;
public class ArtikYil{
    public static void main(String[] args) {
        int year;
        Scanner inp = new Scanner(System.in);
        System.out.print("Yılı Giriniz : ");
        year = inp.nextInt();
        
        if(year > 0){
            if(year % 4 == 0 && year % 100 != 0 ){
                System.out.print(year + " bir artık yıldır");
            }
            else if(year % 400 == 0){
                System.out.print(year + " bir artık yıldır");
            }
            else{
                System.out.print(year + " bir artık yıl değildir !");
            }
        }
        else{
            System.out.print("Yıl negatif olamaz !");
        }
    }
}