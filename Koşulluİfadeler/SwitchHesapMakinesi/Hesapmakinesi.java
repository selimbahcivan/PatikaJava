import java.util.Scanner;
public class Hesapmakinesi {
    public static void main(String[] args) {
        int s1,s2,s3,select;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz : ");
        s1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        s2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak İstediğiniz İşlemi Seçiniz : ");
        select = input.nextInt();

        switch(select) {
            case 1:
                s3 = s1 + s2;
                System.out.print("İki sayının toplamı : " +s3);
                break;
            case 2:
                s3 = s1-s2;
                System.out.print("İki sayının farkı : " +s3);
                break;
            case 3:
                s3 = s1 * s2;
                System.out.print("İki sayının çarpımı : " +s3);
                break;
            case 4:
                if(s2 != 0){
                s3 = s1 / s2;
                System.out.print("İki sayının bölümü : " +s3);
                }
                else{
                    System.out.print("Sıfıra Bölünemez!!!");
                }
                break;

        }
    }
}
