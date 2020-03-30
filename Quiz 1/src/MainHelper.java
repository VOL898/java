import java.util.ArrayList;

public class MainHelper {
    public void printMenu(){
        System.out.println("=================================");
        System.out.println("              RHanet");
        System.out.println("=================================");
        System.out.println("1. Add Customer");
        System.out.println("2. View Customer");
        System.out.println("3. Extend Time");
        System.out.println("4. Exit");
    }

    public void cls(){
        for (int i = 0 ; i < 25 ; ++i){
            System.out.println();
        }
    }

    void showData(ArrayList<Customer> customerList){
        if( customerList.isEmpty() ){
            System.out.println("No data!!");
        } else {
            for( int i = 0 ; i < 70 ; ++i ){
                System.out.print("=");
            }
            System.out.println();
            System.out.println("|    ID    |                      Name                   |    Time   |");
            for( int i = 0 ; i < 70 ; ++i ){
                System.out.print("=");
            }
            System.out.println();
            for (int i = 0; i < customerList.size() ; i++ ) {
                String output = String.format("|CU%03d     |%-4s %-40s|%-6dhours|", customerList.get(i).getId(), customerList.get(i).getTitle(), customerList.get(i).getName(), customerList.get(i).getTime() );
                System.out.println(output);
            }
            for( int i = 0 ; i < 70 ; ++i ){
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
