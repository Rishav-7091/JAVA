package day02;

public class EmpMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester T =new Tester(121,"Ramesh",3000);
		Manager e1 = new Manager(122,"Mithun",333);
		Developer d= new Developer(123,"Pavan",2000);
		
		//Manager e =new Manager();
		//e.display();
		e1.Cal();
		e1.dispManger();
		d.devSalary();
		d.disDev();
		T.salCal(1000);
		T.display();
		
		}

}