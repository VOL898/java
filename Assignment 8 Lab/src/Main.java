import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MainHelper help = new MainHelper();
        ArrayList<Animal> animalList = new ArrayList<>();
        Random rand = new Random();

        int choice = -1;
        int canines = 0;
        int felines = 0;
        int maxCanines = 0;
        int maxFelines = 0;

        help.showTitle();
        do{
            do{
                help.showMenu();
                try{
                    System.out.print("Choice >> ");
                    choice = scanner.nextInt();
                } catch (Exception e){
                    choice = -1;
                } finally {
                    scanner.nextLine();
                }
                help.cls();
            } while( choice < 1 | choice > 5 );
            if( choice == 1 ){                                                                          //Add
                help.cls();
                String name = help.reqName();
                String gender = help.reqGender();
                String genus = help.reqGenus();
                if( genus.equals("canine") ){
                    int speed = help.reqSpeed();
                    Canine x = new Canine( name, gender, genus, speed , canines, maxCanines );
                    animalList.add(x);
                    ++canines;
                    ++maxCanines;
                } else {
                    int speed = rand.nextInt(80);
                    if( speed == 0 ){
                        speed = 80;
                    }
                    Feline x = new Feline( name, gender, genus, speed, felines, maxFelines );
                    animalList.add(x);
                    ++felines;
                    ++maxFelines;
                }
                System.out.println("Another animal has joined the zoo!!");
                System.out.println();
                System.out.println("Press ENTER to continue...");
                scanner.nextLine();
                help.cls();
            } else if( choice == 2 ){                                                                   //View
                help.cls();
                help.displayAnimals( animalList );
                System.out.println();
                System.out.println("Press ENTER to continue...");
                scanner.nextLine();
                help.cls();
            } else if( choice == 3 ){                                                                   //Walk
                help.cls();
                help.displayAnimals( animalList );
                if( animalList.size() != 0 ){
                    int size = animalList.size();
                    int walkWhich = help.reqWalk(size);
                    int roam = help.reqRoam();
                    String genus = animalList.get((walkWhich-1)).getGenus();
                    int totalRange = 0;
                    if( genus.equals("feline") ){
                        int random = rand.nextInt(2);
                        Feline temp = (Feline)animalList.get((walkWhich-1));
                        int speed = temp.getSpeed();
                        if( random == 0 ){
                            System.out.println("Felines doesn't feel like roaming at all today...");
                        } else {
                            int duration;
                            if( roam == 0 ){
                                duration = 30;
                                roam = 60;
                            } else {
                                duration = roam/2;
                            }
                            int random2 = rand.nextInt(duration);
                            totalRange = random2 * speed;
                            System.out.println("roaming for total range of " + totalRange + " in " + roam + " minutes");
                        }
                    } else if( genus.equals("canine") ){
                        int duration;
                        if( roam == 0 ){
                            duration = 60;
                            roam = 60;
                        } else {
                            duration = roam;
                        }
                        int random = rand.nextInt(duration);
                        Canine temp = (Canine)animalList.get((walkWhich-1));
                        int speed = temp.getSpeed();
                        totalRange = random * speed;
                        System.out.println("roaming for total range of " + totalRange + " in " + roam + " minutes");
                    }
                }
                System.out.println();
                System.out.println("Press ENTER to continue...");
                scanner.nextLine();
                help.cls();
            } else if( choice == 4 ){                                                                   //Release
                help.cls();
                help.displayAnimals( animalList );
                if( animalList.size() != 0 ){
                    int size = animalList.size();
                    int releaseWhich = help.reqRelease(size);
                    --releaseWhich;
                    int random = rand.nextInt(size);
                    String genus = animalList.get(releaseWhich).getGenus();
                    String gender = animalList.get(releaseWhich).getGender();
                    if( genus.equals("canine") ){
                        String randGenus = animalList.get(random).getGenus();
                        if( randGenus.equals(genus) ){
                            String randGender = animalList.get(random).getGender();
                            if( !gender.equals(randGender) ){
                                System.out.println("ruff ruff <3");
                                if( random > releaseWhich ){
                                    animalList.remove(releaseWhich);
                                    --random;
                                    animalList.remove(random);
                                } else {
                                    animalList.remove(random);
                                    --releaseWhich;
                                    animalList.remove(releaseWhich);
                                }
                                --canines;
                                --canines;
                            } else {
                                System.out.println("awooo!!");
                                animalList.remove(releaseWhich);
                                --canines;
                            }
                        }
                    } else if( genus.equals("feline") ){
                        String randGenus = animalList.get(random).getGenus();
                        if( randGenus.equals(genus) ){
                            String randGender = animalList.get(random).getGender();
                            if( !gender.equals(randGender) ){
                                System.out.println("meow meow <3");
                                if( random > releaseWhich ){
                                    animalList.remove(releaseWhich);
                                    --random;
                                    animalList.remove(random);
                                } else {
                                    animalList.remove(random);
                                    --releaseWhich;
                                    animalList.remove(releaseWhich);
                                }
                                --felines;
                                --felines;
                            } else {
                                System.out.println("hiss!!");
                                animalList.remove(releaseWhich);
                                --felines;
                            }
                        }
                    }
                }
                System.out.println();
                System.out.println("Press ENTER to continue...");
                scanner.nextLine();
                help.cls();
            }
            help.updateMoods( animalList, canines, maxCanines, felines, maxFelines );
        } while( choice != 5 );
    }
}
