/**
 * 
 */
package baitap_java_core_from1_to22;

import java.util.Scanner;

/**
 * @author Lâm Yên
 *
 */
public class BaiTapSoHai {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// code dau vao
		Scanner scan = new Scanner(System.in);

		System.out.print("Nhập số nguyên n: ");
		int n = scan.nextInt();
		String heSoHai = convertNumber(n, 2);
	        System.out.println("So " + n + " trong he co so 2 = "
	                + heSoHai);
	       // System.out.println("So " + heSoHai + " trong he co so 10 = " + NhiPhanToThapPhan1(heSoHai, 2));
	     //chuyển heSoHai thành kiểu số 
	      int m = Integer.parseInt(heSoHai);
	      System.out.println("So " + heSoHai + " trong he co so 10 = " + NhiPhanToThapPhan2(m));
	      
	      scan.close();
	}
	/**
     * chuyển đổi số nguyên n sang hệ cơ số 2
     * @param n: so nguyen
     * @param b: he co so 2
     * @return he co so 2
     */
    public static String convertNumber(int n, int b) {
        if (n < 0 || b < 2 ) {
            return "";
        }
         
        StringBuilder sb = new StringBuilder();
        int soNguyen = n;
         
        while (soNguyen > 0) {
          
            sb.append(soNguyen % b);
            soNguyen = soNguyen / b;
        }
        return sb.reverse().toString();
    }
    public static int NhiPhanToThapPhan1(String n, int b) {
       
    	//Cách 1 
    	if (n ==null || n.isEmpty() || b > 2 ) {
            return 0;
        }
        int m;
        int t=1;
        int heSo10=0;
        int ij=0;
        for(int i = 0; i< n.length(); i++) {
        	 ij  = n.length()-i;
        	 m = Integer.parseInt(String.valueOf(n.charAt(i))); //chuyễn chuỗi thành số
        	 for(int j = ij-1; j >= 0 ;j--) {
        		 //lặp mảng ngược lại
        		 t=1;
        		t= (int) (t*Math.pow(b, j));
        		break;
     		}
        	 heSo10 = heSo10 + m*t;
        }
        return heSo10;   
    }
    //Cách 2
    public static int NhiPhanToThapPhan2(int nhiPhan){
    		 
            int coSo10 = 0;
            int p = 0;
            while(true){
                if(nhiPhan == 0){
                    break;
                } else {
                    int temp = nhiPhan%10;
                    coSo10 += temp*Math.pow(2, p);
                    nhiPhan = nhiPhan/10;
                    p++;
                }
            }
            return coSo10;
        }
}
