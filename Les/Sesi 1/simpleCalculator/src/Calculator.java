public class Calculator{
	
	private Double total= 0.0;

	public void add( Double a){
		total += a;
	}

	public void div( Double a){
		total /= a;
	}

	public void showHeader(){
		System.out.println("Total= " + total);
	}

	public void clearTotal(){
		total = 0.0;
	}

	public void showMenu(){
		System.out.println("1. Addition");
		System.out.println("2. Division");
		System.out.println("3. Clear Total");
		System.out.println("4. Exit");
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
}