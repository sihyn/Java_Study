package JavaUp6;

public class JavaUp6_1 {
	// kopo05 �����
	private static int kp5_inVal; //private static����(��������)

	public static void kp5_up() {
		kp5_inVal++; //kp5_inVal����
		System.out.printf("�� �׳� �޼���[%d]\n", kp5_inVal); //���
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kp5_inVal = 0; //�ڱ� ���� ���� ���
		Elevator kp5_elev;// ElevatorŬ������ �޾� ��ü�� ����
		kp5_elev = new Elevator(); //�ν��Ͻ��� �����ؼ� ��ü(kp5_elev)�� ����

		kp5_up(); //���� �ҽ� �� �޼���

		for (int kp5_i = 0; kp5_i < 10; kp5_i++) { //kp5_i�� 0���� 9���� 1�� �����ϸ� �ݺ�
			kp5_elev.kp5_up(); //Elevator Ŭ������ �� kp5_elev��ü�� kp5_up()�޼���
			System.out.printf("MSG[%s]\n", kp5_elev.kp5_help); //kp5_elev��ü�� kp5_help���
		}
		for (int i = 0; i < 10; i++) { //kp5_i�� 0���� 9���� 1�� �����ϸ� �ݺ�
			kp5_elev.kp5_down(); //Elevator Ŭ������ �� kp5_elev��ü�� kp5_down()�޼���
			System.out.printf("MSG[%s]\n", kp5_elev.kp5_help); //kp5_elev��ü�� kp5_help���
		}
	}

}
