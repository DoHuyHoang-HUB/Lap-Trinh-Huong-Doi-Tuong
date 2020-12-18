package QuanLiTaiKhoan;

public class TheGhiNo extends TaiKhoanThe {
	private double soDu;

	public double getSoDu() {
		return soDu;
	}

	public void setSoDu(double soDu) {
		if (soDu >= 0)
			this.soDu = soDu;
		else
			this.soDu = 0;
	}

	public TheGhiNo(int maThe, String chuSoHuu, double soDu) {
		super(maThe, chuSoHuu);
		setSoDu(soDu);
	}

	public TheGhiNo() {

	}

	@Override
	public String toString() {
//		return "TheGhiNo [soDu=" + soDu + "]";
		return String.format("%s %-15.0f", super.toString(), soDu);
	}

	@Override
	public boolean kiemTraKhaNangChiTieu() {
		if (soDu >= 100000)
			return true;
		return false;
	}

}
