public class FullTime extends Employee {

    private String baseSalary;

    public FullTime(String name, int age, String role, String type){
        super(name, age, role, type);
    }

    public String getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(String baseSalary) {
        this.baseSalary = baseSalary;
    }
}
