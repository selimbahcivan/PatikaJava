import java.util.Scanner;
public class kullaniciGirisi {
    public static void main(String[] args) {
        String userName,password;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adını Giriniz : ");
        userName = input.nextLine();

        System.out.print("Şifrenizi Giriniz : ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("Selim")){
            System.out.print("Başarıyla Giriş Yaptınız !!!");
        }
        else {
            System.out.print("Şifreniz Yanlış, Sıfırlamak için R'ye Çıkmak için Q'ya basın ! : ");
            
            String sifirlama = input.nextLine();
            if(sifirlama.equals("R") || sifirlama.equals("r")) {
                System.out.print("Yeni Şifrenizi Giriniz : ");
                password = input.nextLine();
                if(password.equals("Selim")){
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else {
                    System.out.print("Şifre Oluşturuldu");
                }      
            }
            else if(sifirlama.equals("Q") || sifirlama.equals("q")) {
                System.out.print("Çıkış Yapılıyor...");
            }
        }
    }
}