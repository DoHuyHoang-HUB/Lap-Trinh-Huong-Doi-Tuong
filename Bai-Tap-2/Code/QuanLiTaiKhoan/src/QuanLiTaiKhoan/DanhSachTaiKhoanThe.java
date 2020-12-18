package QuanLiTaiKhoan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DanhSachTaiKhoanThe {
	private List<TaiKhoanThe> dsTaiKhoanThe;

	public DanhSachTaiKhoanThe() {
		super();
		dsTaiKhoanThe = new ArrayList<TaiKhoanThe>();
	}

	@Override
	public String toString() {
//		return "DanhSachTaiKhoanThe [dsTaiKhoanThe=" + dsTaiKhoanThe + "]";
		String string = "";

		for (TaiKhoanThe taiKhoanThe : dsTaiKhoanThe) {
			string += taiKhoanThe + "\n";
		}

		return string;
	}

	/**
	 * Thêm một tài khoản vào danh sách
	 * 
	 * @param taiKhoanThe
	 * @return false nếu thêm thất bại
	 * @return true nếu thêm thành công
	 */
	public boolean themTaiKhoan(TaiKhoanThe taiKhoanThe) {
		if (dsTaiKhoanThe.contains(taiKhoanThe))
			return false;
		else {
			dsTaiKhoanThe.add(taiKhoanThe);
			return true;
		}
	}

	/**
	 * Tìm kiếm thẻ ghi nợ theo tên
	 * 
	 * @param ten
	 * @return DanhSachTaiKhoanThe
	 */
	public DanhSachTaiKhoanThe timKiemTheGhiNoTheoTen(String ten) {
		DanhSachTaiKhoanThe list = new DanhSachTaiKhoanThe();

		for (TaiKhoanThe taiKhoanThe : dsTaiKhoanThe) {
			if (taiKhoanThe instanceof TheGhiNo)
				if (taiKhoanThe.getChuSoHuu().toLowerCase().contains(ten.toLowerCase())) {
					list.themTaiKhoan(taiKhoanThe);
				}
		}
		return list;
	}

	/**
	 * sửa hạn mức tín dụng khi biết mã thẻ
	 * 
	 * @param maThe
	 * @param hanMucMoi
	 * @return false nếu sử không thành công
	 * @return true nếu sử thành công
	 */
	public boolean suaHanMucTinDung(int maThe, double hanMucMoi) {

		for (TaiKhoanThe taiKhoanThe : dsTaiKhoanThe) {
			if (taiKhoanThe instanceof TheTinDung)
				if (taiKhoanThe.getMaThe() == maThe) {
					((TheTinDung) taiKhoanThe).setHanMuc(hanMucMoi);
					return true;
				}
		}
		return false;
	}

	/**
	 * Sắp xếp danh sách giảm dần theo mã thẻ
	 */
	public void sapXepDanhSach() {

		Collections.sort(dsTaiKhoanThe, new Comparator<TaiKhoanThe>() {

			@Override
			public int compare(TaiKhoanThe o1, TaiKhoanThe o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o2.getMaThe(), o1.getMaThe());
			}
		});
	}

}
