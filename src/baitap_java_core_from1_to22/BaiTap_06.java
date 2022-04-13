/**
 * 
 */
package baitap_java_core_from1_to22;

import java.util.Scanner;

/**
 * @author lâm yên
 *Viết chương trình cho phép nhập vào một chuỗi, in ra chuỗi theo thứ tự ngược lại 
 *(VD: nhập vào Cybersoft, in ra tfosrebyC
 */
public class BaiTap_06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.print("nhập vào một chuỗi: ");
		String string = reader.nextLine();
		daoNguocChuoi(string);
		
		reader.close();
	}
	
	 public static void daoNguocChuoi(String str)
	    {
	        String[] chuoi = str.split(" ");
	        String daoChuoiString = "";
	        for (int i = 0; i < chuoi.length; i++)
	        {
	            String kiTu = chuoi[i];
	            String daoKiTu = "";
	            for (int j = kiTu.length()-1; j >= 0; j--)
	            {
	            	daoKiTu = daoKiTu + kiTu.charAt(j);
	            }
	            daoChuoiString = daoChuoiString + daoKiTu + " ";
	        }
	        System.out.println("Chuỗi đạo ngược là: "+daoChuoiString);
	    }
}
