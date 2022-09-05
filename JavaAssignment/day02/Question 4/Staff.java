package Q4;

public class Staff extends Employee {

	Staff(int empid, String empName, double basicPay, int noOfLeaves) {
		super(empid, empName, basicPay, noOfLeaves);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calSalary() {
		// TODO Auto-generated method stub
		return 0.18*basicPay;
	}
	public String toString() {
		return empName+empid;
	}

}
