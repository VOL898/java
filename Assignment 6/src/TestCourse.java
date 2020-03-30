import java.util.ArrayList;
import java.util.Scanner;

public class TestCourse {

    public static void printMenu(){
        System.out.println("===== Menu =====");
        System.out.println("1. Add new course");
        System.out.println("2. Add new student");
        System.out.println("3. Drop student");
        System.out.println("4. View student list");
        System.out.println("5. Exit");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Course> courseList = new ArrayList<>();

        int choice = -1;
        while( choice != 5 ){
            printMenu();
            do{
                try{
                    System.out.print("Choice: ");
                    choice = scanner.nextInt();
                } catch(Exception e){
                    choice = -1;
                } finally {
                    scanner.nextLine();
                }
            } while( choice < 1 || choice > 5 );

            if( choice == 1 ){  //add new course
                System.out.print("Course Name: ");
                String courseName = scanner.nextLine();
                Course x = new Course(courseName);
                courseList.add(x);
                System.out.println(courseName + " added to the list of courses!");
                System.out.println("Press enter to continue...");
                scanner.nextLine();
            } else if( choice == 2 ){   //add new student
                if( courseList.isEmpty() ){
                    System.out.println("No courses listed!");
                    System.out.println("Press enter to continue...");
                    scanner.nextLine();
                } else {
                    System.out.println("Courses:");
                    for ( int i = 0 ; i < courseList.size() ; ++i ){
                        System.out.println(i+1 + ". " + courseList.get(i).getCourseName());
                    }
                    System.out.print("Input Which course name: ");
                    String courseName = scanner.nextLine();
                    int contain = 0;
                    int index = -1;
                    for ( int i = 0 ; i < courseList.size() ; ++i ){
                        if(courseList.get(i).getCourseName().equals(courseName)){
                            contain = 1;
                            index = i;
                            break;
                        }
                    }
                    if( contain == 1 ){
                        System.out.print("Input student name: ");
                        String studentName = scanner.nextLine();
                        courseList.get(index).addStudent(studentName);
                        System.out.println("Press enter to continue...");
                        scanner.nextLine();
                    } else {
                        System.out.println("Course does not exist!");
                        System.out.println("Press enter to continue...");
                        scanner.nextLine();
                    }
                }
            } else if( choice == 3 ){   //drop student
                if( courseList.isEmpty() ){
                    System.out.println("No courses listed!");
                    System.out.println("Press enter to continue...");
                    scanner.nextLine();
                } else {
                    System.out.println("Courses:");
                    for ( int i = 0 ; i < courseList.size() ; ++i ){
                        System.out.println(i+1 + ". " + courseList.get(i).getCourseName());
                    }
                    System.out.print("Input Which course name: ");
                    String courseName = scanner.nextLine();
                    int contain = 0;
                    int index = -1;
                    for ( int i = 0 ; i < courseList.size() ; ++i ){
                        if(courseList.get(i).getCourseName().equals(courseName)){
                            contain = 1;
                            index = i;
                            break;
                        }
                    }
                    if( contain == 1 ){
                        ArrayList<String> studentList = courseList.get(index).getStudents();
                        if( studentList.isEmpty() ){
                            System.out.println("No students in this course!");
                            System.out.println("Press enter to continue...");
                            scanner.nextLine();
                        } else {
                            System.out.println("Students:");
                            for (int i = 0; i < courseList.get(index).getNumberOfStudents(); ++i) {
                                System.out.println((i + 1) + ". " + studentList.get(i));
                            }
                            System.out.print("Input student name to be dropped: ");
                            String studentName = scanner.nextLine();
                            courseList.get(index).dropStudent(studentName);
                            System.out.println("Press enter to continue...");
                            scanner.nextLine();
                        }
                    } else {
                        System.out.println("Course does not exist!");
                        System.out.println("Press enter to continue...");
                        scanner.nextLine();
                    }
                }
            } else if( choice == 4 ){   //view student list
                if( courseList.isEmpty() ){
                    System.out.println("No courses listed!");
                    System.out.println("Press enter to continue...");
                    scanner.nextLine();
                } else {
                    System.out.println("Courses:");
                    for ( int i = 0 ; i < courseList.size() ; ++i ){
                        System.out.println((i+1) + ". " + courseList.get(i).getCourseName());
                    }
                    System.out.print("Input Which course name: ");
                    String courseName = scanner.nextLine();
                    int contain = 0;
                    int index = -1;
                    for ( int i = 0 ; i < courseList.size() ; ++i ){
                        if(courseList.get(i).getCourseName().equals(courseName)){
                            contain = 1;
                            index = i;
                            break;
                        }
                    }
                    if( contain == 1 ){
                        ArrayList<String> studentList = courseList.get(index).getStudents();
                        if( studentList.isEmpty() ){
                            System.out.println("No students in this course!");
                            System.out.println("Press enter to continue...");
                            scanner.nextLine();
                        } else {
                            System.out.println("Students:");
                            for (int i = 0; i < courseList.get(index).getNumberOfStudents(); ++i) {
                                System.out.println((i + 1) + ". " + studentList.get(i));
                            }
                            System.out.println();
                            System.out.println("Press enter to continue...");
                            scanner.nextLine();
                        }
                    } else {
                        System.out.println("Course does not exist!");
                        System.out.println("Press enter to continue...");
                        scanner.nextLine();
                    }
                }
            }

        }

        System.out.println("Thank you for using this program!");

        /*  //from the book
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents());
        ArrayList<String> students = course1.getStudents();
        for( int i = 0 ; i < course1.getNumberOfStudents(); ++i ){
            if(i + 1 == course1.getNumberOfStudents()){
                System.out.print(students.get(i));
            } else {
                System.out.print(students.get(i) + ", ");
            }
        }

        System.out.println();
        System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
        */
    }
}