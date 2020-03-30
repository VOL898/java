import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        MainHelper help = new MainHelper();
        ArrayList<Customer> customerList = new ArrayList<>();

        int choice = -1;
        do{
            help.printMenu();
            do{
                try{
                    System.out.print("Choose >> ");
                    choice = scanner.nextInt();
                } catch (Exception e){
                    choice = -1;
                } finally {
                    scanner.nextLine();
                }
            } while( choice < 1 || choice > 4 );

            if( choice == 1 ){
                help.cls();
                Customer x = new Customer();

                String title;
                do{
                    System.out.print("Input titles [Mr. | Mrs. ](Case Sensitive): ");
                    title = scanner.nextLine();
                    if(title.equals("Mr.") || title.equals("Mrs.")){
                        x.setTitle(title);
                        break;
                    }
                } while( true );

                String name;
                do{
                    System.out.print("Input name [1-30 characters]: ");
                    name = scanner.nextLine();
                    if((name.length()>0) && (name.length())<30){
                        x.setName(name);
                        break;
                    }
                } while(true);

                int time=0;
                do{
                    try{
                        System.out.print("Input time [1-5 hours]: ");
                        time = scanner.nextInt();
                    } catch (Exception e){
                        time = 0;
                    } finally {
                        scanner.nextLine();
                        x.setTime(time);
                    }
                } while( time < 1 || time > 5);

                do {
                    int randomIntId = rand.nextInt(1000);
                    int ada = 0;
                    for( int i = 0 ; i < customerList.size() ; ++i ){
                        if( randomIntId == (customerList.get(i).getId()) ){
                            ada = 1;
                            break;
                        }
                    }
                    if( ada != 1 ){
                        x.setId(randomIntId);
                        break;
                    }
                } while ( true );

                customerList.add(x);

                System.out.println("Add customer success!!");
                System.out.println("Press enter to continue...");
                scanner.nextLine();
                help.cls();
            } else if( choice == 2 ) {

                help.cls();
                help.showData(customerList);
                System.out.println("Press enter to continue...");
                scanner.nextLine();
                help.cls();

            } else if( choice == 3 ){

                help.cls();
                help.showData(customerList);

                if( customerList.isEmpty() ){
                    System.out.println("Press enter to continue...");
                    scanner.nextLine();
                } else {
                    String input;
                    int temp1, temp2, temp3;
                    int id = 0;
                    do{
                        System.out.print("Input ID: ");
                        input = scanner.nextLine();
                        char[] temp =  input.toCharArray();
                        temp1 = temp[2];
                        temp1 -= 48;
                        temp2 = temp[3];
                        temp2 -= 48;
                        temp3 = temp[4];
                        temp3 -= 48;

                        temp1 *= 100;
                        id += temp1;

                        temp2 *= 10;
                        id += temp2;

                        id += temp3;

                        int ada = 0;
                        int index = 0;
                        for( int i = 0 ; i < customerList.size() ; ++i ){
                            if( id == (customerList.get(i).getId()) ){
                                ada = 1;
                                index = i;
                                break;
                            }
                        }
                        if( ada == 1 ){
                            Customer ygIni = customerList.get(index);
                            int extra=0;
                            do{
                                try{
                                    System.out.print("Input extend time [1-5 hours]: ");
                                    extra = scanner.nextInt();
                                } catch (Exception e){
                                    extra = 0;
                                } finally {
                                    scanner.nextLine();
                                    int tempTime = customerList.get(index).getTime();
                                    tempTime += extra;
                                    ygIni.setTime(tempTime);
                                    customerList.set(index,ygIni);
                                }
                            } while( extra < 1 || extra > 5);

                            System.out.println("Update Success!!");
                            System.out.println("Press enter to continue...");
                            scanner.nextLine();
                            break;
                        }
                    } while (true);

                }
                help.cls();
            }

        } while( choice != 4 );
        System.out.println("Thank you for using this application!!");
    }
}
