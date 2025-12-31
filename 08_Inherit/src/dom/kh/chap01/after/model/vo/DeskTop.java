package dom.kh.chap01.after.model.vo;

public class DeskTop extends Product{
	
	private boolean allInOne;
	
	
	public DeskTop(String brand, String pCode, String pName,
			int price, boolean allInOne) {
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;
	}


	public boolean isAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	
	public String information() {
		 //return getBrand() + ", " +getpCode()+", "+getpName()+
		 // ", "+getPrice()+", "+isAllInOne();
		
		return super.information()+", "+allInOne;
		 
	}
	
	
}
