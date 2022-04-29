import java.util.Scanner;
public class sinifgecme {
    public static void main(String[] args) {
        int mat,fiz,turk,kim,muz;
        double toplam = 0;
        int count = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        if(0 <= mat && mat<= 100){
            count++;
            toplam += mat;
        }

        System.out.print("Fizik Notunuz : ");
        fiz = inp.nextInt();

        if(0 <= fiz && fiz<= 100){
            count++;
            toplam += fiz;
        }

        System.out.print("Türkçe Notunuz : ");
        turk = inp.nextInt();

        if(0 <= turk && turk<= 100){
            count++;
            toplam += turk;
        }

        System.out.print("Kimya Notunuz : ");
        kim = inp.nextInt();

        if(0 <= kim && kim<= 100){
            count++;
            toplam += kim;
        }
        
        System.out.print("Müzik Notunuz : ");
        muz = inp.nextInt();

        if(0 <= muz && muz<= 100){
            count++;
            toplam += muz;
        }

        double avarage = toplam / count ;
        
        if(avarage <= 55 ) {
            System.out.println("Sınıfta kaldınız, seneye görüşmek üzere !");
        }
        else {
            System.out.println("Tebrikler Sınıfı Geçtiniz !!!");
        }
        System.out.println("Ortalamanız : " +avarage);
        
    }
}