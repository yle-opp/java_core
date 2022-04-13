/**
 * 
 */
package baitap_java_core_from1_to22;

import java.util.Scanner;

/**
 * @author Lâm Yên
 *Viết chương trình cho phép nhập vào một chuỗi viết thường, in ra chuỗi trên với 
 *các ký tự đầu tiên được viết in hoa.
 */
public class BaiTap_08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//code đầu vào
		Scanner sc = new Scanner(System.in);
	    String message = nhapLieu();
	   
	    //Code xử lý 
	    
	    System.out.print("Chuỗi sau khi đổi: \n" +covertString(message));
	 
	}
	public static String nhapLieu() {
		Scanner sc = new Scanner(System.in);
		String message;
		 System.out.print("Nhập vào chuỗi viết thường : ");
		  message = sc.nextLine();
		  return message;
	}
	public static String covertString(String message) {
		//B1:Khai báo mảng , sử dụng phương thức toArrayChar()
	    char[] charArray = message.toCharArray();
	    boolean foundSpace = true;
	    for(int i=0;i<charArray.length;i++) {
	    	if(Character.isLetter(charArray[i])) {
	    		//kiểm tra khoảng trắng trước chữ cái
	    		if(foundSpace) {
	    			charArray[i] = Character.toUpperCase(charArray[i]);
	    	          foundSpace = false;
	    		}
	    	}else {
				foundSpace = true;
			}
	    }
	    //chuyển đổi mảng char thành string
	  return  message = String.valueOf(charArray);
	}
}
