package Tuesday;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tue3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("             \"���ΰ���, ���̼�\"");
		System.out.println("(��)�Ƽ����̼�_�д缭����");
		System.out.println("��ȭ:031-702-6016");
		System.out.println("����:���� ������ ���μ�ȯ�� 2748 (���)");
		System.out.println("��ǥ:������,��ȣ�� 213-81-52063");
		
		System.out.printf("%s","����:��⵵ ������ �д籸 �д��53���� 11 (����"
				+ "��)\n");
		System.out.println("===============================================");
		System.out.println("        �Һ����߽ɰ濵(CCM) �������");
		System.out.println("      ISO 9001 ǰ���濵�ý��� �������");
		System.out.println("===============================================");
		System.out.println("        ��ȯ/ȯ�� 14��(03��12��)�̳�");
		System.out.println("(����)������, ����ī�� ���� �� ���Թ��忡�� ����");
		System.out.println("      ����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�");
		System.out.println("       üũī�� ��� �� �ִ� 7�� �ҿ�");
		System.out.println("===============================================");
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String datetime = sdf.format(date);
		System.out.printf("[POS 1058231]               %s\n",datetime);
		System.out.println("===============================================");
		String[] kp5_item = { "�����ܿ븶��ũ", "�����̵�ĸ���", "���׸�����ũ" }; //String �������� �迭
		int[] kp5_price = { 3000, 1000, 1000 }; //��ǰ����(�ܰ�) �迭
		int[] kp5_amount = { 1, 1, 1}; //��ǰ ���� �迭
		double kp5_taxRate = 0.1; //����
		int kp5_totalSum = 0; //int�� kp5_totalSum���� �� �ʱ�ȭ

		for (int kp5_i = 0; kp5_i < kp5_item.length; kp5_i++) { //0���� ������ ������ �迭���̸�ŭ �ݺ�
			int kp5_sum = kp5_price[kp5_i] * kp5_amount[kp5_i]; //���ڰ��� = ��ǰ����*����
			kp5_totalSum = kp5_totalSum + kp5_sum; //���ұݾ� = ���ڵ� ������ ��
			System.out.printf("%-12s\t %8d %4d %8d\n", kp5_item[kp5_i], kp5_price[kp5_i], kp5_amount[kp5_i], kp5_sum);
			//�׸�-�ܰ�-����-�հ� ������ ���
		}
		int kp5_totalNetprice = (int) (kp5_totalSum / (1 + kp5_taxRate)); //�����ݾ�
		System.out.printf("%20s%23d\n","�����հ�", kp5_totalNetprice); //�����ݾ� ���
		int kp5_tax = kp5_totalSum - kp5_totalNetprice; //���� = ���ұݾ�-�����ݾ�
		System.out.printf("%20s%23d\n","�ΰ���",kp5_tax);
		System.out.println("-----------------------------------------------");
		System.out.printf("�Ǹ��հ�: %37d\n", kp5_totalSum); //���ұݾ� ���
		System.out.println("===============================================");
		System.out.printf("�ſ�ī��: %37d\n", kp5_totalSum);
		System.out.println("-----------------------------------------------");
		System.out.println("�츮ī��                       538720**********");
		System.out.printf("���ι�ȣ 77982843(0)              ���αݾ� %d\n",kp5_totalSum);
		System.out.println("===============================================");
		SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String datentime = df.format(date);
		System.out.printf("%27s �д缭����\n",datentime);
		System.out.println("��ǰ �� ��Ÿ ���� : 1522-4400");
		System.out.println("����� �� �����̼� ���� ���� : 1599-2211");
		System.out.println("-----------------------------------------------");
		System.out.println("�� ���̼� ����� �� �Ǵ� Ȩ�������� �����ϼż�");
		System.out.println("  ȸ������ �� �پ��� ������ ���������� ��");
	}

}
