package Tuesday;

public class Tue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kp5_iWeekday = 5; // ���ۿ���(�ݿ���)
		int[] kp5_iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; 
		// 1������ 12�������� ������ ��

		for (int kp5_iMon = 0; kp5_iMon < 12; kp5_iMon++) { // 1������ 12������ �Ѵ޾� ����
			System.out.printf("      %4d��\n", kp5_iMon + 1); // �ش� �� ���
			System.out.println("=====================");
			System.out.println("�� �� ȭ �� �� �� ��");
			for (int i = 0; i < kp5_iWeekday; i++) { // �ش� ���� 1�� ������ �������
				System.out.printf("   ");
			}
			for (int j = 1; j <= kp5_iEnd[kp5_iMon]; j++) { 
				// 1�Ϻ��� �ش� ���� ������ �ϱ��� 1�� �����ϸ� ���
				System.out.printf("%2d ", j);
				kp5_iWeekday = kp5_iWeekday + 1;

				if (kp5_iWeekday % 7 == 0) { // kp5_iWeekday%7�� ����� 0�� ��
					System.out.println(); // ����(�ٹٲ�)
					kp5_iWeekday = 0; // kp5_iWeekday �ʱ�ȭ
				}
			}
			System.out.printf("\n\n");
		}
	}
}

