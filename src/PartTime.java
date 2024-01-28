public class PartTime extends Employee implements IEmployee{
    private double TotalHours;
    private double HourWages;
    public PartTime(String nameEmployee, String genderEmployee, String phoneEmployee,double TotalHours, double HourWages){
        super(nameEmployee, phoneEmployee, genderEmployee);
        this.TotalHours = TotalHours;
        this.HourWages = HourWages;
    }
    public double CalculateSalary(){
        return TotalHours * HourWages;
    }

    @Override
    public void CheckIn() {
        System.out.println("8 am");
    }
}
