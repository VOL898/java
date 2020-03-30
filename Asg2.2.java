import java.util.Scanner;

class alpha{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char input = scan.next().charAt(0);
		if( (input >= 'a' && input <= 'z') 
			|| (input >= 'A' && input <= 'Z') 
			|| (input >= '0' && input <= '9')){
			System.out.println("The character '" + input + "' is alphanumeric");
		} else {
			System.out.println("The character '" + input + "' is not alphanumeric");
		}
	}
}