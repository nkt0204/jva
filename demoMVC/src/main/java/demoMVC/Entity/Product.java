package demoMVC.Entity;

public class Product {
	private int idP;
	private String nameP;
	private String phone;
	private String discriptionP;

	public Product() {
		super();
	}

	public int getIdP() {
		return idP;
	}

	public void setIdP(int idP) {
		this.idP = idP;
	}

	public String getNameP() {
		return nameP;
	}

	public void setNameP(String nameP) {
		this.nameP = nameP;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDiscriptionP() {
		return discriptionP;
	}

	public void setDiscriptionP(String discriptionP) {
		this.discriptionP = discriptionP;
	}

}
