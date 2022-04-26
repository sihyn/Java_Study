package Tuesday;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tue3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("             \"국민가게, 다이소\"");
		System.out.println("(주)아성다이소_분당서현점");
		System.out.println("전화:031-702-6016");
		System.out.println("본사:서울 강남구 남부순환로 2748 (도곡동)");
		System.out.println("대표:박정부,신호섭 213-81-52063");
		
		System.out.printf("%s","매장:경기도 성남시 분당구 분당로53번길 11 (서현"
				+ "동)\n");
		System.out.println("===============================================");
		System.out.println("        소비자중심경영(CCM) 인증기업");
		System.out.println("      ISO 9001 품질경영시스템 인증기업");
		System.out.println("===============================================");
		System.out.println("        교환/환불 14일(03월12일)이내");
		System.out.println("(전자)영수증, 결제카드 지참 후 구입배장에서 가능");
		System.out.println("      포장/가격 택 훼손시 교환/환불 불가");
		System.out.println("       체크카드 취소 시 최대 7일 소요");
		System.out.println("===============================================");
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String datetime = sdf.format(date);
		System.out.printf("[POS 1058231]               %s\n",datetime);
		System.out.println("===============================================");
		String[] kp5_item = { "비말차단용마스크", "슬라이드식명찰", "인테리어후크" }; //String 과자종류 배열
		int[] kp5_price = { 3000, 1000, 1000 }; //상품가격(단가) 배열
		int[] kp5_amount = { 1, 1, 1}; //상품 개수 배열
		double kp5_taxRate = 0.1; //세율
		int kp5_totalSum = 0; //int형 kp5_totalSum생성 후 초기화

		for (int kp5_i = 0; kp5_i < kp5_item.length; kp5_i++) { //0부턴 과자의 개수의 배열길이만큼 반복
			int kp5_sum = kp5_price[kp5_i] * kp5_amount[kp5_i]; //과자가격 = 상품가격*개수
			kp5_totalSum = kp5_totalSum + kp5_sum; //지불금액 = 과자들 가격의 합
			System.out.printf("%-12s\t %8d %4d %8d\n", kp5_item[kp5_i], kp5_price[kp5_i], kp5_amount[kp5_i], kp5_sum);
			//항목-단가-수량-합계 순으로 출력
		}
		int kp5_totalNetprice = (int) (kp5_totalSum / (1 + kp5_taxRate)); //과세금액
		System.out.printf("%20s%23d\n","과세합계", kp5_totalNetprice); //과세금액 출력
		int kp5_tax = kp5_totalSum - kp5_totalNetprice; //세금 = 지불금액-과세금액
		System.out.printf("%20s%23d\n","부가세",kp5_tax);
		System.out.println("-----------------------------------------------");
		System.out.printf("판매합계: %37d\n", kp5_totalSum); //지불금액 출력
		System.out.println("===============================================");
		System.out.printf("신용카드: %37d\n", kp5_totalSum);
		System.out.println("-----------------------------------------------");
		System.out.println("우리카드                       538720**********");
		System.out.printf("승인번호 77982843(0)              승인금액 %d\n",kp5_totalSum);
		System.out.println("===============================================");
		SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String datentime = df.format(date);
		System.out.printf("%27s 분당서현점\n",datentime);
		System.out.println("상품 및 기타 문의 : 1522-4400");
		System.out.println("멤버십 및 샵다이소 관련 문의 : 1599-2211");
		System.out.println("-----------------------------------------------");
		System.out.println("◈ 다이소 멤버십 앱 또는 홈페이지에 접속하셔서");
		System.out.println("  회원가입 후 다양한 혜택을 누려보세요 ◈");
	}

}
