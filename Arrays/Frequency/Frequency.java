import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20}; // 5 10 15 20 // 5 10 10 10 20 20 20 20 
        int count = 0 ;
        System.out.println("Tekrar Sayıları : ");
        Arrays.sort(list);
        for(int i = 0 ; i < list.length ; i ++) {
            for(int j = 0 ; j < list.length; j++ ) {
                if (  list[i] == list[j] ) {
                    count += 1 ;   
                } 
            }
            
            if(list[i] != list[i+1]) {
                System.out.println(list[i] + " sayısı " + count + " kez tekrar edildi. ");
            }
            if(list[i] == list[list.length-1] && i == list.length-2 ) {
                System.out.println(list[list.length-1] + " sayısı " + count + " kez tekrar edildi. ");
            }
            count = 0;
            
            
        }
    
    }
}