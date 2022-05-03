package JavaUp7;

import java.util.ArrayList;

public class JavaUP_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList kp5_Arr = new ArrayList();

		kp5_Arr.add("abc");
		kp5_Arr.add("abcd");
		kp5_Arr.add("efga");
		kp5_Arr.add("가나다0");
		kp5_Arr.add("1234");
		kp5_Arr.add("12rk34");

		System.out.println("**********************************");
		System.out.printf("시작 ArraySize %d \n", kp5_Arr.size());
		for (int i = 0; i < kp5_Arr.size(); i++) {
			System.out.printf("ArrayList %d = %s\n", i, kp5_Arr.get(i));
		}
		kp5_Arr.set(3, "가라라라");
		System.out.println("**********************************");
		System.out.printf("내용변경 ArraySize %d \n", kp5_Arr.size());
		for (int i = 0; i < kp5_Arr.size(); i++) {
			System.out.printf("ArrayList %d = %s\n", i, kp5_Arr.get(i));
		}
		kp5_Arr.remove(4);
		System.out.println("**********************************");
		System.out.printf("내용변경 ArraySize %d \n", kp5_Arr.size());
		for (int i = 0; i < kp5_Arr.size(); i++) {
			System.out.printf("ArrayList %d = %s\n", i, kp5_Arr.get(i));
		}
		kp5_Arr.sort(null);
		System.out.println("**********************************");
		System.out.printf("리스트 ArraySize %d \n", kp5_Arr.size());
		for (int i = 0; i < kp5_Arr.size(); i++) {
			System.out.printf("ArrayList %d = %s\n", i, kp5_Arr.get(i));
		}
		kp5_Arr.clear();
		System.out.println("**********************************");
		System.out.printf("전부 삭제 ArraySize %d \n", kp5_Arr.size());
		for (int i = 0; i < kp5_Arr.size(); i++) {
			System.out.printf("ArrayList %d = %s\n", i, kp5_Arr.get(i));
		}
	}

}
