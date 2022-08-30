package MyOwnAutoShopProject;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		Sedan se= new Sedan(150,120000,"Red",110000,25);
		Ford f1 = new Ford(130,150000,"yellow",130000,2022,1000);
		Ford f2 = new Ford(180,200000,"black",180000,2021,2000);
		Car cr = new Car(100,80000,"blue",70000);
		
		System.out.println("Price of sedan Car\t"+se.getSalePrice());
		System.out.println("Price of first ford car\t"+f1.getSalePrice());
		System.out.println("Price of second ford car\t"+f2.getSalePrice());
		System.out.println("Price of car\t"+cr.getSalePrice());

	}

}
