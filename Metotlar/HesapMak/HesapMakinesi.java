import java.util.Scanner;

public class HesapMakinesi {
    
    static void plus() {
        Scanner inp = new Scanner (System.in);
        int number, result = 0, i = 1 ;
        System.out.println("Girilen sayıları toplamak için 0 ' a basın !");
        while (true) {
            System.out.print(i++ + ". sayı : ");
            number = inp.nextInt();
            
            if(number == 0){
                break;
            }
            result += number ;
        }
        System.out.println("Sonuç : " +result);
    }

    static void minus() {
        Scanner inp = new Scanner (System.in);
        int number, result = 0;
        System.out.println("Girilen sayılar ilk sayıdan çıkarılacaktır !");
        System.out.print("Kaç tane sayı gireceksiniz :");
        int total = inp.nextInt();
        for(int i = 1 ; i <= total ; i++ ){
            System.out.print(i + ". sayı : ");
            int t = inp.nextInt();

            if( i == 1){
                result += t ;
            }
            else {
                result -= t ;
            }
        }
        System.out.println("Sonuç : " +result);
    }

    static void times() {
        Scanner inp = new Scanner (System.in);
        int number, result = 1;
        System.out.print("Kaç tane sayı gireceksiniz :");
        int total = inp.nextInt();
        for(int i = 1 ; i <= total ; i++ ){
            System.out.print(i + ". sayı : ");
            int t = inp.nextInt();
            result *= t;
        }
        System.out.println("Sonuç : " +result);
    }

    static void divided() {
        Scanner inp = new Scanner (System.in);
        double number, result = 0.0;

        System.out.print("Kaç tane sayı gireceksiniz :");
        int counter = inp.nextInt();

        for(int i = 1 ; i <= counter ; i++ ){
            System.out.print(i + ". sayı : ");
            number = inp.nextDouble();

            if(i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if(i == 1){
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç : " +result);
    }

    static void power() {
        Scanner inp = new Scanner (System.in);
        System.out.print("Taban değerini giriniz : ");
        int base = inp.nextInt() ; 

        System.out.print("Üs değerini giriniz : ");
        int exp = inp.nextInt() ; 

        double result = 1 ;
        if(exp > 0) {
            for(int i = 1 ; i <= exp ; i++ ) {
                result *= base ;
            }
            System.out.println("Sonuç : " + result);
        }
        else{
            for(int i = -1 ; i >= exp ; i--){
                result *= base;
            }
            System.out.println("Sonuç : " + (1 / result));
        }
    }

    static void factorial() {
        Scanner inp = new Scanner (System.in);
        int result = 1;
        System.out.print("Faktöriyel değerini giriniz : ");
        int n = inp.nextInt() ; 
        for(int i = 1 ; i <= n ; i++) {
            result *= i;
        }
        System.out.println("Sonuç : " + result);
    }

    static void mode() {
        Scanner inp = new Scanner (System.in);
        double result = 0.0;
        while(true){
            System.out.print("Modu alınacak sayı : ");
            double n = inp.nextDouble();
            System.out.print("Mod : ");
            double m = inp.nextDouble();
            if(m == 0) {
                System.out.print("Mod 0 olamaz !");
                break;
            }
            result = n % m;
            break;  
        }
        System.out.println(result);
        
    }

    static void areaPerimeter(){
        Scanner scan = new Scanner(System.in); 
        System.out.print("Kısa kenarı giriniz: ");
        int sh = scan.nextInt();
        System.out.print("Uzun kenarı giriniz: ");
        int lo = scan.nextInt();

        int perimeter = 2 * sh + 2 * lo;
        int area = sh * lo;

        System.out.println("Çevre: " + perimeter + "\nAlan: " + area); 
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8: 
                    areaPerimeter();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }


}