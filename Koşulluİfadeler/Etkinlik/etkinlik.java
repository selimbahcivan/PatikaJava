import java.util.Scanner;
public class etkinlik {
    public static void main(String[] args) {
        int heat;
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Sıcaklığı Giriniz : ");
        heat = inp.nextInt();

        if(heat < 5) {
            System.out.print("Kayağa gidebilirsiniz.");
        }
        else if (10 <= heat && heat <= 15) {
            System.out.print("Sinema veya Pikniğe gidebilirsiniz.");
        }
        else if (5 <= heat && heat < 10){
            System.out.print("Sinemaya gidebilirsiniz.");
        }
        else if (15 < heat && heat <= 25){
            System.out.print("Pikniğe gidebilirsiniz.");
        }
        else {
            System.out.print("Yüzmeye gidebilirsiniz.");
        }
    }
}