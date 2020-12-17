/**
 * 
 */
package QuanLiNhanVien;

/**
 * @author Nguyen-Hung
 *
 */
public class ProjectLeader extends Programmer{

	/**
	 * @param thePayrollNumber
	 * @param theName
	 * @param theBasicMonthlySalary
	 * @param theLanguage
	 */
	public ProjectLeader(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theLanguage) {
		super(thePayrollNumber, theName, theBasicMonthlySalary, theLanguage);
	}
	
	@Override
	public double getMonthlySalary() {

		return super.getTheBasicMonthlySalary() + 0.2 * super.getTheBasicMonthlySalary();
	}
}
