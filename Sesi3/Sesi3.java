import java.util.Vector;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Sesi3{
	public static void main(String ...args){

		int[] x = new int[100];
		int y[] = new int[100];

		//int x[100]; salah

		System.out.println(x.length);
		System.out.println(y.length);

		//===VECTORS=======================================================
		Vector<Integer> intVector = new Vector<Integer>();
		intVector.add(12);
		intVector.add(10);
		intVector.add(1);

		System.out.println(intVector); //to print whole list
		System.out.println(intVector.get(0));//to print which

		//===HashMap=======================================================
		HashMap<String, String> capitalCity = new HashMap<String, String>();

		capitalCity.put("Indonesia", "Jakarta");
		capitalCity.put("England", "London");
		capitalCity.put("Germany", "Berlin");

		System.out.println(capitalCity);
		System.out.println(capitalCity.get("England")); //outputs London

		//===ArrayList=======================================================
		ArrayList<String> stringAL = new ArrayList<String>();

		int choice = 0;
		Scanner in = new Scanner(System.in);

		do{

			cls();

			System.out.println("1. Insert");
			System.out.println("2. Update");
			System.out.println("3. Delete");
			System.out.println("4. Clear");
			System.out.println("5. View");
			System.out.println("6. Exit");
			System.out.print("Your Choice: ");
			choice = in.nextInt();
			in.nextLine();

			if( choice == 1 ){
				System.out.print("Input String: ");
				String input = in.nextLine();
				stringAL.add(input);
			} else if( choice == 2 ){				
				int i = 1;
				for ( String j: stringAL ) {
					System.out.println(i + "|" + j);
					++i;
				}
				System.out.print("Input Index: ");
				int update = in.nextInt();
				in.nextLine();
				System.out.print("Input Updated String: ");
				String updated = in.nextLine();
				stringAL.set(update-1,updated);
			} else if( choice == 3 ){
				int i = 1;
				for ( String j: stringAL ) {
					System.out.println(i + "|" + j);
					++i;
				}
				System.out.print("Input Index: ");
				int idx = in.nextInt();
				in.nextLine();
				stringAL.remove(idx-1);
				System.out.println("Data in index "+idx+" has been removed");
				in.nextLine();
			} else if( choice == 4 ){
				stringAl.clear();
				System.out.println("All data cleared");
				in.nextLine();
			} else if( choice == 5 ){
				int i = 1;
				for ( String j: stringAL ) {
					System.out.println(i + " | " + j);
					++i;
				}
			}

		} while( choice != 6 );


	}

	//void view

	void cls(){
		for ( int i = 0; i < 25 ; i++ ) {
			System.out.println();
		}
	}
}