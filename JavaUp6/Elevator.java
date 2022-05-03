package JavaUp6;

//kopo05 김시현
public class Elevator {
	int kp5_limit_upFloor = 10; // 최상위층
	int kp5_limit_downFloor = 0; // 최하위층
	int kp5_floor = 1; // 현재층
	String kp5_help; // 안내

	void kp5_up() { //엘리베이터 올라가기
		if (kp5_floor == kp5_limit_upFloor) { //현재층이 최상위층과 같을 때
			kp5_help = "마지막층입니다."; //출력
		} else { //현재층이 최상위층이 아닐 때
			kp5_floor++; //층수가 한 층씩 증가
			kp5_help = String.format("%d층입니다", kp5_floor); //현재 몇층인지 출력
		}
	}

	void kp5_down() { //엘리베이터 내려가기
		if (kp5_floor == kp5_limit_downFloor) { //현재층이 최하위층과 같을 때
			kp5_help = "처음층입니다."; //출력
		} else { //현재층이 최하위층이 아닐 때
			kp5_floor--; //층수가 한 층씩 감소
			kp5_help = String.format("%d층입니다", kp5_floor); //현재 몇층인지 출력
		}
	}
}
