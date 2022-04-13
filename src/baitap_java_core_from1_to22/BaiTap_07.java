/**
 * 
 */
package baitap_java_core_from1_to22;

import java.util.Scanner;

/**
 * @author Lâm Yên
 * Viết chương trình cho phép nhập vào một số tự nhiên và in ra các ước số của số 
 * tự nhiên đó
 */
public class BaiTap_07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //khai báo biến number = 50
		int n = nhapLieu();
	    System.out.println("\nCác ước số của "+ n +" là: " );
	    //xử lý code
	    //sử dụng vòng lặp for lặp từ 1 đến number, với bước nhảy ++
	    for(int i = 1; i <= n; i++){
	      //nếu number chia hết cho i thì in i ra màn hình
	      if(n % i == 0){
	        System.out.print(i + "\t");
	      }
	    }

	}
	public static int nhapLieu() {
		Scanner sc = new Scanner(System.in);
		
		int n; 
		do {
			System.out.print("Nhập số nguyên n lớn hơn 1: ");
			 n = sc.nextInt();
		}while(n<1);
		return n;
	}
	
	
}
