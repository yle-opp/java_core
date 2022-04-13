/**
 * 
 */
package baitap_java_core_from1_to22;

import java.util.Scanner;

/**
 * @author T470S
 *Viết chương trình cho phép nhập vào số tự nhiên n, in ra tổng các số nguyên tố 
 *từ 1 đến n,
 */
public class BaiTap_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        int i =0;
        int num =0;
        String  primeNumbers = "";
        int tong = 0;
        System.out.println("Nhập vào số n:");
        int n = scanner.nextInt();
        scanner.close();
        for (i = 1; i <= n; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
            	tong = tong + i ;
            	primeNumbers = primeNumbers + i +" ";
            }
        }
        System.out.println("Các số nguyên tố từ 1 đến n là : " +primeNumbers);
        System.out.println("Tổng số nguyên tố từ 1 đến "+ n +" là:" + tong);
        

	}

}
