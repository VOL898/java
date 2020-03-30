import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static void printMenu(){
        System.out.println("1. Input Queue");
        System.out.println("2. Remove Head Queue");
        System.out.println("3. Exit");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queueList = new PriorityQueue<>();
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
                ++i;
                queueList.offer(i);
                System.out.println("Current    = " + queueList.peek());
                System.out.println("Last Queue = " + i);
                System.out.println("Queue Size = " + queueList.size());
            } else if (choice==2) {
                if(queueList.isEmpty()){
                    System.out.println("There is no queue!");
                } else {
                    queueList.poll();
                    if(queueList.isEmpty()){
                        System.out.println("That is the last queue!");
                    } else {
                        System.out.println("Current    = " + queueList.peek());
                        System.out.println("Last Queue = " + i);
                        System.out.println("Queue size = " + queueList.size());
                    }
                }
            }
        }
    }
}