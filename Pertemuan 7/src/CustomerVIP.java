
public class CustomerVIP extends Customer {
	
	// CustomerVIP adalah class yang dibuat lagi dari parent Customer
	// Keyword extends diartikan sebagai class ini diturunkan oleh siapa (dalam contoh ini diturunkan oleh Customer)
	// Sehingga semua atribute yang ada di class Customer dimiliki oleh CustomerVIP layaknya CustomerNormal
	// Class ini mirip dengan CustomerNormal tapi kita bisa ubah isinya *jika diperlukan*
	// Sehingga kita tidak perlu membuat class yang baru dengan copy paste atributenya
	
	public CustomerVIP(String name,int money) {
		// keyword super ini berarti kita memanggil constructor si parent class
		super(name,money);
	}

	@Override
	public void buy() {
		// untuk override method buy sama namanya dengan CustomerNormal
		// tetapi berbeda tergantung kita di class siapa
		// nama dan parameter bisa sama karena diturunkan dari si parent
		
		int cashback = 0;
		cashback = Main.totalPrice * 5 / 100;
		money = money - Main.totalPrice + cashback; 
	}

}
