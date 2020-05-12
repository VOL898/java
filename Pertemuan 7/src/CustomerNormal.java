
public class CustomerNormal extends Customer {
	
	// CustomerNormal adalah child dari Customer
	// Keyword extends diartikan sebagai class ini diturunkan oleh siapa (dalam contoh ini diturunkan oleh Customer)
	// Sehingga semua atribute yang ada di class Customer dimiliki oleh CustomerNormal
	// Class ini bisa kita tambahkan atribut yang kita mau *jika diperlukan*
	
	public CustomerNormal(String name,int money) {
		// keyword super ini berarti kita memanggil constructor si parent class
		super(name, money);
	}

	@Override
	public void buy() {
		// untuk override method buy sama namanya dengan CustomerVIP
		// tetapi berbeda tergantung kita di class siapa
		// nama dan parameter bisa sama karena diturunkan dari si parent
		
		money -= Main.totalPrice;
	}

}
