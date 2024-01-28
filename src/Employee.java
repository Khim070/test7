public class Employee {
    private String nameEmployee;
    private String phoneEmployee;
    private String genderEmployee;
    public Employee(String nameEmployee,String phoneEmployee, String genderEmployee){
        this.nameEmployee = nameEmployee;
        this.genderEmployee = genderEmployee;
        this.phoneEmployee = phoneEmployee;
    }
    public String getNameEmployee(){
        return nameEmployee;
    }
    public String getPhoneEmployee(){
        return phoneEmployee;
    }
    public String getGenderEmployee(){
        return genderEmployee;
    }
    public void setNameEmployee(String nameEmployee){
        this.nameEmployee = nameEmployee;
    }
    public void setPhoneEmployee(String phoneEmployee){
        this.phoneEmployee = phoneEmployee;
    }
    public void setGenderEmployee(String genderEmployee){
        this.genderEmployee = genderEmployee;
    }
}
