import java.util.Scanner;

public class ortalama {
    public static void main(String[] args) {
        //  Degiskenleri oluşturduk.
        int  mat, fizik, turkce, kimya, tarih, muzik ; 

        //  Scanner sınıfını tanımladık
        Scanner inp = new Scanner(System.in);

        //  Kullanıcıdan değerleri al.
        System.out.print("Matematik Notunu Giriniz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunu Giriniz : ");
        fizik = inp.nextInt();

        System.out.print("Türkçe Notunu Giriniz : ");
        turkce = inp.nextInt();

        System.out.print("Kimya Notunu Giriniz : ");
        kimya = inp.nextInt();

        System.out.print("Tarih Notunu Giriniz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunu Giriniz : ");
        muzik = inp.nextInt();

        int toplam = mat + fizik + turkce + kimya + tarih + muzik;

        double sonuc = toplam / 6 ;

        boolean ortalamaSonuc = (sonuc <= 60);

        String durum = (ortalamaSonuc) ? "Maalesef Kaldınız:(" : "Tebrikler Geçtiniz!" ; 

        System.out.println("Sınıfı Geçme Durumunuz : " + durum);
        
        
    }

}