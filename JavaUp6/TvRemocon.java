package JavaUp6;

public class TvRemocon {
	int kp5_limit_upVol = 5; // 볼륨 가장 크게
	int kp5_limit_downVol = 0; // 볼륨 가장 낮게
	int kp5_Vol = 1; // 현재 볼륨
	int kp5_limit_upCh = 10; 
	int kp5_limit_downCh = 0; 
	int kp5_Ch = 0; 
	String kp5_help; // 안내
	
	
	void VolUp() {
		if (kp5_Vol == kp5_limit_upVol) { //현재 볼륨이 최대볼륨과 같을 때
			kp5_help = "볼륨 최대입니다."; //출력
		} else { 
			kp5_Vol++; 
			kp5_help = String.format("볼륨크기%d입니다", kp5_Vol); 
		}
	}
	
	void VolDown() {
		if (kp5_Vol == kp5_limit_downVol) { //현재 볼륨이 최소볼륨과 같을 때
			kp5_help = "볼륨 최소입니다."; //출력
		} else { 
			kp5_Vol--; 
			kp5_help = String.format("볼륨크기%d입니다", kp5_Vol); 
		}
		
	}
	
	void ChannelUp() {
		if (kp5_Ch == kp5_limit_upCh) { //현재 볼륨이 최대볼륨과 같을 때
			kp5_help = "마지막 채널입니다."; //출력
		} else { 
			kp5_Ch++; 
			kp5_help = String.format("현재채널%d번입니다", kp5_Ch); 
		}
		
	}
	
	void ChannelDown() {
		if (kp5_Ch == kp5_limit_downCh) { //현재 볼륨이 최대볼륨과 같을 때
			kp5_help = "처음 채널입니다."; //출력
		} else { 
			kp5_Ch--; 
			kp5_help = String.format("현재채널%d번입니다", kp5_Ch); 
		}
		
	}
}
