package JavaUp6;

//kopo05 �����
public class Elevator {
	int kp5_limit_upFloor = 10; // �ֻ�����
	int kp5_limit_downFloor = 0; // ��������
	int kp5_floor = 1; // ������
	String kp5_help; // �ȳ�

	void kp5_up() { //���������� �ö󰡱�
		if (kp5_floor == kp5_limit_upFloor) { //�������� �ֻ������� ���� ��
			kp5_help = "���������Դϴ�."; //���
		} else { //�������� �ֻ������� �ƴ� ��
			kp5_floor++; //������ �� ���� ����
			kp5_help = String.format("%d���Դϴ�", kp5_floor); //���� �������� ���
		}
	}

	void kp5_down() { //���������� ��������
		if (kp5_floor == kp5_limit_downFloor) { //�������� ���������� ���� ��
			kp5_help = "ó�����Դϴ�."; //���
		} else { //�������� ���������� �ƴ� ��
			kp5_floor--; //������ �� ���� ����
			kp5_help = String.format("%d���Դϴ�", kp5_floor); //���� �������� ���
		}
	}
}
