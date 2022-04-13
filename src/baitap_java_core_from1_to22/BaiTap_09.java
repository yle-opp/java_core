/**
 * 
 */
package baitap_java_core_from1_to22;

import java.util.Scanner;

/**
 * @author Lâm Yên
 * Viết chương trình cho phép nhập vào 2 số nguyên dương (từ 10 đến 99), in TRUE 
nếu 2 số trên có cùng một hoặc 2 chữ số, ngược lại in ra FALSE (VD: (12, 81) => true, 
(23, 89) => false)
 *
 */
public class BaiTap_09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n, n2; 
		do {
			System.out.print("Nhập số nguyên n lớn hơn 10 và nhỏ hơn 99 : ");
			 n = sc.nextInt();
			 System.out.print("Nhập số nguyên n2 lớn hơn 10 và nhỏ hơn 99 : ");
			 n2 = sc.nextInt();
		}while((n<10 && n>99) ||( n2<10 && n2>99));
	    //xử lý code
		Boolean check = checkFalseTrueforN(n,n2);
		if(check==true) {
			System.out.println(n +" và " + n2 + " Hai số nguyên có số trên cùng một hay hai chữ số ");
		}else {
			System.out.println(n +" và " + n2 + " Hai số nguyên không có số trên cùng một hay hai chữ số ");
		}
		
		
	}

	
	public static boolean checkFalseTrueforN(int n, int n2) {
		int donViN,  donViN2 , hangChucN, hangChucN2;
		donViN = n%10;
		hangChucN = n/10;
		donViN2 = n2%10;
		hangChucN2 = n2/10;
		if(donViN==donViN2 ||hangChucN==hangChucN2 ||donViN==hangChucN2 || donViN2==hangChucN) {
			return true;
		}else {
			return false;
		}
		
		
		
		
	}

}
