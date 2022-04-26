package Tuesday;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tue2 {
	// kopo5 김시현
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("신용승인");
		System.out.println("단말기 : 2N68665898          전표번호 : 041218");
		System.out.println("가맹점 : 한양김치찌개");
		System.out.printf("%s\n", "주  소 : 경기 성남시 분당구 황새울로351번길 10,\n 1층");
		System.out.println("대표자 : 유창신");
		System.out.println("752-53-00558                     TEL : 7055695");
		System.out.println("----------------------------------------------");
		int kp5_iPrice = 22000; // 합계
		double kp5_tax = 1.1; // 부가세 10%
		double price = kp5_iPrice / kp5_tax; // 금액
		if (price != (double) ((int) price)) {
			price = (int) price + 1; // 수수료 올림처리
		} else {
			price = (int) price;
		}
		DecimalFormat df = new DecimalFormat("###,###,###,###,###");

		System.out.printf("금  액 :      %30s원\n", df.format((int) price));
		System.out.printf("부과세 :      %30s원\n", df.format((kp5_iPrice - (int) price)));
		System.out.printf("합  계 :      %30s원\n", df.format(kp5_iPrice));
		System.out.println("----------------------------------------------");
		System.out.println("우리카드");
		System.out.println("카드번호 : 5387-20**-****-4613(S)       일시불");

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String datetime = sdf.format(date);
		

		System.out.printf("거래일시 : %s\n", datetime);
		System.out.println("승인번호 : 70404427");
		System.out.println("거래번호 : 357734873739");
		System.out.println("매입 : 비씨카드사             가맹 : 720068568");
		System.out.println("알림 : EDC매출표");
		System.out.println("문의 : TEL)1544-4700");
		System.out.println("----------------------------------------------");
		System.out.println("                 * 감사합니다 *               ");
		System.out.println("                            표준V2.08_20200212");
	}
}
