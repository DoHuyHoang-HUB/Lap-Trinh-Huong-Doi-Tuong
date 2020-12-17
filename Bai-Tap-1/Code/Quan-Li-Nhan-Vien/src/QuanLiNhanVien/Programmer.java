package QuanLiNhanVien;

import java.text.NumberFormat;
import java.util.Locale;

public class Programmer extends Employee {
	protected String theLanguage;

	public String getTheLanguage() {
		return theLanguage;
	}

	public void setTheLanguage(String theLanguage) {
		this.theLanguage = theLanguage;
	}

	public Programmer(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theLanguage) {
		super(thePayrollNumber, theName, theBasicMonthlySalary);
		setTheLanguage(theLanguage);
	}

	public Programmer() {

	}

	@Override
	public String toString() {
		
		Locale locale = new Locale("en", "US");
		NumberFormat formatMoney = NumberFormat.getCurrencyInstance(locale);
		return String.format("%s   %-10s   %20s",super.toString(), theLanguage, formatMoney.format(getMonthlySalary()));
	}

	@Override
	public double getMonthlySalary() {
		if (theLanguage.equalsIgnoreCase("java"))
			return super.getTheBasicMonthlySalary() + 0.2 * super.getTheBasicMonthlySalary();
		return super.getTheBasicMonthlySalary();
	}

}
