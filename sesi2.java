import java.util.Scanner;

class smth {

	public static void main(String args[]){

		// int a = 5;
		// Integer b = 10;

		// String kata = b.toString();

		// String kata = "Binus University";

		// String huruf = kata.substring(0,5);
		// System.out.println(huruf);

		// String namaJalan = "Jl. Mawar Melati Street";
		// System.out.println(namaJalan.startsWith("Jl")); //true output, checks beginning parts of array
		// System.out.println(namaJalan.startsWith("Jalan")); //false output
		// System.out.println(namaJalan.endsWith("Street")); //true output, checks the last parts of array

		// String minuman = "Lemon Tea";
		// System.out.println(minuman.equals("Lemon Tea"));	//case sensitive, similar to strcmp
		// System.out.println(minuman.equalsIgnoreCase("lemon Tea"));	//ignore case, similar to strcmpi

		// int max = Math.max( 10, 8 );
		// System.out.println(max);

		// int min = Math.min( 10, 8 );
		// System.out.println(min);

		// int round = (int) Math.round( 2.67 );
		// System.out.println(round);

		// int ceil = (int) Math.ceil() 2.01 );
		// System.out.println(ceil);

		// int floor = (int) Math.floor( 2.01 );
		// System.out.println(floor);

		// double rand = Math.random()*100;
		// System.out.println((int)rand);	

		Scanner scan = new Scanner(System.in);

		// System.out.print("Input Angka : ");
		// int angka = 0;

		// try{
		// 	angka = scan.nextInt();
		// 	scan.nextLine();
		// } catch( Exception e ){
		// 	System.out.println("Error");
		// }
		// System.out.println(angka);

		String apaan = "";

		do{

			System.out.print("Input : ");
			apaan = scan.nextLine();

			if( apaan.equals("Water") ||
				apaan.equals("Tea") ||
				apaan.equals("Soda") ){
				break;
			}
		
		}while(true);

		System.out.println(apaan);


	}

}