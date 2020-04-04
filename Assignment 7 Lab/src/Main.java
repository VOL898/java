import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public Main() throws IOException {

        MainHelper help = new MainHelper();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employeeList = new ArrayList<>();

        int choice = -1;
        do{
            help.printMenu();
            try{
                System.out.print("Choice: ");
                choice = scanner.nextInt();
            } catch (Exception e){
                choice = -1;
            } finally {
                scanner.nextLine();
            }
            if( choice == 1 ) {
                String name;
                do {
                    System.out.print("Input employee name[must be more than 3 characters]: ");
                    name = scanner.nextLine();
                    if (name.length() > 3) {
                        break;
                    }
                } while (true);
                int age = 0;
                do {
                    try {
                        System.out.print("Input employee age[>= 17]: ");
                        age = scanner.nextInt();
                    } catch (Exception e) {
                        age = 0;
                    } finally {
                        scanner.nextLine();
                    }
                } while (age < 17);
                String role;
                do {
                    System.out.print("Input employee role[Assistant | Programmer](Case Sensitive): ");
                    role = scanner.nextLine();
                    if (role.equals("Assistant") || role.equals("Programmer")) {
                        break;
                    }
                } while (true);
                String type;
                int which = 0;
                do {
                    System.out.print("Input employee type[PartTime | FullTime](Case Sensitive): ");
                    type = scanner.nextLine();
                    if (type.equals("PartTime")) {
                        which = 1;
                        break;
                    } else if (type.equals("FullTime")) {
                        which = 2;
                        break;
                    }
                } while (true);
                if (which == 1) {
                    PartTime x = new PartTime(name, age, role, type);
                    String payPerHour;
                    do {
                        System.out.print("Input pay per hour[>=10000]: ");
                        payPerHour = scanner.nextLine();
                        char[] temp = payPerHour.toCharArray();
                        if (payPerHour.length() >= 5 && temp[0] > 0) {
                            break;
                        }
                    } while (true);
                    int hourPerWeek = -1;
                    do {
                        try {
                            System.out.print("Input working hour per week[>0]: ");
                            hourPerWeek = scanner.nextInt();
                        } catch (Exception e) {
                            hourPerWeek = 1;
                        } finally {
                            scanner.nextLine();
                        }
                    } while (hourPerWeek < 1);
                    x.setPayPerHour(payPerHour);
                    x.setHourPerWeek(hourPerWeek);
                    x.setStatus("active");
                    employeeList.add(x);
                } else if (which == 2) {
                    FullTime x = new FullTime(name, age, role, type);
                    String baseSalary;
                    do {
                        System.out.print("Input base salary[>=10000]: ");
                        baseSalary = scanner.nextLine();
                        char[] temp = baseSalary.toCharArray();
                        if (baseSalary.length() >= 5 && temp[0] > 0) {
                            break;
                        }
                    } while (true);
                    x.setBaseSalary(baseSalary);
                    x.setStatus("active");
                    employeeList.add(x);
                }
                System.out.println("Success insert employee data");
                System.out.println();
                System.out.println("Press any key to continue...");
                System.in.read();
                help.cls();
            } else if( choice == 2 ){
                help.cls();
                help.viewEmployeeList( employeeList );
                System.out.println();
                System.out.println("Press any key to continue...");
                System.in.read();
                help.cls();
            } else if( choice == 3 ){
                help.cls();
                help.viewEmployeeList( employeeList );
                if(employeeList.isEmpty()){
                    System.out.println();
                    System.out.println("Press any key to continue...");
                    System.in.read();
                    help.cls();
                } else {
                    int index = -1;
                    do{
                        try{
                            System.out.print("Input employee number that want to resign[1.." + employeeList.size() + "]: ");
                            index = scanner.nextInt();
                        } catch (Exception e){
                            index = -1;
                        } finally {
                            scanner.nextLine();
                        }
                    } while( index < 1 || index > employeeList.size() );
                    --index;
                    if(employeeList.get(index).getStatus().equals("active")){
                        System.out.println(employeeList.get(index).getName() + " is resigning...");
                        employeeList.get(index).setStatus("not active");
                    } else if(employeeList.get(index).getStatus().equals("not active")){
                        System.out.println("Employee has already resigned!");
                    }
                    System.out.println();
                    System.out.println("Press any key to continue...");
                    System.in.read();
                    help.cls();
                }
            }
        }while(choice!=4);
    }

    public static void main(String[] args) throws IOException {
        new Main();
    }
}
