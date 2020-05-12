import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double total = 0;
        System.out.println("Calculator");
        System.out.println("==========");
        System.out.println("Total = " + total);
        System.out.print("\n");
        
        System.out.print("Input number : ");
        double num = scan.nextDouble();
        total += num;
        
        String prin[] = {"1. Addition", "2. Substraction", "3. Multiplication", "4. Division", "5. Modulo", "6. Clear Total", "7. Exit"};
        
        while(true){
            for(int i=0;i<7;++i)
                System.out.println(prin[i]);
            System.out.print("Operator [1...7]: ");
            int which = scan.nextInt();
            
            if(which == 7)
                break;
            else if(which == 6)
                total = 0;
            else{
                System.out.print("Input number : ");
                num = scan.nextDouble();
                if(which == 1)
                    total += num;
                else if(which == 2)
                    total -= num;
                else if(which == 3)
                    total *= num;
                else if(which == 4)
                    total /= num;
                else
                    total %= num;
            }
            
            System.out.println("Calculator");
            System.out.println("==========");
            System.out.println("Total = " + total);
            System.out.print("\n");
        }
    }

}