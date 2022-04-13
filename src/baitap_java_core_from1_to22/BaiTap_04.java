/**
 * 
 */
package baitap_java_core_from1_to22;

import java.util.Scanner;

/**
 * @author lâm yên 
 *Viết chương trình cho phép nhập vào một số tự nhiên và in ra tổng các chữ số 
 * của số tự nhiên đó
 */
public class BaiTap_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Code đầu vào
		Scanner read = new Scanner(System.in);

		// Khai báo biến , hằng số

		final String TEXT_SONGUYEN = "Nhập số nguyên n:";
		final String KQ = "Tổng của chữ số = : ";
		final String TEXT_THONGBAO = "Vui lòng nhập số nguyên :";

		int soN, soDu;
		// Bước 2: lấy dữ liệu người dùng
		System.out.print(TEXT_SONGUYEN);
		soN = read.nextInt();

		// Code sử lý
		// Bước 3: tính tổng
		int tong = 0;
		while (soN > 0) {
	        soDu = soN % 10; // thực hiện phép chia lấy dư số đó cho 10 
	        soN = soN / 10; // chia sô nguyen dương cho 10 , sau đó cộng số dư lại với nhau 
	        tong += soDu;
	    }
				
		System.out.println(KQ  + tong);	
		read.close();
	}
	
}
