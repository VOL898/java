import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<String> students = new ArrayList<>();
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName=courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student){
        if(students.contains(student)){
            System.out.println("This student is already in this course!");
        } else {
            students.add(student);
            numberOfStudents++;
            System.out.println(student + " has been added to " + courseName);
        }
    }

    public void dropStudent(String student){
        if(students.contains(student)){
            students.remove(student);
            numberOfStudents--;
            System.out.println("Student " + student
                    + " has been dropped from this course!");
        } else {
            System.out.println("That student is not in this course!");
        }
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

}
