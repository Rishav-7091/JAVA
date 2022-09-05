package day02;

public class Tester extends Employee{
	double testerSal;
	Tester(int empId,String empName,double empSal){
		super(empId,empName,empSal);
	}
	public double salCal(int empSal) {
		testerSal =empSal*20;
		return testerSal ;
		
	}
	public void  display() {
		System.out.println("emplyoo id"+empId+"name"+empName);
		System.out.println("Salary of tester"+testerSal);
	}

}
