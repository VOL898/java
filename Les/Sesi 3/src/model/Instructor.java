package model;

import java.math.BigInteger;

public class Instructor extends Student implements Teacher {

    public Instructor(String id, String name, String studentId, String major, String salary) {
        super(id, name, studentId, major);
        setSalary(salary);
    }

    private BigInteger salary;

    public BigInteger getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = new BigInteger(salary);
    }

//    @Override
//    public void teaching() {
//
//    }
//
    public void teaching(){
        System.out.println(getName() + " is instructing!");
    }

    @Override
    public void study(){
        System.out.println( getName() + " is not studying!");
    }
}
