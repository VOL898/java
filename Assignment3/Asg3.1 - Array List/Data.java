public class Data{

	private String name;
	private String pass;
	private String phone;

	public void set(String name, String pass, String phone){
		this.name = name;
		this.pass = pass;
		this.phone = phone;
	}

	public String getName() { return name; }

	public String getPass() {
	    return pass;
	}

	public String getPhone() {
	    return phone;
	}
}