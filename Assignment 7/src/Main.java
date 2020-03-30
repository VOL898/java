import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        MainHelper help = new MainHelper();
        ArrayList<Car> jeepList = new ArrayList<>();
        ArrayList<Car> suvList = new ArrayList<>();
        ArrayList<Car> sedanList = new ArrayList<>();
        
        int choice = -1;
        do{
            help.cls();
            help.showMenu();
            do{
                try{
                    System.out.print("Input : ");
                    choice = scanner.nextInt();
                } catch (Exception e){
                    System.out.println("Wrong Input!");
                    choice = -1;
                } finally {
                    scanner.nextLine();
                }    
            } while( choice < 1 || choice > 3 );
            
            if( choice == 1 ){
                help.cls();
                help.showCars();
                int which = -1;
                String name = "";
                do{
                    try{
                        System.out.print("Input : ");
                        which = scanner.nextInt();
                    } catch (Exception e){
                        System.out.println("Wrong Input!");
                        which = -1;
                    } finally {
                        scanner.nextLine();
                    }
                } while( which < 1 || which > 3 );

                System.out.print("Car's Name: ");
                name = scanner.nextLine();

                if( which == 1 ){
                    Jeep entity = new Jeep();
                    entity.setName(name);
                    jeepList.add(entity);
                } else if( which == 2 ){
                    SUV entity = new SUV();
                    entity.setName(name);
                    suvList.add(entity);
                } else {
                    Sedan entity = new Sedan();
                    entity.setName(name);
                    sedanList.add(entity);
                }

                System.out.println("Car "+name+" has been added!");
                System.out.println("Press enter to continue...");
                scanner.nextLine();

            } else if( choice == 2 ) {
                System.out.println("List car");
                System.out.println("==============");
                System.out.println("Jeep");
                System.out.println("==============");
                help.viewData(jeepList);
                int x = jeepList.size();
                int padding = 5-x;
                for ( int i = 0 ; i < padding ; ++i ){
                    System.out.println();
                }
                System.out.println("==============");
                System.out.println("SUV");
                System.out.println("==============");
                help.viewData(suvList);
                x = suvList.size();
                padding = 5-x;
                for ( int i = 0 ; i < padding ; ++i ){
                    System.out.println();
                }
                System.out.println("==============");
                System.out.println("Sedan");
                System.out.println("==============");
                help.viewData(sedanList);
                x = suvList.size();
                padding = 5-x;
                for ( int i = 0 ; i < padding ; ++i ){
                    System.out.println();
                }
                System.out.println("==============");

                System.out.println("Press enter to continue...");
                scanner.nextLine();
            }
            
        } while( choice != 3 );
        
    }
}
