package Tuesday;

public class Tue {
	// kopo05 김시현
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int kp5_i = 1; kp5_i < 10; kp5_i += 3) { // kp5_i가 1부터 9까지 i+3씩 반복
			// #출력
			System.out.println("************    ************    ************");
			System.out.printf(" 구구단 %d단      구구단 %d단      구구단 %d단\n", kp5_i, kp5_i + 1, kp5_i + 2);
			System.out.println("************    ************    ************");
			// #구구단 계산
			for (int kp5_j = 1; kp5_j < 10; kp5_j++) { // kp5_j가 1부터 10까지 1씩 증가하며 반복
				for (int kp5_k = kp5_i; kp5_k < kp5_i + 3; kp5_k++) {
					// kp5_k가 i부터 i+2까지 1씩 증가하며 반복
					System.out.printf(" %d * %d = %d\t", kp5_k, kp5_j, kp5_k * kp5_j); // 출력
				}
				System.out.println(); // 개행
			}
		}
	}
}
