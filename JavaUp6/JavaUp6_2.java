package JavaUp6;

public class JavaUp6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TvRemocon kp5_remocon;// ElevatorŬ������ �޾� ��ü�� ����
		kp5_remocon = new TvRemocon(); //�ν��Ͻ��� �����ؼ� ��ü(kp5_elev)�� ����


		for (int kp5_i = 0; kp5_i < 10; kp5_i++) { //kp5_i�� 0���� 9���� 1�� �����ϸ� �ݺ�
			kp5_remocon.ChannelUp(); //Elevator Ŭ������ �� kp5_elev��ü�� kp5_up()�޼���
			System.out.printf("MSG[%s]\n", kp5_remocon.kp5_help); //kp5_elev��ü�� kp5_help���
		}
		for (int i = 0; i < 10; i++) { //kp5_i�� 0���� 9���� 1�� �����ϸ� �ݺ�
			kp5_remocon.ChannelDown(); //Elevator Ŭ������ �� kp5_elev��ü�� kp5_down()�޼���
			System.out.printf("MSG[%s]\n", kp5_remocon.kp5_help); //kp5_elev��ü�� kp5_help���
		}
	}

}
