package dom.kh.chap01.after.model.vo;

public class Product {
	
	protected String brand;
	protected String pCode;
	protected String pName;
	protected int price;
	
	public String information() {
		return brand+", "+pCode+", "+pName+", "+price;
	}

	public Product(String brand, String pCode, String pName,
			int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
