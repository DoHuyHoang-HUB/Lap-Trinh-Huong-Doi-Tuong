package QuanLiTaiKhoan;

public class TheTinDung extends TaiKhoanThe {
	private double hanMuc; // hạn mức tín dụng
	private double tongChiTieu;

	public double getHanMuc() {
		return hanMuc;
	}

	public void setHanMuc(double hanMuc) {
		if (hanMuc >= 0)
			this.hanMuc = hanMuc;
		else
			this.hanMuc = 0;
	}

	public double getTongChiTieu() {
		return tongChiTieu;
	}

	public void setTongChiTieu(double tongChiTieu) {
		if (tongChiTieu >= 0)
			this.tongChiTieu = tongChiTieu;
		else
			this.tongChiTieu = 0;
	}

	public TheTinDung(int maThe, String chuSoHuu, double hanMuc, double tongChiTieu) {
		super(maThe, chuSoHuu);
		setHanMuc(hanMuc);
		setTongChiTieu(tongChiTieu);
	}

	public TheTinDung() {

	}

	@Override
	public String toString() {
//		return "TheTinDung [hanMuc=" + hanMuc + ", tongChiTieu=" + tongChiTieu + "]";
		return String.format("%s %-15.0f %-15.0f ", super.toString(), hanMuc, tongChiTieu);
	}

	@Override
	public boolean kiemTraKhaNangChiTieu() {
		if (tongChiTieu <= hanMuc)
			return true;
		return false;
	}
}
