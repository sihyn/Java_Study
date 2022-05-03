package JavaUp7;

public class JavaUP_MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kp5_iArray = { 1, 7, 5, 3, 2, 0, 3, 4, 9, 12, 1, 212, 33, 11, 21, 11, 2121, 121, 11, 5, 6, 33 };

		for (int i = 0; i < kp5_iArray.length; i++) {
			System.out.printf("iArray[%d]=%d\n", i, kp5_iArray[i]);
		}
		int iMax = kp5_iArray[0];
		
		int iMaxPt = 0;
		for (int i = 0; i < kp5_iArray.length; i++) {
			if (iMax < kp5_iArray[i]) {
				iMax = kp5_iArray[i];
				iMaxPt = i;
			}
		}
		int iMinPt = 0;
		System.out.printf("Max : iArray[%d]=%d\n", iMaxPt, iMax);
		for (int i = 0; i < kp5_iArray.length; i++) {
			if (iMax > kp5_iArray[i]) {
				iMax = kp5_iArray[i];
				iMinPt = i;
			}
		}
		System.out.printf("Min : iArray[%d]=%d\n", iMinPt, iMax);
	}
}
