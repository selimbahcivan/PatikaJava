import java.util.Arrays;
import java.util.Scanner;

public class SortArray {     
    static int[] Sort(int[] arr) { // 5 4 3 2 1 --> 4 5 3 2 1 >> 4 3 5 2 1 ... 
        int temp;
        for (int i = 0 ; i < arr.length ; i++) {
            for ( int j = 0 ; j < arr.length-1 ; j++) {
                if ( arr [ j ] > arr [ j + 1 ] ) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutu : ");
        int a = inp.nextInt();

        int[] list = new int[a];
        
        
        System.out.println("Dizinin elemanlarını giriniz ");
        for(int i = 0 ; i < a ; i ++) {
            
            System.out.print(i+1 + ". Elemanı : " );
            list[i] = inp.nextInt();
        }
        Sort(list);
        System.out.print(Arrays.toString(list));
        
    }
}