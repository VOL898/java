import java.util.ArrayList;
import java.util.Scanner;

public class MainHelper {

    Scanner scanner = new Scanner(System.in);

    public void showTitle(){
        System.out.print("\n" +
                " ______       __        ______     ______     ______    \n" +
                "/\\  == \\     /\\ \\      /\\___  \\   /\\  __ \\   /\\  __ \\   \n" +
                "\\ \\  __<    _\\_\\ \\     \\/_/  /__  \\ \\ \\/\\ \\  \\ \\ \\/\\ \\  \n" +
                " \\ \\_____\\ /\\_____\\      /\\_____\\  \\ \\_____\\  \\ \\_____\\ \n" +
                "  \\/_____/ \\/_____/      \\/_____/   \\/_____/   \\/_____/ \n" +
                "                                                        \n");
    }

    public void cls(){
        for ( int i = 0; i < 50; ++i ){
            System.out.println();
        }
    }

    public void showMenu(){
        System.out.println("+=======================+");
        System.out.println("+ Menu List             +");
        System.out.println("+=======================+");
        System.out.println("+ 1. Add Zoo Animal     +");
        System.out.println("+ 2. View Zoo Animal    +");
        System.out.println("+ 3. Take For A Walk    +");
        System.out.println("+ 4. Release Zoo Animal +");
        System.out.println("+ 5. Close Program      +");
        System.out.println("+=======================+");
    }

    public void printHeader(){
        System.out.println("+=======================================================+");
        System.out.println("+ No. | Name            | Genus    | Mood      | Gender +");
        System.out.println("+=======================================================+");
    }

    public String reqName(){
        String name;
        int nameLength = 1;
        do{
            System.out.print("What's the name [5 - 15 characters]? ");
            name = scanner.nextLine();
            nameLength = name.length();
        } while( nameLength < 5 || nameLength > 15 );
        return name;
    }

    public String reqGender(){
        String gender;
        do{
            System.out.print("What's its gender [male | female]? ");
            gender = scanner.nextLine();
            if( gender.equals("male") || gender.equals("female") ){
                break;
            }
        } while(true);
        return gender;
    }

    public String reqGenus(){
        String genus;
        do{
            System.out.print("What's it's genus [canine | feline]? ");
            genus = scanner.nextLine();
            if( genus.equals("canine") || genus.equals("feline") ){
                break;
            }
        } while(true);
        return genus;
    }

    public int reqSpeed(){
        int speed = -1;
        do{
            try{
                System.out.print("What's its speed [1 - 80]? ");
                speed = scanner.nextInt();
            } catch (Exception e){
                speed = -1;
            } finally {
                scanner.nextLine();
            }
        } while((speed < 1) || (speed > 80));
        return speed;
    }

    public void displayAnimals( ArrayList<Animal> animalList ){
        printHeader();
        if( animalList.isEmpty() ){
            System.out.println("+ No Zoo Animal Spotted                                 +");
        } else {
            for( int i = 0; i < animalList.size(); ++i ){
                Animal x = animalList.get(i);
                String name = x.getName();
                String genus = x.getGenus();
                String mood = x.getMood();
                String gender = x.getGender();
                String out = String.format("+ %-3d | %-15s | %-8s | %-9s | %-6s +", (i+1), name, genus, mood, gender );
                System.out.println(out);
            }
        }
        System.out.println("+=======================================================+");
    }

    public int reqWalk( int size ){
        int walk = -1;
        do{
            try{
                System.out.print("Choose animal to take for a stroll [1 - " + size + "]: ");
                walk = scanner.nextInt();
            } catch (Exception e){
                walk = -1;
            } finally {
                scanner.nextLine();
            }
        } while((walk < 1) || (walk > size));
        return walk;
    }

    public int reqRoam(){
        int roam = -1;
        do{
            try{
                System.out.print("Input roaming time [0 - 50]: ");
                roam = scanner.nextInt();
            } catch (Exception e){
                roam = -1;
            } finally {
                scanner.nextLine();
            }
        } while((roam < 0) || (roam > 50));
        return roam;
    }

    public int reqRelease( int size ){
        int release = -1;
        do{
            try{
                System.out.print("Choose animal that wants to be released [1 - " + size + "]: ");
                release = scanner.nextInt();
            } catch (Exception e){
                release = -1;
            } finally {
                scanner.nextLine();
            }
        } while((release < 1) || (release > size));
        return release;
    }

    public void updateMoods( ArrayList<Animal> animalList, int canines, int maxCanines, int felines, int maxFelines ){
        for( int i = 0; i < animalList.size(); ++i ){
            String tempGenus = animalList.get(i).getGenus();
            if( tempGenus.equals("canine") ){
                Canine temp = (Canine)animalList.get(i);
                temp.generateMood( canines, maxCanines );
            } else if( tempGenus.equals("feline") ){
                Feline temp = (Feline)animalList.get(i);
                temp.generateMood( felines, maxFelines );
            }
        }
    }
}
