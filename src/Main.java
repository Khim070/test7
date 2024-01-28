public class Main {
    public static void main(String[] args) {
        PartTime emp = new PartTime("Vakhim","Male","010202974",10,10);
        System.out.println(emp.CalculateSalary());
        emp.CheckIn();
    }
}