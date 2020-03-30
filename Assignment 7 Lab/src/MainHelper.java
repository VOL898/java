import java.math.BigInteger;
import java.util.ArrayList;

public class MainHelper {
    public void cls() {
        for (int i = 0; i < 25; ++i) {
            System.out.println();
        }
    }

    public void printMenu() {
        System.out.println("ABC EMPLOYEE DATA");
        System.out.println("=================");
        System.out.println("1. Add employee");
        System.out.println("2. View employee");
        System.out.println("3. Resign");
        System.out.println("4. Exit");
    }

    public void viewEmployeeList(ArrayList<Employee> employeeList) {
        if (employeeList.isEmpty()) {
            System.out.println("There is no employee data in the list");
        } else {
            for (int i = 0; i < employeeList.size(); ++i) {
                System.out.println("Employee no." + (i + 1));
                if (employeeList.get(i).getType().equals("FullTime")) {
                    System.out.println("Full Time Employee");
                } else if (employeeList.get(i).getType().equals("PartTime")) {
                    System.out.println("Part Time Employee");
                }
                System.out.println("==================");
                System.out.println("Status: " + employeeList.get(i).getStatus());
                System.out.println("Name: " + employeeList.get(i).getName());
                System.out.println("Age: " + employeeList.get(i).getAge());
                System.out.println("Role: " + employeeList.get(i).getRole());
                if (employeeList.get(i).getType().equals("FullTime")) {
                    FullTime curr = (FullTime) employeeList.get(i);
                    System.out.println("Base salary per month: " + curr.getBaseSalary());
                } else if (employeeList.get(i).getType().equals("PartTime")) {
                    PartTime curr = (PartTime) employeeList.get(i);
                    String payPerHour = curr.getPayPerHour();
                    int perHourSalary = Integer.parseInt(payPerHour);
                    int hours = curr.getHourPerWeek();
                    int perMonth = perHourSalary * hours * 4;
                    System.out.println("Pay per hour: " + payPerHour);
                    System.out.println("Working hour per week: " + hours);
                    System.out.println("Salary per month: " + perMonth);
                }
                System.out.println();
            }
        }
    }
}
