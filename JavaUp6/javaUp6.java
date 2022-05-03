package JavaUp6;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class javaUp6 {
	// kopo05 �����
	// static����(��������)
	static Date date = new Date();
	static Calendar kp5_cal = Calendar.getInstance();
	static DecimalFormat kp5_money = new DecimalFormat("###,###,###,###,###");
	
	static String[] kp5_item = { "��귣�� ������κ�", "��ټ�2L", "[�ѱ�����Ʈ]�� �������� 150mlx5��", "[�︳]���� ȿ��� ���� �θ��� ��нĻ�",
			"�Ƿη� Į���� ġ��", "��귣�� ����� ���ڱ���ġ 90g", "���� ī��� 220ml*6�� ��ȹ", "���� �ڿ��� ���� ��Ʈ����ũ 1��", "CJ���ǰ��ѵ�ɽ����̽�250g",
			"��Ÿ���� �׽������� ĸ�� Ŀ�� 10�� ����", "�ñ�6kcal ������� �ӽ�Ĺ�� 130g 1��", "[����ũ]��Ű�� ���� 18g", "[CJ]��Ƽÿ �а� 90g3",
			"�ε巯�� �߾��� ������ 300g", "[Űģ����]��ġ���� ���߱��_���ϵ�", "���ִ� ���ѱ� �Ź�(�߷�) 27�� ��1 ������", "CJ���Խ̱۸��ϵ�80g",
			"���� �����̾� �� �ø���(��Ƽ��)385g", "Google play ����Ʈ �ڵ� 1�� 5õ����", "[���]�ø��� ¥�İ�Ƽ(140gx5��)", "�ȵ������ 130g*4��",
			"����ũ ����� Ŭ���� �޺��� ��Ƽ(����)", "[����]���� ������(10gƼ��*30����)", "���� �� �ٻ��� ��� ��Ź�� 100g", "ȣ�ֻ� ���̽��� ���̵� ��������(100g)(��)",
			"ȭ��Ʈ��� Ŀ�ǹͽ� 250��", "�����ʴ�κ� 550g", "[����]��ȭ�� �ߵǴ� ������ ���� 930ml", "[���׷�]�ٳ����� ����(240ml4��)960ml",
			"[DoubleA]������ ������ A4 500��", "�´��ٵ� ���ۺ�Ÿ�� ������ �ٵ����" };
	// ���ݹ迭
	static int[] kp5_price = { 3280, 980, 7500, 2380, 3680, 1080, 6580, 1500, 7480, 6500, 800, 680, 3200, 2980, 3900,
			2580, 2580, 2680, 15000, 4280, 2680, 1680, 2080, 8980, 4480, 30900, 2480, 3290, 4900, 5900, 3900 };
	// ��ǰ����(�ܰ�)�迭
	static int[] kp5_amount = { 1, 3, 1, 2, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 1, 2, 1, 3, 1, 2,
			2, 1 }; // ��ǰ ���� �迭
	static boolean[] kp5_taxfree = { true, false, false, false, true, false, false, false, false, true, false, false,
			false, false, false, true, false, false, true, false, false, false, true, false, false, true, false, false,
			true, false, false }; // �鼼,��鼼
	static double kp5_taxRate = 0.1; // ����
	static int kp5_totalSum1 = 0; // int�� kp5_totalSum1���� �� �ʱ�ȭ
	static int kp5_totalSum2 = 0; // int�� kp5_totalSum1���� �� �ʱ�ȭ
	static int kp5_finaltotal = 0; // �հ�

	public static void TitlePrint() { // Ÿ��Ʋ ���

		System.out.println("            �̸�Ʈ ������ (031)888-1234");
		System.out.println("emart       206-86-50913 ����");
		System.out.println("            ���� ������ ������� 552");
		System.out.println("������ �������� ��ȯ/ȯ�� �Ұ�");
		System.out.println("������㿡 ����, 30�� �̳�(�ż� 7��)");
		System.out.println("���Ϻ� �귣����� ����(���� ����������");
		System.out.println("��ȯ/ȯ�� ���������� ���(����ī�� ����)");
	}

	public static void BuyTimePrint() { // ���Žð� ���

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String datetime = sdf.format(date);
		System.out.printf("[����] %s\t    POS:0011-9861\n", datetime);
	}

	public static void HeaderPrint() { // ��� ���
		System.out.println("-----------------------------------------");
		System.out.printf("%-13s%8s%4s%7s\n", "  ��ǰ��", "�� �� ", "���� ", "�� �� ");
	}

	public static int itemPrint(int kp5_i) { // ��ǰ ���

		if (kp5_i % 5 == 0) { // ��ǰ�� ������ 5������ ����
			System.out.println("-----------------------------------------");
		}

		int kp5_sum1 = kp5_price[kp5_i] * kp5_amount[kp5_i]; // �鼼
		int kp5_sum2 = kp5_price[kp5_i] * kp5_amount[kp5_i]; // �鼼X

		if (kp5_taxfree[kp5_i] == true) { // �鼼
			System.out.printf("* "); // �鼼ǰ�̸� *�� �տ� �߰�
			String kp5_result = kp5_subStringByte(kp5_item[kp5_i], 15); // 15����Ʈ�� ����
			System.out.printf("%8s", kp5_result);

			System.out.printf("%10s%3s %10s\n", kp5_money.format(kp5_price[kp5_i]), kp5_amount[kp5_i],
					kp5_money.format(kp5_sum1));
			kp5_totalSum1 = kp5_totalSum1 + kp5_sum1; // �鼼��ǰ ����

		} else if (kp5_taxfree[kp5_i] == false) { // �鼼X
			System.out.printf("  ");
			String kp5_result = kp5_subStringByte(kp5_item[kp5_i], 15); // 15����Ʈ�� ����
			System.out.printf("%8s", kp5_result);
			System.out.printf("%10s%3s %10s\n", kp5_money.format(kp5_price[kp5_i]), kp5_amount[kp5_i],
					kp5_money.format(kp5_sum2));
			kp5_totalSum2 = kp5_totalSum2 + kp5_sum1; // ������ǰ ����
		}
		return kp5_i;
	}

	public static void TotalPrint() { // �հ� ���� ���� ���

		int kp5_totalamount = 0; // �� ǰ�� ����
		kp5_totalamount = kp5_item.length; // �� ǰ�� ����
		kp5_finaltotal = kp5_totalSum1 + kp5_totalSum2; // �������ݾ�

		int kp5_netprice = (int) (kp5_totalSum2 / (1 + kp5_taxRate));// ��������(������ǰ)
		int kp5_itemtax = kp5_totalSum2 - kp5_netprice; // �ΰ���

		System.out.printf("\n               �� ǰ�� ����%14s\n", kp5_totalamount);
		System.out.printf("            (*)�� ��  �� ǰ%14s\n", kp5_money.format(kp5_totalSum1));
		System.out.printf("               �� ��  �� ǰ%14s\n", kp5_money.format(kp5_netprice));
		System.out.printf("               ��   ��   ��%14s\n", kp5_money.format(kp5_itemtax));
		System.out.printf("               ��        ��%14s\n", kp5_money.format(kp5_finaltotal));
		System.out.printf("%-18s%17s\n", "�� �� �� �� �� ��", kp5_money.format(kp5_finaltotal));
	}

	public static void LastPrint() { // ������ �غκ� ���

		kp5_cal.add(Calendar.MINUTE, -50);
		DecimalFormat kp5_money = new DecimalFormat("###,###,###,###,###");
		System.out.println("-----------------------------------------");
		System.out.println("0012 KEB �ϳ�       541707**0484/35860658");
		System.out.printf("ī�����(IC)%26s\n", "�Ͻú� / " + kp5_money.format(kp5_finaltotal));
		System.out.println("-----------------------------------------");
		System.out.println("           [�ż�������Ʈ ����]           ");
		System.out.println("ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.        ");
		int kp5_point = 5473; // ���� ����Ʈ
		int kp5_pointadd = 164; // ��ȸ�߻�����Ʈ
		int kp5_mypoint = kp5_point + kp5_pointadd; // ��������Ʈ
		System.out.printf("��ȸ�߻�����Ʈ       9350**9995%10s\n", kp5_pointadd);
		System.out.printf("����(����)����Ʈ          %s(%8s)\n", kp5_money.format(kp5_mypoint), kp5_money.format(kp5_point));
		System.out.println("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.      ");
		System.out.println("-----------------------------------------");
		System.out.println("   ���űݾױ��� ���������ð� �ڵ��ο�    ");
		System.out.println("������ȣ :                       34��****");
		SimpleDateFormat kp5_dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// SimpleDateFormat���� ��¥�� �ð� ��� ���� ����
		System.out.printf("�����ð� :%31s\n", kp5_dateformat.format(kp5_cal.getTime()));
		// �����ð��� ���Žð����� �̸� �ð�����
		System.out.println("-----------------------------------------");
		System.out.printf("ĳ��:084599 ��OO                     1150\n");
		System.out.printf("%40s\n", "||||||||||||||||||||||||||||||||||  ");
		System.out.printf("%40s\n", "||||||||||||||||||||||||||||||||||  ");
		SimpleDateFormat kp5_today = new SimpleDateFormat("yyyyMMdd");
		// SimpleDateFormat���� ��¥ ��� ���� ����
		String kp5_todate = kp5_today.format(date);
		System.out.printf("%14s/00119861/00164980/31\n", kp5_todate);
	}

	public static void main(String[] args) { // ���� �޼���
		// TODO Auto-generated method stub
		int itemCount = 31; // �׸��� �����
		TitlePrint(); // ������ �� �� Ÿ��Ʋ ���
		BuyTimePrint(); // ���Žð� ���
		HeaderPrint(); // ���(��ǰ��,�ܰ�,����,�ݾ�)���
		for (int kp5_i = 0; kp5_i < itemCount; kp5_i++) { // 0���� ��ǰ������ŭ �ݺ�
			itemPrint(kp5_i); // �׸񰹼���ŭ �׸��μ�
		}
		TotalPrint(); // �հ� ���� ���� ���
		LastPrint(); // ������ �غκ� ���
	}

	public static String kp5_subStringByte(String kp5_item, int kp5_byteLength) { // ���� �ڸ��� �޼���

		if (kp5_item.getBytes().length > kp5_byteLength) { // item�� byte�� ���� > �ڸ��⸦ ���ϴ� byte����
			StringBuffer kp5_strbf = new StringBuffer(kp5_byteLength); // StringBuffer����
			int kp5_lengthcnt = 0; // lengthcnt �ʱ�ȭ

			for (char kp5_ch : kp5_item.toCharArray()) {
				// char�� ���� ch���� <= String�� ���ڿ�(item)�� char�� �迭�� �ٲ�
				// ��ȯ�Ǵ� �迭�� ���̴� ���ڿ��� ���̿� ����.
				kp5_lengthcnt += String.valueOf(kp5_ch).getBytes().length;
				// (ch�� ���� string���ڿ��� �ٲ�)<�� ���ڿ��� ����Ʈ�� ���̸� lengthcnt�� ��� ����
				if (kp5_lengthcnt > kp5_byteLength) { // lengthcnt�� ���̰� byteLength�� ���̸� �Ѿ��
					break; // break;
				}
				kp5_strbf.append(kp5_ch); // ���̰� �Ѿ�� ������ ch�� ���Ѵ�
			}
			kp5_item = kp5_strbf.toString(); // item = strbf�� string����
		}
		// ��ĭ���
		String kp5_blank = "";
		int kp5_itemlength = kp5_item.getBytes().length;

		for (int j = 0; j < kp5_byteLength - kp5_itemlength; j++) {
			kp5_blank += " "; // �����ھʴ� ����Ʈ ����-��ǰ�̸��� ����Ʈ ���̸�ŭ ��ĭ�߰�
		}
		return kp5_item + kp5_blank; // item + blank�� �����ϱ�
	}
}
