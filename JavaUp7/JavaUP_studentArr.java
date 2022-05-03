package JavaUp7;

import java.util.ArrayList;

public class JavaUP_studentArr {
	private int student_id;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public JavaUP_studentArr(int student_id, String name, int kor, int eng, int math) {
		this.student_id=student_id;
		this.name = name;
		this.kor =kor;
		this.eng =eng;
		this.math = math;
	}
	public int student_id() {return this.student_id;};
	public String name() {return this.name;};
	public int kor(){return this.kor;};
	public int eng(){return this.eng;};
	public int math(){return this.math;};
	public int sum(){return this.kor+this.eng+this.math;};
	public double ave(){return this.sum()/3.0;};
	
	static ArrayList<JavaUP_studentArr> ArrayOneRec = new ArrayList<JavaUP_studentArr>();
	
	static int sumkor=0;
	static int sumeng=0;
	static int summath=0;
	static int sumsum=0;
	static int sumave=0;
	static final int iPerson =20;
	
	public static void dataSet() {
		for(int kp5_i = 0; kp5_i < iPerson; kp5_i++) {
			String name = String.format("Kopo%02d", kp5_i);
			int kor = (int)(Math.random()*100);
			int eng = (int)(Math.random()*100);
			int math = (int)(Math.random()*100);
			ArrayOneRec.add(new JavaUP_studentArr(kp5_i,name,kor,eng,math));
		}
	}
	public static void HeaderPrint() {
		System.out.println("***************************************");
		System.out.printf("%3s %4s %2s %2s %2s  %2s\n","번호","이름","국어","영어","수학","합계","평균");
		System.out.println("***************************************");
	}
	public static void itemPrint(int i) {
		JavaUP_studentArr rec;
		
		rec = ArrayOneRec.get(i);
		System.out.printf("%2d %6s %4s %4s %4s %4s %6.2f\n",rec.student_id(),rec.name(),rec.kor(),rec.eng(),rec.math(),rec.sum(),rec.ave());
		
		sumkor+=rec.kor();
		sumeng+=rec.eng();
		summath+=rec.math();
		sumsum+=rec.sum();
		sumave+=rec.ave();
	}
	public static void TailPrint() {
		System.out.println("***************************************");
		System.out.printf("국어합계 %d  국어평균: %6.2f\n",sumkor,sumkor/(double)ArrayOneRec.size());
		System.out.printf("영어합계 %d  영어평균: %6.2f\n",sumeng,sumeng/(double)ArrayOneRec.size());
		System.out.printf("수학합계 %d  수학평균: %6.2f\n",summath,summath/(double)ArrayOneRec.size());
		System.out.println("***************************************");
		System.out.printf("반평균합계 %d  반평균: %6.2f\n",sumave,sumave/(double)ArrayOneRec.size());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dataSet();
		HeaderPrint();
		for(int i = 0; i < ArrayOneRec.size(); i++) {
			itemPrint(i);
		}
		TailPrint();
	}
}

