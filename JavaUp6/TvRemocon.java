package JavaUp6;

public class TvRemocon {
	int kp5_limit_upVol = 5; // ���� ���� ũ��
	int kp5_limit_downVol = 0; // ���� ���� ����
	int kp5_Vol = 1; // ���� ����
	int kp5_limit_upCh = 10; 
	int kp5_limit_downCh = 0; 
	int kp5_Ch = 0; 
	String kp5_help; // �ȳ�
	
	
	void VolUp() {
		if (kp5_Vol == kp5_limit_upVol) { //���� ������ �ִ뺼���� ���� ��
			kp5_help = "���� �ִ��Դϴ�."; //���
		} else { 
			kp5_Vol++; 
			kp5_help = String.format("����ũ��%d�Դϴ�", kp5_Vol); 
		}
	}
	
	void VolDown() {
		if (kp5_Vol == kp5_limit_downVol) { //���� ������ �ּҺ����� ���� ��
			kp5_help = "���� �ּ��Դϴ�."; //���
		} else { 
			kp5_Vol--; 
			kp5_help = String.format("����ũ��%d�Դϴ�", kp5_Vol); 
		}
		
	}
	
	void ChannelUp() {
		if (kp5_Ch == kp5_limit_upCh) { //���� ������ �ִ뺼���� ���� ��
			kp5_help = "������ ä���Դϴ�."; //���
		} else { 
			kp5_Ch++; 
			kp5_help = String.format("����ä��%d���Դϴ�", kp5_Ch); 
		}
		
	}
	
	void ChannelDown() {
		if (kp5_Ch == kp5_limit_downCh) { //���� ������ �ִ뺼���� ���� ��
			kp5_help = "ó�� ä���Դϴ�."; //���
		} else { 
			kp5_Ch--; 
			kp5_help = String.format("����ä��%d���Դϴ�", kp5_Ch); 
		}
		
	}
}
