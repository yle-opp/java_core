/**
 * 
 */
package tinh_tien_karaoke;

import java.util.Scanner;

/**
 * @author T470S
 * = 3 Tieng gia 30k(000)/1gio
>30 - 30% of 30k(1h) -- 30%/30; 30k*0.3 = 90 
nuoc 10k
9h-24h -- gio 9<giobadau< gioketthuc (24)
9h-17h -- discount 20% 
----------
input : gioBatDau, gioKetThuc, soChaiNuoc , tenphonghat
--------soPhong ---- 
 */
public class TinhTienKaraoke {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String TEXT_TENPHONG = "Nhập tên phòng tính tiền : ";
		final String TEXT_TGBD = "Nhập thời gian bắt đầu : ";
		final String TEXT_TGKQ = "Nhập thời gian kết thúc : ";
		final String TEXT_SLUONG = "Nhập số lượng chai nước : ";
		final int 	 DONGIA_GIO  = 30000;
		final int 	 DONGIA_NUOC  = 10000;
		final int 	 BAGIO_DAU  = 3;
		final String TEXT_TB = "Tổng tiền của phòng : ";
		
		Scanner scanner = new Scanner(System.in);
		
		int gioBatDau,gioKetThuc,soChaiNuoc,soGio,tongTien;
		
		String tenphonghat;
		String chuoiKetQua;
		do{
			System.out.printf(TEXT_TENPHONG);
			tenphonghat = scanner.nextLine();
			System.out.printf(TEXT_TGBD);
			gioBatDau = scanner.nextInt();
			System.out.printf(TEXT_TGKQ);
			gioKetThuc = scanner.nextInt();
			System.out.printf(TEXT_SLUONG);
			soChaiNuoc = scanner.nextInt();
			
			
		}while(gioBatDau<=9 && gioKetThuc>=24);
		
		soGio=gioKetThuc-gioBatDau;
		if(soGio <= 3 && gioBatDau >= 9 && gioKetThuc <= 17 ){
			
			tongTien=soGio*DONGIA_GIO*80/100;
			
		}else if(gioBatDau>=9 && gioKetThuc<=17 && soGio>3) {
			
			tongTien=(soGio*DONGIA_GIO*50/100); //30%+20%
			
		}else if(gioBatDau>=9 && gioKetThuc<=24 && soGio<3) {
			
			tongTien=soGio*DONGIA_GIO;
			
		}else {
			//if(gioBatDau >= 9 && gioKetThuc <= 24 && soGio > 3)
			int soGioConLai = soGio-BAGIO_DAU;
			tongTien=(soGioConLai*DONGIA_GIO*70/100*20/100)+(BAGIO_DAU*DONGIA_GIO*20/100);
		}
		if(soChaiNuoc != 0) {
			tongTien +=(soChaiNuoc*DONGIA_NUOC);
		}
		
		System.out.println(TEXT_TB + tenphonghat +" là: " + tongTien+ "VND");
		
	}
	
}
