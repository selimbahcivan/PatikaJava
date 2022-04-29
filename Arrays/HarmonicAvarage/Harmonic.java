public class Harmonic {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Harmonic avarage of array is : " + valueHarmonic(array1));
    }

    static double valueHarmonic(int[] array ) {
        double total = 0 ;
        for(int i : array) {
            total += ( 1.0 / i ) ;
        }
        return total ;
    }


}
