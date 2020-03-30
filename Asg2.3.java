import java.util.Scanner;

class whichCase{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char input = scan.next().charAt(0);
		if( input >= 'a' && input <= 'z' ){
			System.out.println("The character '" + input + "' is lowercase");
		} else if( input >= 'A' && input <= 'Z' ) {
			System.out.println("The character '" + input + "' is uppercase");
		} else {
			System.out.println("The character '" + input + "' is neither lowercase or uppercase");
		}
	}
}

