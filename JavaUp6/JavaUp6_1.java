package JavaUp6;

public class JavaUp6_1 {
	// kopo05 김시현
	private static int kp5_inVal; //private static변수(전역변수)

	public static void kp5_up() {
		kp5_inVal++; //kp5_inVal증가
		System.out.printf("난 그냥 메서드[%d]\n", kp5_inVal); //출력
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kp5_inVal = 0; //자기 내부 변수 사용
		Elevator kp5_elev;// Elevator클래스를 받아 객체를 만듦
		kp5_elev = new Elevator(); //인스턴스를 생성해서 객체(kp5_elev)에 연결

		kp5_up(); //현재 소스 내 메서드

		for (int kp5_i = 0; kp5_i < 10; kp5_i++) { //kp5_i가 0부터 9까지 1씩 증가하며 반복
			kp5_elev.kp5_up(); //Elevator 클래스를 찍어낸 kp5_elev객체의 kp5_up()메서드
			System.out.printf("MSG[%s]\n", kp5_elev.kp5_help); //kp5_elev객체의 kp5_help출력
		}
		for (int i = 0; i < 10; i++) { //kp5_i가 0부터 9까지 1씩 증가하며 반복
			kp5_elev.kp5_down(); //Elevator 클래스를 찍어낸 kp5_elev객체의 kp5_down()메서드
			System.out.printf("MSG[%s]\n", kp5_elev.kp5_help); //kp5_elev객체의 kp5_help출력
		}
	}

}
