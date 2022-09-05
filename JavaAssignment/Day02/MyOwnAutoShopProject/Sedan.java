package MyOwnAutoShopProject;

public class Sedan extends Car{

	int length;
	
	Sedan(int s, double rp, String c, double sp, int le) {
		super(s, rp, c, sp);
		this.length=le;
		
	}
	
	
	public double getSalePrice() {
		if(length>20) {
			return (getSalePrice-(getSalePrice*0.05));
		}
		else {
			return (getSalePrice-(getSalePrice*0.1));
		}
	}
	
	

}
