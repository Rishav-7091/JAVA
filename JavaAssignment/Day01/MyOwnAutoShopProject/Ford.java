package MyOwnAutoShopProject;

public class Ford extends Car{
	
	int year;
	double manufacturerDiscount;
	
	Ford(int s, double rp, String c, double sp, int year, double md) {
		super(s, rp, c, sp);
		this.year=year;
		this.manufacturerDiscount=md;
	}
	
	public int year() {
		return year;
	}
	
	public double manufacturerDiscount() {
		return manufacturerDiscount;
	}
	
	public double getSalePrice() {
		return (getSalePrice-manufacturerDiscount);		
	}
	

}
