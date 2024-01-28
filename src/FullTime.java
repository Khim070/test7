public class FullTime extends Employee implements IEmployee{
    private double salaryEmployee;
    public FullTime(String nameEmployee, String genderEmployee, String phoneEmployee, double salaryEmployee){
        super(nameEmployee,genderEmployee,phoneEmployee);
        this.salaryEmployee = salaryEmployee;
    }
    public double CalculateSalary(){
        return salaryEmployee;
    }
    public void CheckIn(){
        System.out.println("9 am");
    }
}
