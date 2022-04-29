import java.util.Scanner;
public class BiletHesaplama {
    public static void main(String[] args) {
        int dist,age,type;
        double per = 0.10, total = 0;
        
        Scanner input = new Scanner (System.in);

        System.out.print("Mesafeyi Giriniz (km) : ");
        dist = input.nextInt();

        System.out.print("Yaşınızı Giriniz : ");
        age = input.nextInt();

        System.out.print("Yolculuk Tipini Seçiniz\nTek Yön için 1'e basınız.\nGidiş Dönüş için 2'ye basınız.\nSeçiminiz : ");
        type = input.nextInt();
        if( dist < 0 || age <0 ){
            System.out.print("Hatalı Veri Girdiniz !");
        }
        else{
            if(dist > 0 && age > 24 && age <= 65){
                if(type == 1){
                    total += (dist * per);
                    System.out.print("Toplam Tutar : " +total);
                }
                else if(type == 2){
                    total += ((2 * dist * per) - (0.4 * dist * per)) ;
                    System.out.print("Toplam Tutar : " +total);
                }
                else{
                    System.out.print("Hatalı Veri Girdiniz !");
                }
            }
            if(dist > 0 && age < 12 && age > 0) {
                if(type == 1){
                    total += (dist * per) * 0.5;
                    System.out.print("Toplam Tutar : " +total);
                }
                else if(type == 2){
                    total += ((dist * per)-(0.2 * dist * per));
                    System.out.print("Toplam Tutar : " +total);
                }
                else{
                    System.out.print("Hatalı Veri Girdiniz !");
                }
            }
            if(dist > 0 && age < 25 && age > 11 ) {
                if(type == 1){
                    total += (dist * per) * 0.9;
                    System.out.print("Toplam Tutar : " +total);
                }
                else if(type == 2){
                    total += (( dist * per  * 1.8) - (dist * per * 0.36 ));
                    System.out.print("Toplam Tutar : " +total);
                }
                else{
                    System.out.print("Hatalı Veri Girdiniz !");
                }
            }
            if(dist > 0 && age > 65 ) {
                if(type == 1){
                    total += dist * per * 0.7;
                    System.out.print("Toplam Tutar : " +total);
                }
                else if(type == 2){
                    total += (( dist * per * 1.4) - (dist * per * 0.28));
                    System.out.print("Toplam Tutar : " +total);
                }
                else{
                    System.out.print("Hatalı Veri Girdiniz !");
                }
            }
        }    
    }
}
