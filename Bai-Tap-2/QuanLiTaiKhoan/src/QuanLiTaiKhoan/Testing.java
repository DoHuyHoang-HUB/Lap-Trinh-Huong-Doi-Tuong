package QuanLiTaiKhoan;


public class Testing {
	public static void main(String[] args) {
		
//		TaiKhoanThe tk1 = new TheGhiNo(123, "Nguyen Hung", 5000000);
//		TaiKhoanThe tk2 = new TheGhiNo(122, "Nguyen Tuan Hung", 10000000);
//		TaiKhoanThe tk3 = new TheTinDung(125, "Tran Bi", 7000000, 5000000);
//		TaiKhoanThe tk4 = new TheTinDung(127, "Pham Van A", 3500000, 4000000);
//		TaiKhoanThe tk5 = new TheTinDung(126, "Le Hai", 4500000, 5000000);
//		TaiKhoanThe tk6 = new TheGhiNo(123, "Nguyen Thanh Tuan", 500000);
		
		TheGhiNo tk1 = new TheGhiNo(123, "Nguyen Hung", 5000000);
		TheGhiNo tk2 = new TheGhiNo(122, "Nguyen Tuan Hung", 10000000);
		TheTinDung tk3 = new TheTinDung(125, "Tran Bi", 7000000, 5000000);
		TheTinDung tk4 = new TheTinDung(127, "Pham Van A", 3500000, 4000000);
		TheTinDung tk5 = new TheTinDung(126, "Le Hai", 4500000, 5000000);
		TheGhiNo tk6 = new TheGhiNo(123, "Nguyen Thanh Tuan", 500000);
		
		DanhSachTaiKhoanThe ds = new DanhSachTaiKhoanThe();
		ds.themTaiKhoan(tk1);
		ds.themTaiKhoan(tk2);
		ds.themTaiKhoan(tk3);
		ds.themTaiKhoan(tk4);
		ds.themTaiKhoan(tk5);
		ds.themTaiKhoan(tk6);
		
		System.out.println(ds.toString());
		
		System.out.println("Ket qua tim kiem:");
		System.out.println(ds.timKiemTheGhiNoTheoTen("h"));
		
		System.out.println("Sua han muc:");
		if(ds.suaHanMucTinDung(126, 6000000)==true)
			System.out.println(">>Sua thanh cong.");
		else
			System.out.println(">>Khong sua duoc.");
		
		System.out.println("Danh sach sau khi sap xep:");
		ds.sapXepDanhSach();
		System.out.println(ds.toString());
		
		
	}
	
}
