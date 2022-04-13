/**
 * 
 */
package baitap_java_core_from1_to22;

/**
 * @author T470S
 *
 */
public class InQuocKyMy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// n là chiều dọc lá cờ , i 
		// m chiều ngang lá cờ , j 
		
		int i, j, m= 46, n = 14, ji;
		System.out.println("");
		for (i = 1; i <= n; i++) {
			if (i <= 9) {
				if (i % 2 == 0) {
					
					for (j = 1; j <= m-5 ; j++) {
						if (j < 6) {
							System.out.print(" *");
						} else if (j == 6 || j == 7) {
							System.out.print(" ");
						} else {
							System.out.print("=");
						}
					}

				} else {
					for (j = 1; j <= m-6 ; j++) {

						if (j < 7) {
							System.out.print("* ");
						} else {
							System.out.print("=");
						}

					}
				}
			} else if (i >= 10) {
				for (j = 1; j <= m; j++) {
					System.out.print("=");

				}

			}
			System.out.println("");
		}

	}
		
}


