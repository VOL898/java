import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	// Declare Customer cust terlebih dahulu
	// yang nantinya saat sudah memilih CustomerNormal/CustomerVIP baru dibuat object
	Customer cust;
	
	public Main() {
		// TODO Auto-generated constructor stub
		
		/*
		 * Input data diri dari si pengguna
		 */
		System.out.print("input name : ");
		String name = scan.nextLine();
		System.out.println("input money : ");
		int money = scan.nextInt();
		scan.nextLine();
		
		String type = "";
		do{
			System.out.println("Type [VIP | Normal] :");
			type = scan.nextLine();
		}while(!type.equals("VIP") && !type.equals("Normal"));
		
		// menggunakan kerangka si parent dan yang dijadikan objectnya adalah child
		if(type.equals("VIP")){
			cust = new CustomerVIP(name,money);
		}else{
			cust = new CustomerNormal(name,money);
		}
		
		
		
		int menu = 0;
		do{
			System.out.println("Nama: " + cust.name);
			System.out.println("Money: "+ cust.money);
			System.out.println("Type: "+ type);
			System.out.println("1. Choose item");
			System.out.println("2. Shopping Cart");
			System.out.println("3. Buy");
			System.out.println("4. Exit");
			System.out.print(">> ");
			menu = scan.nextInt();
			
			switch(menu){
			case 1 : System.out.println(); chooseItem();
				break;
				
			case 2 : System.out.println(); shoppingCart();
				break;
				
			case 3 : System.out.println(); buy();
				break;
			}
			
		}while(menu != 4);
		
	}
	
	static int totalPrice = 0;
	private void chooseItem() {
		// TODO Auto-generated method stub
		int choice = 0;
		do{
			System.out.println("1. Ayam Goreng - 7000");
			System.out.println("2. Nasi Goreng - 10000");
			System.out.println("3. Back");
			System.out.print(">> ");
			choice = scan.nextInt();
			scan.nextLine();
			
			switch(choice){
				case 1 :
					cust.itemName.add("Ayam Goreng");
					cust.itemPrice.add(7000);
					totalPrice += 7000;
					break;
					
				case 2 :
					cust.itemName.add("Nasi Goreng");
					cust.itemPrice.add(10000);
					totalPrice += 10000;
					break;
			}
			
		}while(choice != 3);
		
	}
	
	private void shoppingCart() {
		// TODO Auto-generated method stub
		int choice = 0;
		do{
			
			for(int i = 0 ; i < cust.itemName.size() ; i++){
				System.out.println(i+1 +". " + cust.itemName.get(i) + " - " + cust.itemPrice.get(i));
			}
			System.out.println();
			System.out.println("Total price : " + totalPrice);
			System.out.println();
			
			System.out.println("1. Reset");
			System.out.println("2. Back");
			System.out.print(">> ");
			choice = scan.nextInt();
			scan.nextLine();
			
			switch(choice){
				case 1 :
						cust.itemName.clear();
						cust.itemPrice.clear();
						totalPrice=0;
					break;
				case 2 :
					break;
			}
			
		}while(choice != 2);
		
	}
	
	private void buy() {
		// Method yang dipanggil buy berasal dari Customer
		// karena overriding, jadi method buy yang dipanggil tergantung dari object cust apa yang digunakan
		// contoh : jika diawal milih VIP, maka method buy yang dipanggil berasal dari class VIP
		cust.buy();
		cust.itemName.clear();
		cust.itemPrice.clear();
		totalPrice=0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
