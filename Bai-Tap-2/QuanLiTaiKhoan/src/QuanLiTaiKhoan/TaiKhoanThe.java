package QuanLiTaiKhoan;

public abstract class TaiKhoanThe {
	private int maThe;
	private String chuSoHuu; // chủ sở hữu

	public int getMaThe() {
		return maThe;
	}

	public void setMaThe(int maThe) {
		if (maThe >= 0)
			this.maThe = maThe;
		else
			this.maThe = 0;
	}

	public String getChuSoHuu() {
		return chuSoHuu;
	}

	public void setChuSoHuu(String chuSoHuu) {
		if (!chuSoHuu.equals(""))
			this.chuSoHuu = chuSoHuu;
		else
			this.chuSoHuu = "XXX";
	}

	public TaiKhoanThe(int maThe, String chuSoHuu) {
		super();
		setMaThe(maThe);
		setChuSoHuu(chuSoHuu);
	}

	public TaiKhoanThe() {
		this(0, "XXX");
	}

	@Override
	public String toString() {
//		return "TaiKhoanThe [maThe=" + maThe + ", chuSoHuu=" + chuSoHuu + "]"; 
		return String.format("%-10d %-20s", maThe, chuSoHuu);
	}
	
	public abstract boolean kiemTraKhaNangChiTieu() ;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maThe;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaiKhoanThe other = (TaiKhoanThe) obj;
		if (maThe != other.maThe)
			return false;
		return true;
	}
	
	
}
