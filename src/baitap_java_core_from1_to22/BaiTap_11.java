/**
 * 
 */
package baitap_java_core_from1_to22;

import java.util.Scanner;

/**
 * @author T470S
 *Viết chương trình cho phép nhập vào số tự nhiên n, in ra số tự nhiên lớn nhất nhỏ 
 *hơn log2 (n)
 */
public class BaiTap_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
       
        System.out.print("Nhập vào số n:");
        int n = scanner.nextInt();
       int temp = 0;
        //code xử lý
        int result = (int)(Math.log(n) / Math.log(2)); // giá trị log2(n)
        for(int i=n; i>1; i--) {
        	 if(i<result) {
        		 temp = i; 
        	 }
        }
        
		
        System.out.println("Sô tự nhiên lớn nhất nhỏ hơn log2(n) là  : " +temp);	
        System.out.println("Log2(n) = : " +result);	
		scanner.close();
	}

}
