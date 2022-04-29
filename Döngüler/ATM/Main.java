import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500 , price = 0, select;
        


        while(right > 0){
            System.out.print("Kullanıcı Adı : ");
            userName = input.nextLine();
            System.out.print("Şifre : ");
            password = input.nextLine();

            if (userName.equals("Selim") && password.equals("patika123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula\n" + "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatıracağınız Miktarı Giriniz : ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekeceğiniz Miktarı Giriniz : ");
                            price = input.nextInt();
                            if(price > balance){
                                System.out.println("Yetersiz Bakiye ! ");
                            }
                            else{
                                balance -= price;
                            }
                            break;
                        case 3:
                        System.out.println("Bakiyeniz : " +balance);
                        break;    
                    }        
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }
            
            else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}