package model;

public class Student extends Binusian {

    public Student(String id, String name, String studentId, String major){
        super(id, name);  //harus paling awal dalam ctor
        this.studentId=studentId;
        setMajor(major);
    }

    private final String studentId;
    private String major;

    public String getStudentId() {
        return studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void study(){
        System.out.println( getName() + " is studying!");
    }
}
