package Q4;

public class Address {
	int doorNo;
	String city;
	String street;
	int pincode;
	public Address(int doorNo2, String city2, String street2, int pincode2) {
		this.doorNo=doorNo;
		this.city=city;
		this.street=street;
		this.pincode=pincode;
	}
	public String toString() {
		return "Address\n"+doorNo+city+street+pincode;
	}
}