package MyOwnAutoShopProject;

public class Truck extends Car{
	
	int weight;

	Truck(int s, double rp, String c, double sp) {
		super(s, rp, c, sp);
		
	}
	public int weight() {
		return weight;
	}
	public double getSalePrice () {
		double disp;
		if(weight>2000) {
			disp = (regularPrice-(regularPrice*0.1));
		}
		else {
			disp = (regularPrice-(regularPrice*0.2));
		}
		return disp;
	}

}
