public class PartTime extends Employee {

    private String payPerHour;
    private int hourPerWeek;

    public PartTime(String name, int age, String role, String type){
        super(name, age, role, type);
    }

    public String getPayPerHour() {
        return payPerHour;
    }

    public void setPayPerHour(String payPerHour) {
        this.payPerHour = payPerHour;
    }

    public int getHourPerWeek() {
        return hourPerWeek;
    }

    public void setHourPerWeek(int hourPerWeek) {
        this.hourPerWeek = hourPerWeek;
    }
}
