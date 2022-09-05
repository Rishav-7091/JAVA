package MyOwnAutoShopProject;

public class Car {
	int speed;
	double regularPrice;
	String color;
	double getSalePrice;
	
	Car(int s, double rp, String c, double sp){
		this.speed=s;
		this.regularPrice=rp;
		this.color=c;
		this.getSalePrice=sp;
	}
	
	public int speed() {
		return speed;
	}
	public double regularPrice() {
		return regularPrice;
	}
	public String color() {
		return color;
	}
	public double getSalePrice() {
		return getSalePrice;
	}

}
