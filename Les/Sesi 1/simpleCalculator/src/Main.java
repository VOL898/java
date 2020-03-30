//import Calculator;
import java.util.Scanner;

public class Main{
	public static void main(String ...args){

		Calculator simpleCalculator = new Calculator();
		Scanner in = new Scanner(System.in);
		simpleCalculator.showHeader();
		System.out.print("Input number: ");
		Double a = in.nextDouble();
		simpleCalculator.setTotal(a);
		simpleCalculator.showMenu();
		System.out.print("Operator [1...4]: ");
		int operator = in.nextInt();
		System.out.print("Input number: ");
		Double b = in.nextDouble();

		for(;;) {

			if(operator == 1){
				simpleCalculator.add(b);
			} else if(operator == 2){
				simpleCalculator.div(b);
			} else if(operator == 3){
				simpleCalculator.clearTotal();
			} else if(operator == 4){
				break;
			}

			simpleCalculator.showHeader();
			simpleCalculator.showMenu();
			System.out.print("Operator [1...4]: ");
			operator = in.nextInt();
			if( operator == 3 ){
				continue;
			}
			System.out.print("Input number: ");
			b = in.nextDouble();
		}
	}
}