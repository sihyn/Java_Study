package JavaUp6;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class javaUp6 {
	// kopo05 김시현
	// static변수(전역변수)
	static Date date = new Date();
	static Calendar kp5_cal = Calendar.getInstance();
	static DecimalFormat kp5_money = new DecimalFormat("###,###,###,###,###");
	
	static String[] kp5_item = { "노브랜드 국산콩두부", "삼다수2L", "[한국야쿠르트]윌 오리지날 150mlx5개", "[삼립]토종 효모로 만든 로만밀 통밀식빵",
			"뽀로로 칼슘왕 치즈", "노브랜드 담백한 살코기참치 90g", "마이 카페라떼 220ml*6입 기획", "한율 자연을 닮은 시트마스크 1매", "CJ더건강한등심슬라이스250g",
			"스타벅스 네스프레소 캡슐 커피 10종 모음", "팅글6kcal 곤약젤리 머스캣맛 130g 1팩", "[피코크]스키니 팝콘 18g", "[CJ]쁘티첼 밀감 90g3",
			"부드러운 추억의 강냉이 300g", "[키친델리]참치마요 고추김밥_마일드", "맛있는 오뚜기 컵밥(중량) 27종 택1 모음전", "CJ스팸싱글마일드80g",
			"세빌 프리미엄 블랙 올리브(피티드)385g", "Google play 기프트 코드 1만 5천원권", "[농심]올리브 짜파게티(140gx5입)", "팔도비빔면 130g*4개",
			"피코크 유기농 클렌즈 콤부차 뷰티(석류)", "[동서]동서 보리차(10g티백*30개입)", "동원 더 바삭한 양반 식탁김 100g", "호주산 오이스터 블레이드 샤브샤브용(100g)(팩)",
			"화이트골드 커피믹스 250입", "강릉초당두부 550g", "[매일]소화가 잘되는 저지방 우유 930ml", "[빙그레]바나나맛 우유(240ml4개)960ml",
			"[DoubleA]더블에이 복사지 A4 500매", "온더바디 수퍼보타닉 세이지 바디워시" };
	// 가격배열
	static int[] kp5_price = { 3280, 980, 7500, 2380, 3680, 1080, 6580, 1500, 7480, 6500, 800, 680, 3200, 2980, 3900,
			2580, 2580, 2680, 15000, 4280, 2680, 1680, 2080, 8980, 4480, 30900, 2480, 3290, 4900, 5900, 3900 };
	// 상품가격(단가)배열
	static int[] kp5_amount = { 1, 3, 1, 2, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 1, 2, 1, 3, 1, 2,
			2, 1 }; // 상품 개수 배열
	static boolean[] kp5_taxfree = { true, false, false, false, true, false, false, false, false, true, false, false,
			false, false, false, true, false, false, true, false, false, false, true, false, false, true, false, false,
			true, false, false }; // 면세,비면세
	static double kp5_taxRate = 0.1; // 세율
	static int kp5_totalSum1 = 0; // int형 kp5_totalSum1생성 후 초기화
	static int kp5_totalSum2 = 0; // int형 kp5_totalSum1생성 후 초기화
	static int kp5_finaltotal = 0; // 합계

	public static void TitlePrint() { // 타이틀 출력

		System.out.println("            이마트 죽전점 (031)888-1234");
		System.out.println("emart       206-86-50913 강희석");
		System.out.println("            용인 수지구 포은대로 552");
		System.out.println("영수증 미지참시 교환/환불 불가");
		System.out.println("정상상춤에 한함, 30일 이내(신선 7일)");
		System.out.println("※일부 브랜드매장 제외(매장 고지물참조");
		System.out.println("교환/환불 구매점에서 기능(결제카드 지참)");
	}

	public static void BuyTimePrint() { // 구매시간 출력

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String datetime = sdf.format(date);
		System.out.printf("[구매] %s\t    POS:0011-9861\n", datetime);
	}

	public static void HeaderPrint() { // 헤더 출력
		System.out.println("-----------------------------------------");
		System.out.printf("%-13s%8s%4s%7s\n", "  상품명", "단 가 ", "수량 ", "금 액 ");
	}

	public static int itemPrint(int kp5_i) { // 물품 출력

		if (kp5_i % 5 == 0) { // 물품의 개수를 5개마다 구분
			System.out.println("-----------------------------------------");
		}

		int kp5_sum1 = kp5_price[kp5_i] * kp5_amount[kp5_i]; // 면세
		int kp5_sum2 = kp5_price[kp5_i] * kp5_amount[kp5_i]; // 면세X

		if (kp5_taxfree[kp5_i] == true) { // 면세
			System.out.printf("* "); // 면세품이면 *을 앞에 추가
			String kp5_result = kp5_subStringByte(kp5_item[kp5_i], 15); // 15바이트로 끊음
			System.out.printf("%8s", kp5_result);

			System.out.printf("%10s%3s %10s\n", kp5_money.format(kp5_price[kp5_i]), kp5_amount[kp5_i],
					kp5_money.format(kp5_sum1));
			kp5_totalSum1 = kp5_totalSum1 + kp5_sum1; // 면세물품 총합

		} else if (kp5_taxfree[kp5_i] == false) { // 면세X
			System.out.printf("  ");
			String kp5_result = kp5_subStringByte(kp5_item[kp5_i], 15); // 15바이트로 끊음
			System.out.printf("%8s", kp5_result);
			System.out.printf("%10s%3s %10s\n", kp5_money.format(kp5_price[kp5_i]), kp5_amount[kp5_i],
					kp5_money.format(kp5_sum2));
			kp5_totalSum2 = kp5_totalSum2 + kp5_sum1; // 과세물품 총합
		}
		return kp5_i;
	}

	public static void TotalPrint() { // 합계 세액 등을 출력

		int kp5_totalamount = 0; // 총 품목 수량
		kp5_totalamount = kp5_item.length; // 총 품목 수량
		kp5_finaltotal = kp5_totalSum1 + kp5_totalSum2; // 결제대상금액

		int kp5_netprice = (int) (kp5_totalSum2 / (1 + kp5_taxRate));// 세전가격(과세물품)
		int kp5_itemtax = kp5_totalSum2 - kp5_netprice; // 부과세

		System.out.printf("\n               총 품목 수량%14s\n", kp5_totalamount);
		System.out.printf("            (*)면 세  물 품%14s\n", kp5_money.format(kp5_totalSum1));
		System.out.printf("               과 세  물 품%14s\n", kp5_money.format(kp5_netprice));
		System.out.printf("               부   가   세%14s\n", kp5_money.format(kp5_itemtax));
		System.out.printf("               합        계%14s\n", kp5_money.format(kp5_finaltotal));
		System.out.printf("%-18s%17s\n", "결 제 대 상 금 액", kp5_money.format(kp5_finaltotal));
	}

	public static void LastPrint() { // 영수증 밑부분 출력

		kp5_cal.add(Calendar.MINUTE, -50);
		DecimalFormat kp5_money = new DecimalFormat("###,###,###,###,###");
		System.out.println("-----------------------------------------");
		System.out.println("0012 KEB 하나       541707**0484/35860658");
		System.out.printf("카드결제(IC)%26s\n", "일시불 / " + kp5_money.format(kp5_finaltotal));
		System.out.println("-----------------------------------------");
		System.out.println("           [신세계포인트 적립]           ");
		System.out.println("홍*두 고객님의 포인트 현황입니다.        ");
		int kp5_point = 5473; // 기존 포인트
		int kp5_pointadd = 164; // 금회발생포인트
		int kp5_mypoint = kp5_point + kp5_pointadd; // 누계포인트
		System.out.printf("금회발생포인트       9350**9995%10s\n", kp5_pointadd);
		System.out.printf("누계(가용)포인트          %s(%8s)\n", kp5_money.format(kp5_mypoint), kp5_money.format(kp5_point));
		System.out.println("*신세계포인트 유효기간은 2년입니다.      ");
		System.out.println("-----------------------------------------");
		System.out.println("   구매금액기준 무료주차시간 자동부여    ");
		System.out.println("차량번호 :                       34저****");
		SimpleDateFormat kp5_dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// SimpleDateFormat으로 날짜와 시간 출력 형태 지정
		System.out.printf("입차시간 :%31s\n", kp5_dateformat.format(kp5_cal.getTime()));
		// 입차시간은 구매시간보다 이른 시간으로
		System.out.println("-----------------------------------------");
		System.out.printf("캐셔:084599 양OO                     1150\n");
		System.out.printf("%40s\n", "||||||||||||||||||||||||||||||||||  ");
		System.out.printf("%40s\n", "||||||||||||||||||||||||||||||||||  ");
		SimpleDateFormat kp5_today = new SimpleDateFormat("yyyyMMdd");
		// SimpleDateFormat으로 날짜 출력 형태 지정
		String kp5_todate = kp5_today.format(date);
		System.out.printf("%14s/00119861/00164980/31\n", kp5_todate);
	}

	public static void main(String[] args) { // 메인 메서드
		// TODO Auto-generated method stub
		int itemCount = 31; // 항목이 몇개인지
		TitlePrint(); // 영수증 맨 위 타이틀 출력
		BuyTimePrint(); // 구매시간 출력
		HeaderPrint(); // 헤더(상품명,단가,수량,금액)출력
		for (int kp5_i = 0; kp5_i < itemCount; kp5_i++) { // 0부터 물품개수만큼 반복
			itemPrint(kp5_i); // 항목갯수만큼 항목인쇄
		}
		TotalPrint(); // 합계 세액 등을 출력
		LastPrint(); // 영수증 밑부분 출력
	}

	public static String kp5_subStringByte(String kp5_item, int kp5_byteLength) { // 길이 자르는 메서드

		if (kp5_item.getBytes().length > kp5_byteLength) { // item의 byte의 길이 > 자르기를 원하는 byte길이
			StringBuffer kp5_strbf = new StringBuffer(kp5_byteLength); // StringBuffer생성
			int kp5_lengthcnt = 0; // lengthcnt 초기화

			for (char kp5_ch : kp5_item.toCharArray()) {
				// char형 변수 ch생성 <= String형 문자열(item)을 char형 배열로 바꿈
				// 반환되는 배열의 길이는 문자열의 길이와 같다.
				kp5_lengthcnt += String.valueOf(kp5_ch).getBytes().length;
				// (ch의 값을 string문자열로 바꿈)<이 문자열의 바이트의 길이를 lengthcnt에 계속 더함
				if (kp5_lengthcnt > kp5_byteLength) { // lengthcnt의 길이가 byteLength의 길이를 넘어서면
					break; // break;
				}
				kp5_strbf.append(kp5_ch); // 길이가 넘어서지 않으면 ch를 더한다
			}
			kp5_item = kp5_strbf.toString(); // item = strbf를 string으로
		}
		// 빈칸출력
		String kp5_blank = "";
		int kp5_itemlength = kp5_item.getBytes().length;

		for (int j = 0; j < kp5_byteLength - kp5_itemlength; j++) {
			kp5_blank += " "; // 끊고자않는 바이트 길이-물품이름의 바이트 길이만큼 빈칸추가
		}
		return kp5_item + kp5_blank; // item + blank값 리턴하기
	}
}
