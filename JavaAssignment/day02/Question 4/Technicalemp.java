package Q4;

public class Technicalemp extends Employee {
	String skill;
	Technicalemp(int empid, String empName, double basicPay,int noOfLeaves,String skill){
		super(empid,empName,basicPay,noOfLeaves);
		this.skill=skill;
		
	}
	@Override
	public double calSalary() {
		// TODO Auto-generated method stub
		double hra=0.12*basicPay;
		return 0.12*basicPay +hra;
	}
	public String toString() {
		return empName+""+empid;
	}
}