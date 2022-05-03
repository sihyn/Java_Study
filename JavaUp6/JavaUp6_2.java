package JavaUp6;

public class JavaUp6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TvRemocon kp5_remocon;// Elevator클래스를 받아 객체를 만듦
		kp5_remocon = new TvRemocon(); //인스턴스를 생성해서 객체(kp5_elev)에 연결


		for (int kp5_i = 0; kp5_i < 10; kp5_i++) { //kp5_i가 0부터 9까지 1씩 증가하며 반복
			kp5_remocon.ChannelUp(); //Elevator 클래스를 찍어낸 kp5_elev객체의 kp5_up()메서드
			System.out.printf("MSG[%s]\n", kp5_remocon.kp5_help); //kp5_elev객체의 kp5_help출력
		}
		for (int i = 0; i < 10; i++) { //kp5_i가 0부터 9까지 1씩 증가하며 반복
			kp5_remocon.ChannelDown(); //Elevator 클래스를 찍어낸 kp5_elev객체의 kp5_down()메서드
			System.out.printf("MSG[%s]\n", kp5_remocon.kp5_help); //kp5_elev객체의 kp5_help출력
		}
	}

}
