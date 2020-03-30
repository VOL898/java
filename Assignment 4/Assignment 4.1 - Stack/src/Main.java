import java.util.Scanner;
import java.util.Stack;

public class Main {
    static void printMenu(){
        System.out.println("1. Input");
        System.out.println("2. Access Previous Data");
        System.out.println("3. Exit");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> historyList = new Stack<>();
        int choice = -1 ;
        int i = 0;
        while(choice!=3){
            do{
                try{
                    printMenu();
                    System.out.print("Your Choice: ");
                    choice = scanner.nextInt();
                } catch (Exception e){
                    System.out.println("Invalid Choice!");
                    choice = -1;
                } finally {
                    scanner.nextLine();
                }
            } while ( choice < 1 || choice > 3 );

            if(choice==1){
                System.out.println("Input below:");
                String input = scanner.nextLine();
                historyList.push(input);
                System.out.println("Top        = " + historyList.peek());
                System.out.println("Stack size = " + historyList.size());
            } else if (choice==2) {
                if(historyList.isEmpty()){
                    System.out.println("Stack is empty!");
                } else {
                    historyList.pop();
                    if(historyList.isEmpty()){
                        System.out.println("Stack is empty!");
                    } else {
                        System.out.println("Top        = " + historyList.peek());
                        System.out.println("Stack size = " + historyList.size());
                    }
                }
            }
        }
    }
}