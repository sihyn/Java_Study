package JavaUp7;

import java.util.ArrayList;

public class JavaUP_ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iTestMAX = 100;
		ArrayList kp5_Arr = new ArrayList();
		
		for(int i = 0; i < iTestMAX; i++) {
			kp5_Arr.add((int)(Math.random()*100));
		}
		for(int i = 0; i < kp5_Arr.size(); i++) {
			System.out.printf("ArrayList %d = %d\n",i,kp5_Arr.get(i));
		}
		System.out.println("**************************************");
		kp5_Arr.sort(null);
		
		for(int i = 0; i <kp5_Arr.size(); i++) {
			System.out.printf("ArrayList %d = %d\n",i,kp5_Arr.get(i));
		}
	}
}
