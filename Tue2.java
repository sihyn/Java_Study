package Tuesday;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tue2 {
	// kopo5 �����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("�ſ����");
		System.out.println("�ܸ��� : 2N68665898          ��ǥ��ȣ : 041218");
		System.out.println("������ : �Ѿ��ġ�");
		System.out.printf("%s\n", "��  �� : ��� ������ �д籸 Ȳ�����351���� 10,\n 1��");
		System.out.println("��ǥ�� : ��â��");
		System.out.println("752-53-00558                     TEL : 7055695");
		System.out.println("----------------------------------------------");
		int kp5_iPrice = 22000; // �հ�
		double kp5_tax = 1.1; // �ΰ��� 10%
		double price = kp5_iPrice / kp5_tax; // �ݾ�
		if (price != (double) ((int) price)) {
			price = (int) price + 1; // ������ �ø�ó��
		} else {
			price = (int) price;
		}
		DecimalFormat df = new DecimalFormat("###,###,###,###,###");

		System.out.printf("��  �� :      %30s��\n", df.format((int) price));
		System.out.printf("�ΰ��� :      %30s��\n", df.format((kp5_iPrice - (int) price)));
		System.out.printf("��  �� :      %30s��\n", df.format(kp5_iPrice));
		System.out.println("----------------------------------------------");
		System.out.println("�츮ī��");
		System.out.println("ī���ȣ : 5387-20**-****-4613(S)       �Ͻú�");

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String datetime = sdf.format(date);
		

		System.out.printf("�ŷ��Ͻ� : %s\n", datetime);
		System.out.println("���ι�ȣ : 70404427");
		System.out.println("�ŷ���ȣ : 357734873739");
		System.out.println("���� : ��ī���             ���� : 720068568");
		System.out.println("�˸� : EDC����ǥ");
		System.out.println("���� : TEL)1544-4700");
		System.out.println("----------------------------------------------");
		System.out.println("                 * �����մϴ� *               ");
		System.out.println("                            ǥ��V2.08_20200212");
	}
}
