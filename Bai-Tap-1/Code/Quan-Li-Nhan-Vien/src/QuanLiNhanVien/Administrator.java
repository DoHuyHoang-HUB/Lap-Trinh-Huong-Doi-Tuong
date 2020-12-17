package QuanLiNhanVien;

import java.text.NumberFormat;
import java.util.Locale;

public class Administrator extends Employee {
	private String theDepartment;

	public String getTheDepartment() {
		return theDepartment;
	}

	public void setTheDepartment(String theDepartment) {
		this.theDepartment = theDepartment;
	}

	public Administrator(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theDepartment) {
		super(thePayrollNumber, theName, theBasicMonthlySalary);
		setTheDepartment(theDepartment);
	}

	public Administrator() {

	}

	@Override
	public String toString() {
		Locale locale = new Locale("en", "US");
		
		NumberFormat formatMoney = NumberFormat.getCurrencyInstance(locale);
		return String.format("%s   %-10s   %20s", super.toString(), theDepartment, formatMoney.format(getMonthlySalary()));
	}

	@Override
	public double getMonthlySalary() {
		return super.getTheBasicMonthlySalary() + 0.4 * super.getTheBasicMonthlySalary();
	}
}
