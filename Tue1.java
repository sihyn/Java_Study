package Tuesday;

public class Tue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kp5_iWeekday = 5; // 시작요일(금요일)
		int[] kp5_iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; 
		// 1월부터 12월까지의 마지막 일

		for (int kp5_iMon = 0; kp5_iMon < 12; kp5_iMon++) { // 1월부터 12월까지 한달씩 증가
			System.out.printf("      %4d월\n", kp5_iMon + 1); // 해당 달 출력
			System.out.println("=====================");
			System.out.println("일 월 화 수 목 금 토");
			for (int i = 0; i < kp5_iWeekday; i++) { // 해당 달의 1일 전까지 공백출력
				System.out.printf("   ");
			}
			for (int j = 1; j <= kp5_iEnd[kp5_iMon]; j++) { 
				// 1일부터 해당 달의 마지막 일까지 1씩 증가하며 출력
				System.out.printf("%2d ", j);
				kp5_iWeekday = kp5_iWeekday + 1;

				if (kp5_iWeekday % 7 == 0) { // kp5_iWeekday%7의 결과가 0일 때
					System.out.println(); // 개행(줄바꿈)
					kp5_iWeekday = 0; // kp5_iWeekday 초기화
				}
			}
			System.out.printf("\n\n");
		}
	}
}

