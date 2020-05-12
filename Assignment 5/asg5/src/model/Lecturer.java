package model;

import java.math.BigInteger;

public class Lecturer extends Binusian implements Teacher {

    public Lecturer(String id, String name, String lecturerId, String salary) {
        super(id, name);
        this.lecturerId=lecturerId;
        setSalary(salary);
    }

    private final String lecturerId;
    private BigInteger salary;

    public String getLecturerId() {
        return lecturerId;
    }

    public BigInteger getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = new BigInteger(salary);
    }

    public void teaching(){
        System.out.println(getName() + " is teaching!");
    }
}
