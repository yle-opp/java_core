/**
 * 
 */
package baitap_java_core_from1_to22;

import java.util.Scanner;

/**
 * @author Lâm Yên
 * Viết chương trình cho phép nhập vào số tự nhiên n (từ 1 đến 9) và in ra tam giác 
 * vuông có độ dài tương ứng. VD: nhập vào số 4 sẽ in ra kết quả:
 */
public class BaiTap_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    int n;
	    do {
	    	System.out.printf("\n\nNhập vào số tự nhiên n (từ 1 đến 9): ");
	 	    n = sc.nextInt();
	    }while(n<1 && n>9);
	   
	    for (int i = 1; i <= n; ++i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print(j);
	      }
	      System.out.println();
	    }
	}

}
