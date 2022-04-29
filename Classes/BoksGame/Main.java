public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Yavuz" , 15 , 100, 90, 30);
        Fighter f2 = new Fighter("Selim" , 10 , 95, 100, 40);
        Ring match = new Ring(f1,f2 , 90 , 100);
        match.run();
    }
}