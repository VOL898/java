import java.util.Vector;

public abstract class Customer {
	
	// Customer sebagai parent class yang dapat di turunkan ke child class
	// Nantinya si class Customer ini akan di inherit (diturunkan)
	// Contoh yang ada di pertemuan ini : di inherit ke CustomerNormal dan CustomerVIP
	// Nantinya si CustomerNormal dan CustomerVIP sama sama punya atribut dan method dari Customer
	
	public String name;
	public int money;
	
	Vector<String> itemName = new Vector<>();
	Vector<Integer> itemPrice = new Vector<>();
	
	public Customer(String name,int money) {
		this.name = name;
		this.money = money;
	}
	
	public abstract void buy();

}
