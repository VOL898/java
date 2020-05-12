import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainHelper {

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    public void cls(){
        for( int i = 0; i < 50; ++i ) {
            System.out.println();
        }
    }

    public int genDistance(){
        int randomNum = rand.nextInt(3);
        if( randomNum == 0 ){
            return 150;
        } else if( randomNum == 1 ){
            return 250;
        } else {
            return 500;
        }
    }

    public void printTitle(){
        System.out.println(
                " _______      ___             ______    __   __  __    _ \n" +
                "|  _    |    |   |           |    _ |  |  | |  ||  |  | |\n" +
                "| |_|   |    |   |   ____    |   | ||  |  | |  ||   |_| |\n" +
                "|       |    |   |  |____|   |   |_||_ |  |_|  ||       |\n" +
                "|  _   |  ___|   |           |    __  ||       ||  _    |\n" +
                "| |_|   ||       |           |   |  | ||       || | |   |\n" +
                "|_______||_______|           |___|  |_||_______||_|  |__|");
    }

    public void printMenu(){
        System.out.println("+=======================+");
        System.out.println("+ Menu List~            +");
        System.out.println("+=======================+");
        System.out.println("+ 1. Add Runner         +");
        System.out.println("+ 2. Join Run           +");
        System.out.println("+ 3. View Standing      +");
        System.out.println("+ 4. Close Program      +");
        System.out.println("+=======================+");
    }

    public void holdUser(){
        System.out.println();
        System.out.print("Press ENTER to continue...");
        scan.nextLine();
        cls();
    }

    public void printGenData(){
        System.out.println("Generating data statistics.");
        System.out.println("Generating data statistics..");
        System.out.println("Generating data statistics...");
        System.out.println();
    }

    public void printRunHeader(int totalDistance){
        System.out.println();
        System.out.println("+=============================================+");
        System.out.println("+ Current Standing                       " + totalDistance + "  +");
        System.out.println("+=============================================+");
        System.out.println("+ No. | Name            | Type   | Distance   +");
    }

    public void printDraw(){
        System.out.println(
                " ______   ______    _______  _     _ \n" +
                "|      | |    _ |  |   _   || | _ | |\n" +
                "|  _    ||   | ||  |  |_|  || || || |\n" +
                "| | |   ||   |_||_ |       ||       |\n" +
                "| |_|   ||    __  ||       ||       |\n" +
                "|       ||   |  | ||   _   ||   _   |\n" +
                "|______| |___|  |_||__| |__||__| |__|");
    }

    public void printHareLeads(){
        System.out.println(
                " __   __  _______  ______    _______    ___      _______  _______  ______   _______ \n" +
                "|  | |  ||   _   ||    _ |  |       |  |   |    |       ||   _   ||      | |       |\n" +
                "|  |_|  ||  |_|  ||   | ||  |    ___|  |   |    |    ___||  |_|  ||  _    ||  _____|\n" +
                "|       ||       ||   |_||_ |   |___   |   |    |   |___ |       || | |   || |_____ \n" +
                "|       ||       ||    __  ||    ___|  |   |___ |    ___||       || |_|   ||_____  |\n" +
                "|   _   ||   _   ||   |  | ||   |___   |       ||   |___ |   _   ||       | _____| |\n" +
                "|__| |__||__| |__||___|  |_||_______|  |_______||_______||__| |__||______| |_______|");
    }

    public void printTurtleLeads(){
        System.out.println(
                " _______  __   __  ______    _______  ___      _______    ___      _______  _______  ______   _______ \n" +
                "|       ||  | |  ||    _ |  |       ||   |    |       |  |   |    |       ||   _   ||      | |       |\n" +
                "|_     _||  | |  ||   | ||  |_     _||   |    |    ___|  |   |    |    ___||  |_|  ||  _    ||  _____|\n" +
                "  |   |  |  |_|  ||   |_||_   |   |  |   |    |   |___   |   |    |   |___ |       || | |   || |_____ \n" +
                "  |   |  |       ||    __  |  |   |  |   |___ |    ___|  |   |___ |    ___||       || |_|   ||_____  |\n" +
                "  |   |  |       ||   |  | |  |   |  |       ||   |___   |       ||   |___ |   _   ||       | _____| |\n" +
                "  |___|  |_______||___|  |_|  |___|  |_______||_______|  |_______||_______||__| |__||______| |_______|");
    }

    public void printStatusHeader(){
        System.out.println("+=================================+");
        System.out.println("+      Hare      |     Turtle     +");
        System.out.println("+=================================+");
    }

    public void resetDistance( ArrayList<Runner> runnerList){
        for( Runner runner: runnerList ){
            runner.setDistance(0);
        }
    }

}
