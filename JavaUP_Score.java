package JavaUp7;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class JavaUP_Score {
		//기본 변수
		private int kp5_student_id; //번호
		private String kp5_name; //학생 이름
		private int kp5_kor; //국어 성적
		private int kp5_eng; //영어 성적
		private int kp5_math; //수학 성적
		
		public JavaUP_Score(int student_id, String name, int kor, int eng, int math) {
			//번호,학생이름,국어성적,영어성적,수학성적을 주어서 클래스를 생성할 수 있게 한다
			this.kp5_student_id=student_id;
			this.kp5_name = name;
			this.kp5_kor =kor;
			this.kp5_eng =eng;
			this.kp5_math = math;
		}
		public int student_id() {return this.kp5_student_id;};
		public String name() {return this.kp5_name;};
		public int kor(){return this.kp5_kor;};
		public int eng(){return this.kp5_eng;};
		public int math(){return this.kp5_math;};
		public int sum(){return this.kp5_kor+this.kp5_eng+this.kp5_math;};
		public double ave(){return this.sum()/3.0;};
		
		static ArrayList<JavaUP_Score> k5_ArrayOneRec = new ArrayList<JavaUP_Score>();
		//ArrayList k5_ArrayOneRec생성
		static int kp5_sumkor=0; //국어성적 합계
		static int kp5_sumeng=0; //영어성적 합계
		static int kp5_summath=0; //수학성적 합계
		static int kp5_sumsum=0; //총점 합계
		static int kp5_sumave=0; //평균 합계

		static int kp5_iPerson = 200; //학생 수
		static int kp5_pageStudent = 30; //한 페이지 당 출력할 학생 수
		static int kp5_cnt = 1; //페이지 평균값 구하기 위한 kp5_cnt 변수
	
		//각 평균, 총점을 누적으로 구하기 위해서 모두 0으로 초기화
		static int kp5_korSum = 0, kp5_engSum = 0, kp5_mathSum = 0, kp5_sumSum = 0, kp5_aveSum = 0, // 현재 페이지 합계 변수 선언
				kp5_korAve = 0, kp5_engAve = 0, kp5_matAve = 0, kp5_sumAve = 0, kp5_aveAve = 0;	// 현재 페이지 평균 변수 선언
		static int kp5_korTotalSum = 0, kp5_engTotalSum = 0, kp5_mathTotalSum = 0, kp5_sumTotalSum = 0, kp5_aveTotalSum = 0, // 누적 페이지 합계 변수 선언
				kp5_korTotalAve = 0, kp5_engTotalAve = 0, kp5_mathTotalAve = 0, kp5_sumTotalAve = 0, kp5_aveTotalAve = 0;	// 누적 페이지 평균 변수 선언
		static int kp5_pageCnt = 0;
		static int kp5_tmp = 0;
		
		//#메인함수
		public static void main(String[] args) {

			if(kp5_iPerson%kp5_pageStudent==0) { //총학생수를 한 페이지 당 출력할 학생 수로 나누었을 때
				kp5_pageCnt = kp5_iPerson/kp5_pageStudent;	 //딱 떨어지면 나눈 수만큼의 페이지가 생성.
			} else {
				kp5_pageCnt = kp5_iPerson/kp5_pageStudent+1; //떨어지지 않으면 나눈 수+1 만큼의 페이지가 생성된다.
			}
			kp5_dataSet();	//#데이터 세팅해준다
			kp5_dataSort(); //#데이터를 정렬
			
			for (int i = 1; i <= kp5_pageCnt; i++) { //페이지 수만큼 반복	
				//#페이지 수만큼 헤더출력
				kp5_HeaderPrint(i);
				int kp5_tmpnum =i;	

				for (int j = kp5_tmp + 1; j <= kp5_iPerson; j++) { // 1부터 학생수까지 출력을 해줄건데
					kp5_cnt ++;
					if (j != 0 && j % kp5_pageStudent == 0) { 	    //페이지에 원하는 학생수만큼 출력되면 for문 탈출
						kp5_tmp = (kp5_pageStudent * kp5_tmpnum);	//다음페이지에서는 이전페이지 다음 학생 부터 출력해야하기 때문에
						kp5_studentPrint(kp5_tmp);				    //kp5_tmp는 다음페이지 첫번쨰 학생의 필드 값이다. (한페이지마다 출력되는 학생수 * 페이지수)
						break;
					}
					kp5_studentPrint(j); //학생들마다 성적,총점,평균 출력
				}
				//마지막 페이지일때
				if(i==kp5_pageCnt) {						
					if(kp5_iPerson%kp5_pageStudent>0) {			     //현재페이지의 평균을 구하려면 현재 페이지의 인덱스값을 알아야한다.
						int kp5_rest = kp5_iPerson%kp5_pageStudent;  //전체학생수에서 한페이지당 출력되는 학생수로 나눈 나머지를 kp5_rest변수에 대입.
						kp5_TailPrint(kp5_rest);				     //나머지 학생 수 값을 받아 현재페이지의 평균을 구하는 함수에 대입.
					}					
				} else {
					kp5_TailPrint(kp5_pageStudent); //나머지가 없는 경우에는 한페이지당 출력하는 학생 수를 기준으로 현재페이지 평균구하기
				}			
			}
		}
		//#데이터 세팅
		public static void kp5_dataSet() {
			for (int i = 1; i <= kp5_iPerson; i++) {
				String kp5_name = String.format("Kopo%02d", i); //이름만들기
				int kp5_kor = (int)(Math.random()*100); //랜덤함수로 국어점수 만들기
				int kp5_eng = (int)(Math.random()*100); //랜덤함수로 영어점수 만들기
				int kp5_math = (int)(Math.random()*100); //랜덤함수로 수학점수 만들기
				k5_ArrayOneRec.add(new JavaUP_Score(i,kp5_name,kp5_kor,kp5_eng,kp5_math));
				//하나의 JavaUP_Score클래스를 생성후 ArrayList에 넣음
			}
		}
		//#헤더 출력
		public static void kp5_HeaderPrint(int pageNum) { 
			Calendar kp5_cal = Calendar.getInstance(); // Calendar 클래스로 현재 날짜와 시간을 가져온다.
			SimpleDateFormat kp5_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // 날짜&시간의 출력형식을 kp5_sdf로 정한다.
			System.out.printf("%25s\n\n", "성적집계표");
			System.out.printf("%s%s%17s%s\n", "PAGE : ", pageNum, "출력일자 : ", kp5_sdf.format(kp5_cal.getTime())); // 페이지와 출력일자를 출력
			System.out.println("==================================================");
			System.out.printf("%s%4s%5s%5s%5s%5s%7s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");
			System.out.println("==================================================");
		}
		//#내용 출력
		public static void kp5_studentPrint(int i) {
			
			JavaUP_Score kp5_rec;
			kp5_rec = k5_ArrayOneRec.get(i-1); //ArrayList에 담긴 내용 출력
			System.out.printf("%03d %8s %4d %6d %6d %7d %8.2f \n", kp5_rec.student_id(), kp5_rec.name(), kp5_rec.kor(), kp5_rec.eng(), kp5_rec.math(), kp5_rec.sum(), kp5_rec.ave());
			//번호-이름-국어성적-영어성적-수학성적-총점-평균 순으로 출력
			//#현재페이지 합계(국어-영어-수학-총점-평균)
			kp5_korSum += kp5_rec.kor();
			kp5_engSum += kp5_rec.eng();
			kp5_mathSum += kp5_rec.math();
			kp5_sumSum += kp5_rec.sum();
			kp5_aveSum += kp5_rec.ave();
			//#누적페이지 합계(국어-영어-수학-총점-평균)
			kp5_korTotalSum += kp5_rec.kor();
			kp5_engTotalSum += kp5_rec.eng();
			kp5_mathTotalSum += kp5_rec.math();
			kp5_sumTotalSum += kp5_rec.sum();
			kp5_aveTotalSum += kp5_rec.ave();
			//#누적페이지 평균(국어-영어-수학-총점-평균)
			kp5_korTotalAve = kp5_korTotalSum/ i;
			kp5_engTotalAve = kp5_engTotalSum/ i;
			kp5_mathTotalAve = kp5_mathTotalSum/ i;
			kp5_sumTotalAve = kp5_sumTotalSum/ i;
			kp5_aveTotalAve = kp5_aveTotalSum/ i;
		}
		//#꼬리 출력
		public static void kp5_TailPrint(int onePageStudents) {
			//#현재페이지 평균(국어-영어-수학-총점-평균)
			kp5_korAve=kp5_korSum/onePageStudents;
			kp5_engAve=kp5_engSum/onePageStudents;
			kp5_matAve=kp5_mathSum/onePageStudents;
			kp5_sumAve=kp5_sumSum/onePageStudents;
			kp5_aveAve=kp5_aveSum/onePageStudents;
			
			System.out.println("==================================================");
			System.out.printf("%s\n", "현재페이지");
			System.out.printf("%s%6s%7d%7d%7d%7d%8d\n", "합계", " ", kp5_korSum, kp5_engSum, kp5_mathSum, kp5_sumSum, kp5_aveSum);
			System.out.printf("%s%6s%7d%7d%7d%7d%8d\n", "평균", " ", kp5_korAve, kp5_engAve, kp5_matAve, kp5_sumAve, kp5_aveAve);
			System.out.println("==================================================");
			System.out.printf("%s\n", "누적페이지");
			System.out.printf("%s%6s%7d%7d%7d%7d%8d\n", "합계", " ", kp5_korTotalSum, kp5_engTotalSum, kp5_mathTotalSum, kp5_sumTotalSum, kp5_aveTotalSum);
			System.out.printf("%s%6s%7d%7d%7d%7d%8d\n\n", "평균", " ", kp5_korTotalAve, kp5_engTotalAve, kp5_mathTotalAve, kp5_sumTotalAve, kp5_aveTotalAve);
			kp5_korSum = 0; kp5_engSum = 0; kp5_mathSum = 0; kp5_sumSum = 0; kp5_aveSum = 0;
			kp5_korAve = 0; kp5_engAve = 0; kp5_matAve = 0; kp5_sumAve = 0; kp5_aveAve = 0;
		}
		//#데이터 정렬
		public static void kp5_dataSort() {	 //ArrayList를 정렬할 떄 사용한다.
			Comparator<JavaUP_Score> kp5_sort = new Comparator<JavaUP_Score>() { //객체를 Comparator로 비교할 대상을 정의
			
				public int compare(JavaUP_Score kp5_1, JavaUP_Score kp5_2) {
					// TODO Auto-generated method stub
					return (kp5_2.sum()-kp5_1.sum());
					//return(String.valueOf(kp5_1.kor).compareTo(String.valueOf(kp5_2.kor))); -> 문자형 비교 시
				}
			};
			Collections.sort(k5_ArrayOneRec, kp5_sort); //설정한 내용대로 정렬(높은 순서->낮은 순서)
//			Collections.reverse(k5_ArrayOneRec); //reverse(성적이 낮은 순서->높은 순서)
		}
}
