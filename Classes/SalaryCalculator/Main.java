public class Main {
    public static void main(String[] args) {
        
        SalaryCalculator employee1 = new SalaryCalculator("Yavuz" , 2000, 45, 1985);
        SalaryCalculator employee2 = new SalaryCalculator("Selim" , 5000, 50, 2000);
        
        System.out.println(employee1.printInfos());
        System.out.println(employee2.printInfos());

    }
}
