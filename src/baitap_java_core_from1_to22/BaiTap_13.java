/**
 * 
 */
package baitap_java_core_from1_to22;

import java.util.Scanner;

/**
 * @author Lâm Yên
 *
 */
public class BaiTap_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soPhanTu, luaChon;
		int[] mang;
		Scanner sc = new Scanner(System.in);
		
		//Bước 2: Lấy thông tin từ người dùng
		do {
			System.out.println("Nhập số phần tử của mảng: ");
			soPhanTu = sc.nextInt();
			if (soPhanTu <= 0) {
				System.out.println("Bạn phải nhập số lớn hơn 0!");
			}
			
		}while(soPhanTu <=0 );
		
		//Khởi tạo mạng
		mang = new int[soPhanTu];
		System.out.println("---------------1.NHẬP MẢNG---------------");
		nhapMang(mang,sc);
		//danh sách lựa chọn
		menu();
		
		//Nhập lựa chọn
		do {
			System.out.println("Nhập vào lựa chọn (Số từ 0 -> 10): ");
			luaChon = sc.nextInt();
			if (luaChon < 0 || luaChon > 10) {
				System.out.println("Bạn phải nhập vào các số từ 0 -> 10!");
			}
			else {
				xuLyLuaChon(luaChon);
			}
		}while(true);
	}
	public static void nhapMang(int[] mang, Scanner sc) {
		for (int i = 0; i < mang.length; i++) {
			System.out.println("Phần tử thứ "+ (i+1));
			mang[i] = sc.nextInt();
		}
	}
	
	public static void menu() {
		System.out.println("----------------Menu------------");
		System.out.println("a.Tính giá trị trung bình. ");
		System.out.println("b.Tìm phần tử lớn nhất, nhỏ nhất. ");
		System.out.println("c.Tìm phần tử âm lớn nhất, nhỏ nhất trong mảng");
		System.out.println("d.Tìm phần tử dương lớn nhất, nhỏ nhất trong mảng.");
		System.out.println("e.TIn ra các phần tử chẵn, lẻ");
		System.out.println("f.Thêm một phần tử theo index ");
		System.out.println("g.Xóa một phần tử theo index");
		
		
	}
	
	public static void xuLyLuaChon(int chon) {
		switch (chon) {
		case 1:
			System.out.println("hihi");
			break;
		case 2:

			break;
		case 3:

			break;
		case 4:

			break;
		case 5:

			break;

		case 6:

			break;
		case 7:

			break;
		case 8:

			break;
		case 9:

			break;
		case 10:

			break;

		default:
			System.exit(0);
		}
		
	}

	
	public static void xuatMang(int[] mang) {
		for (int i = 0; i < mang.length; i++) {
			System.out.println(mang[i] + " ");
			
		}
	}
}
