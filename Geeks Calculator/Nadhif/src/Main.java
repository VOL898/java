import java.util.Vector;
import java.util.Scanner;
import java.util.Random;

public class Main {
    Scanner scan = new Scanner(System.in);
    Vector <Data> listData = new Vector<>();
    Random rand = new Random();

    int menu = -1;
    do{
        showMenu();
        menu = scanInteger();

        switch(menu){
            case 1:
                Integer ID;
                ID = 100 + rand.nextInt(899);

                String titles;
                do {
                    System.out.println("Input titles [Mr. | Mrs. ](Case Sensitive): ");
                    titles = scan.nextLine();
                }while(!(titles.equals("Mr.") || titles.equals("Mrs.")));

                String name;
                do{
                    System.out.println("Input name [1-30 characters]: ");
                    name = scan.nextLine();
                }while(name.length()>30);

                Integer time;
                do {
                    System.out.println("Input time [1-5 hours]");
                    time = scan.nextInt();
                }while(!(time <= 5 && time >= 1));


                Data data = new Data(ID, name, titles, time);
                listData.add(data);
                System.out.println("Add customer success!!");
                System.out.println("Press enter to continue...");
                scan.nextLine();
                break;
            case 2:
                if(listData.isEmpty()){
                    noData();
                    System.out.println("Press enter to continue...");
                    scan.nextLine();
                    break;
                }else{
                    viewData();
                    System.out.println("Press enter to continue...");
                    scan.nextLine();
                    break;
                }
            case 3:
                if(listData.isEmpty()) {
                    noData();
                    System.out.println("Press enter to continue...");
                    scan.nextLine();
                    break;
                }else {
                    viewData();
                    System.out.println("Input ID: ");

                    Data data2 = getData();
                    Integer time2;

                    do {
                        System.out.println("Input extend time [1-5 hours]: ");
                        time2 = scan.nextInt();
                    }while(!(time2 <= 5 && time2 >= 1));
                    data2.setTime(time2);

                    System.out.println("Update Success!!");
                    System.out.println("Press enter to continue...");
                    scan.nextLine();
                    break;
                }
        }
    }while(menu!=4);

    public void viewData(){
        System.out.println("============================================");
        System.out.println("|  ID   |	   Name	         |  Time   |      ");
        System.out.println("============================================");
        for(int i=0; i<listData.size(); i++){
            Data data = listData.get(i);
            data.showData();
            System.out.println();
        }
        System.out.println("============================================");
    }


    public void noData() {
        System.out.println("No data!!");
    }

    public void showMenu() {
        System.out.println("======================");
        System.out.println("	RHanet");
        System.out.println("======================");
        System.out.println("1. Add Customer");
        System.out.println("2. View Customer");
        System.out.println("3. Extend Time");
        System.out.println("4. Exit");
        System.out.print("Choose >> ");
    }

    public Data getData(){
        String id = "CU000";
        id = scan.nextLine();
        String[] codes = id.split("(?<=\\D)(?=\\d)");
        Integer code = Integer.parseInt(codes[1]);

        for(int i=0; i<listData.size(); i++) {
            Data data2 = listData.get(i);
            if(data2.getID()==code) {
                return listData.get(i);
            }
        }
        return null;
    }


    public int scanInteger(){
        int number = -1;
        try{
            number = scan.nextInt();
        }catch (Exception e){
            System.out.println("Input must be number");
            number = -1;
        }
        scan.nextLine();
        return number;
    }

    public static void main(String[] args) {
        new Main();
    }

}