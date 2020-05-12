import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        MainHelper help = new MainHelper();
        ArrayList<Runner> runnerList = new ArrayList<>();

        int choice = -1;
        int hareWins = 0, turtleWins = 0;
        help.printTitle();
        int totalDistance = help.genDistance();

        while( choice != 4 ){

            help.printMenu();
            choice = -1;

            while( choice < 1 || choice > 4 ){
                try{
                    System.out.print("Choice >> ");
                    choice = scan.nextInt();
                } catch (Exception e){
                    choice = -1;
                } finally {
                    scan.nextLine();
                }
            }

            if( choice == 1 ){                          //add runner
                help.cls();
                Runner x;
                String type, name;
                int len;

                /**
		 * do {
                 *   System.out.print("Which animal will you rooting for [hare | turtle]? ");
                 *   type = scan.nextLine();
                 * } while (!type.equals("turtle") && !type.equals("hare"));
		*/

		Type _type = Type.UNDEFINED;

		do {
			System.out.print("Which animal will you rooting for [hare | turtle]? ");
			_type = Type.from( scan.nextLine() );
		} while ( _type.isUndefined() );

                do {
                    System.out.print("What's the name [5 -15 characters]? ");
                    name = scan.nextLine();
                    len = name.length();
                } while (!(len > 4 & len < 16));


		/**
		 * if( type.equals("turtle") ) {
                 *   x = new Turtle( name, 0 );
                 * } else {
                 *   x = new Hare( name, 0 );
                 * }
		*/

		x = Runner.create(_type, name, 0);

                runnerList.add(x);
                System.out.println("Another runner has joined the race!!");
                help.holdUser();
            } else if ( choice == 2 ){                  //join run
                help.cls();
                help.printGenData();
                totalDistance = help.genDistance();
                do{
                    help.printRunHeader(totalDistance);
                    int i = 0;
                    String out;
                    for(Runner runner: runnerList){
                        runner.updateDistance();
                    }
                    Collections.sort( runnerList, new SortByDistance() );
                    for(Runner runner: runnerList){
                        ++i;
                        String name = runner.getName();
                        String type;
                        if( runner instanceof Hare ){
                            type = "Hare";
                        } else {
                            type = "Turtle";
                        }
                        int distance = runner.getDistance();
                        out = String.format("+ %-3d | %-15s | %-6s | %-10d +", i, name, type, distance);
                        System.out.println(out);
                    }
                    System.out.println("+=============================================+");
                }while( runnerList.get(0).distance < totalDistance );
                Runner winner = runnerList.get(0);
                System.out.println();
                System.out.print(winner.getName());
                if( winner instanceof Hare ){
                    System.out.println(" The Hare takes the 1st place!!");
                    ++hareWins;
                } else {
                    System.out.println(" The Turtle takes the 1st place!!");
                    ++turtleWins;
                }
                help.holdUser();
                help.resetDistance( runnerList );
            } else if ( choice == 3 ){                  //view standing
                help.cls();
                if( hareWins > turtleWins ){
                    help.printHareLeads();
                } else if( turtleWins > hareWins ){
                    help.printTurtleLeads();
                } else {
                    help.printDraw();
                }
                help.printStatusHeader();
                String out = String.format("+ %14d | %14d +", hareWins, turtleWins);
                System.out.println(out);
                System.out.println("+=================================+");
                help.holdUser();
            }
        }
    }
}
