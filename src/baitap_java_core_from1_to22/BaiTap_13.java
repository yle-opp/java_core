/**
 * 
 */
package baitap_java_core_from1_to22;

import java.lang.reflect.Array;
import java.util.Arrays;
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
		xuatMang(mang);
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
				xuLyLuaChon(luaChon, mang);
			}
		}while(true);
	}
	public static void nhapMang(int[] mang, Scanner sc) {
		for (int i = 0; i < mang.length; i++) {
			System.out.print("Phần tử thứ  "+ (i+1)+ " là : ");
			mang[i] = sc.nextInt();
		}
	}
	
	
	public static void menu() {
		System.out.println("\n----------------Menu------------");
		System.out.println("1a.Tính giá trị trung bình. ");
		System.out.println("2b.Tìm phần tử lớn nhất, nhỏ nhất. ");
		System.out.println("3c.Tìm phần tử âm lớn nhất, nhỏ nhất trong mảng");
		System.out.println("4d.Tìm phần tử dương lớn nhất, nhỏ nhất trong mảng.");
		System.out.println("5e.In ra các phần tử chẵn, lẻ");
		System.out.println("6f.Thêm một phần tử theo index ");
		System.out.println("7g.Xóa một phần tử theo index");
		
		
	}
	
	public static void xuLyLuaChon(int chon,int[] mang) {
		switch (chon) {
		case 1:
			double tbc=tinhTrungBinhCong(mang);
			System.out.println("Giá trị trung bình cộng của mảng: " + tbc);
			break;
		case 2:
			minMaxInArray(mang);
			break;
		case 3:
			minMaxInArray(mang);
			break;
		case 4:
			minMaxInArray(mang);
			break;
		case 5:
			System.out.println("Các phần tử chẵn trong mảng là: ");
			soNguyenDuongChan(mang);
			System.out.println("Các phần tử lẻ trong mảng là: ");
			soNguyenDuongLe(mang);
			break;

		case 6:
			themPhanTuIndex(mang);
			break;
		case 7:

			break;
		

		default:
			System.exit(0);
		}
		
	}

	
	public static void xuatMang(int[] mang) {
		System.out.print("Giá trị mảng mà bạn đã nhập là : ");
		for (int i = 0; i < mang.length; i++) {
			System.out.print(mang[i] + " ");
			
		}
	}
	
	
	public static double tinhTrungBinhCong(int[] mang) {
		double total = 0;
		for (int i = 0; i < mang.length; i++) {
			total = total + mang[i];
		}
		 double average = total / mang.length;
		 return average;
	}
	
	public static void minMaxInArray(int[] mang) {
		int max = mang[0];
		int min = mang[0];
		//dùng vòng lặp for duyệt các phần tử trong mảng. so sánh max với từng phần tử nếu số nào lớn hơn max thì gán nó cho max.
	    // cứ lặp như vậy cho đến hết các phần tử thì max sẽ là giá trị lớn nhất trong mảng
		for (int i = 0; i < mang.length; i++) {
			if(mang[i]>max) {
				max = mang[i];
			}
			if(mang[i]<min) {
				min = mang[i];
			}
		}
		System.out.println("\nSố lớn nhất trong mảng là: " + max);
		System.out.println("\nSố nhỏ nhất trong mảng là: " + min);
	}
	public static void soNguyenDuongLe(int[] mang) {
		for(int i = 0; i<mang.length; i++) {
			if(mang[i]%2!=0) 
			System.out.println( mang[i]+ "");
			//i += 1; // cộng trước
			// i= 0 duyet 0 
		}
	}
	public static void soNguyenDuongChan(int[] mang) {
		
		for(int i = 0; i<mang.length; i++) {
			if(mang[i]%2==0) 
				System.out.println( mang[i]+ "");
		}
	}
	
	public static void themPhanTuIndex(int[] mang) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập index phần tử muốn thêm: ");
		// Lấy độ dài mảng ban đầu
        int n = mang.length;
		int addIndex = sc.nextInt();
		System.out.print("Phần tử thứ  "+ (addIndex)+ " là : ");
		mang[addIndex] = sc.nextInt();
		// mang = Arrays.copyOf(mang, n + 1);
		//xuatMang(mang);
	}
}
