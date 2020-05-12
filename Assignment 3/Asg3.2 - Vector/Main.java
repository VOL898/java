import java.util.Scanner;
import java.util.Vector;

public class Main{
	public static void main(String ...args){

		Scanner in =  new Scanner(System.in);
		Vector<Data> dataList = new Vector<>();
		MainHelper help = new MainHelper();

		int choice = -1;
		while ( choice != 4 ) {

			help.showMenu();
			
			do{
		        try{
		          System.out.print("Your Choice: ");
		          choice = in.nextInt();
		        } catch (Exception e) {
		          System.out.println("Invalid Choice!");
		          choice = -1;
		        } finally {
		          in.nextLine();
		        }
		    } while (choice < 1 || choice > 4);

			if( choice == 1 ){	//input data
				Data data = new Data();

				System.out.print("Name: ");
				String tempName = in.nextLine();

				System.out.print("Pass: ");
				String tempPass = in.nextLine();

				System.out.print("Phone: ");
				String tempPhone = in.nextLine();

				data.set(tempName,tempPass,tempPhone);
				dataList.add(data);

				//cls();

				System.out.println("New Data Added!");
				//in.nextLine();

				//cls();

			} else if( choice == 2 ){	//shows data

				//cls();

				help.printHeader();
				help.showData(dataList);
				//in.nextLine();

				//cls();

			} else if( choice == 3 ){	//delete which data

				//cls();

				if( dataList.isEmpty() ){
					System.out.println("		|No data exists!|				");
					//in.nextLine();

				} else {
					help.printHeader();
					help.showData(dataList);
					
					int deleteWhich = -1;
					do{

						try{
							System.out.print("Input data number to be deleted: ");
							deleteWhich = in.nextInt();
						} catch (Exception e){
							deleteWhich = -1;
						} finally {
							in.nextLine();
						}

					} while ( deleteWhich < 1 || deleteWhich > dataList.size() );

					--deleteWhich;
					help.deleteData(dataList, deleteWhich);
					//cls();
					System.out.println("Data is removed");
					//in.nextLine();
				}

				//cls();
			
			}
			
 		}

	}

	/*static void //cls(){
		for ( int i = 0; i < 25 ; ++i ) System.out.println();
	}*/

}