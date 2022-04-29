import java.util.Arrays;

public class Duplicate {
    

        static boolean isFind ( int[] arr, int value ) {
            for(int i : arr) {
                if (i == value) {
                    return true;
                }
            }
            return false;
        }
        public static void main(String[] args) {

        int[] list = {1,3,5,6,8,10,6,8,12,24,36,3,5,8};
        int[] listForDuplicate = new int[list.length];
        int index = 0 ;
        for(int i = 0; i < list.length; i++ ) {
            for(int j = 0 ; j < list.length; j++) {
                
                if(i != j && list[i] == list[j] && list[i] % 2 == 0 ) {
                    if( !isFind ( listForDuplicate, list[i]) ) {
                        listForDuplicate[index++] = list[i];
                    }
                    break;
                }
                else {
                    continue;
                }
            }
        }
        for (int i = 0 ; i < listForDuplicate.length; i++ ) {
            if (listForDuplicate[i] != 0) {
                System.out.print(listForDuplicate[i] + " ");
            }
        }
        
    }
}