package Q4;

public class Usingppl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Technicalemp t=new Technicalemp(101,"Ramesh",10000,5,"Java");
		Staff s =new Staff(102,"Raju",5000,3);
		Address a = new Address(1001,"Bangalore","BtmLayout",57232);
		Address a1 = new Address(1021,"Bangalore","JPnagar",57234);
		System.out.println(a.toString());
		System.out.println(t.toString());
		System.out.println("Technical staff salary"+t.calSalary());
		System.out.println("------------staff----------------");
		System.out.println(a1.toString());
		System.out.println(s.toString());
		System.out.println("Staff salary"+s.calSalary());
		
		
	}

}