package Tuesday;

public class Tue {
	// kopo05 �����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int kp5_i = 1; kp5_i < 10; kp5_i += 3) { // kp5_i�� 1���� 9���� i+3�� �ݺ�
			// #���
			System.out.println("************    ************    ************");
			System.out.printf(" ������ %d��      ������ %d��      ������ %d��\n", kp5_i, kp5_i + 1, kp5_i + 2);
			System.out.println("************    ************    ************");
			// #������ ���
			for (int kp5_j = 1; kp5_j < 10; kp5_j++) { // kp5_j�� 1���� 10���� 1�� �����ϸ� �ݺ�
				for (int kp5_k = kp5_i; kp5_k < kp5_i + 3; kp5_k++) {
					// kp5_k�� i���� i+2���� 1�� �����ϸ� �ݺ�
					System.out.printf(" %d * %d = %d\t", kp5_k, kp5_j, kp5_k * kp5_j); // ���
				}
				System.out.println(); // ����
			}
		}
	}
}
