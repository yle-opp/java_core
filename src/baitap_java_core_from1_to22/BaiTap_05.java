/**
 * 
 */
package baitap_java_core_from1_to22;

import java.util.Scanner;

/**
 * @author lâm yên 	
 *Viết chương trình nhập vào tọa độ A(x1, y1) và B(x2, y2) trên hệ trục toạ độ Oxy. 
 *Tính và in ra độ dài đoạn thẳng AB.
 */
public class BaiTap_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);

		// Khai báo biến , hằng số

		final String TEXT_TOADO_Ax = "Nhập tọa độ Ax1 : ";
		final String TEXT_TOADO_Ay = "Nhập tọa độ Ay1 : ";
		final String TEXT_TOADO_Bx = "Nhập tọa độ Bx2 : ";
		final String TEXT_TOADO_By = "Nhập tọa độ By2: ";
		final String KQ = "Độ dài đoạn thẳng AB là : ";

		double xA, yA, xB,yB;
		double kc;
		String chuoiketqua = "";

		// Bước 2: lấy dữ liệu người dùng
		System.out.print(TEXT_TOADO_Ax);
		xA = read.nextInt();
		System.out.print(TEXT_TOADO_Ay);
		yA = read.nextInt();
		
		System.out.print(TEXT_TOADO_Bx);
		xB = read.nextInt();
		System.out.print(TEXT_TOADO_By);
		yB = read.nextInt();

		// Code sử lý
		// Bước 3: tính độ dài đoạn thẳng AB
		kc= Math.sqrt(Math.pow((xA - xB),2)+  Math.pow((yA - yB),2)) ;//        double(x1.hd-d2.hd)*(d1.hd-d2.hd)+(d1.td-d2.td)*(d1.td-d2.td));
		System.out.println(KQ + kc);
		read.close();
	}
}
