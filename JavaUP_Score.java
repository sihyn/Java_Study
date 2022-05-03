package JavaUp7;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class JavaUP_Score {
		//�⺻ ����
		private int kp5_student_id; //��ȣ
		private String kp5_name; //�л� �̸�
		private int kp5_kor; //���� ����
		private int kp5_eng; //���� ����
		private int kp5_math; //���� ����
		
		public JavaUP_Score(int student_id, String name, int kor, int eng, int math) {
			//��ȣ,�л��̸�,�����,�����,���м����� �־ Ŭ������ ������ �� �ְ� �Ѵ�
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
		//ArrayList k5_ArrayOneRec����
		static int kp5_sumkor=0; //����� �հ�
		static int kp5_sumeng=0; //����� �հ�
		static int kp5_summath=0; //���м��� �հ�
		static int kp5_sumsum=0; //���� �հ�
		static int kp5_sumave=0; //��� �հ�

		static int kp5_iPerson = 200; //�л� ��
		static int kp5_pageStudent = 30; //�� ������ �� ����� �л� ��
		static int kp5_cnt = 1; //������ ��հ� ���ϱ� ���� kp5_cnt ����
	
		//�� ���, ������ �������� ���ϱ� ���ؼ� ��� 0���� �ʱ�ȭ
		static int kp5_korSum = 0, kp5_engSum = 0, kp5_mathSum = 0, kp5_sumSum = 0, kp5_aveSum = 0, // ���� ������ �հ� ���� ����
				kp5_korAve = 0, kp5_engAve = 0, kp5_matAve = 0, kp5_sumAve = 0, kp5_aveAve = 0;	// ���� ������ ��� ���� ����
		static int kp5_korTotalSum = 0, kp5_engTotalSum = 0, kp5_mathTotalSum = 0, kp5_sumTotalSum = 0, kp5_aveTotalSum = 0, // ���� ������ �հ� ���� ����
				kp5_korTotalAve = 0, kp5_engTotalAve = 0, kp5_mathTotalAve = 0, kp5_sumTotalAve = 0, kp5_aveTotalAve = 0;	// ���� ������ ��� ���� ����
		static int kp5_pageCnt = 0;
		static int kp5_tmp = 0;
		
		//#�����Լ�
		public static void main(String[] args) {

			if(kp5_iPerson%kp5_pageStudent==0) { //���л����� �� ������ �� ����� �л� ���� �������� ��
				kp5_pageCnt = kp5_iPerson/kp5_pageStudent;	 //�� �������� ���� ����ŭ�� �������� ����.
			} else {
				kp5_pageCnt = kp5_iPerson/kp5_pageStudent+1; //�������� ������ ���� ��+1 ��ŭ�� �������� �����ȴ�.
			}
			kp5_dataSet();	//#������ �������ش�
			kp5_dataSort(); //#�����͸� ����
			
			for (int i = 1; i <= kp5_pageCnt; i++) { //������ ����ŭ �ݺ�	
				//#������ ����ŭ ������
				kp5_HeaderPrint(i);
				int kp5_tmpnum =i;	

				for (int j = kp5_tmp + 1; j <= kp5_iPerson; j++) { // 1���� �л������� ����� ���ٰǵ�
					kp5_cnt ++;
					if (j != 0 && j % kp5_pageStudent == 0) { 	    //�������� ���ϴ� �л�����ŭ ��µǸ� for�� Ż��
						kp5_tmp = (kp5_pageStudent * kp5_tmpnum);	//���������������� ���������� ���� �л� ���� ����ؾ��ϱ� ������
						kp5_studentPrint(kp5_tmp);				    //kp5_tmp�� ���������� ù���� �л��� �ʵ� ���̴�. (������������ ��µǴ� �л��� * ��������)
						break;
					}
					kp5_studentPrint(j); //�л��鸶�� ����,����,��� ���
				}
				//������ �������϶�
				if(i==kp5_pageCnt) {						
					if(kp5_iPerson%kp5_pageStudent>0) {			     //������������ ����� ���Ϸ��� ���� �������� �ε������� �˾ƾ��Ѵ�.
						int kp5_rest = kp5_iPerson%kp5_pageStudent;  //��ü�л������� ���������� ��µǴ� �л����� ���� �������� kp5_rest������ ����.
						kp5_TailPrint(kp5_rest);				     //������ �л� �� ���� �޾� ������������ ����� ���ϴ� �Լ��� ����.
					}					
				} else {
					kp5_TailPrint(kp5_pageStudent); //�������� ���� ��쿡�� ���������� ����ϴ� �л� ���� �������� ���������� ��ձ��ϱ�
				}			
			}
		}
		//#������ ����
		public static void kp5_dataSet() {
			for (int i = 1; i <= kp5_iPerson; i++) {
				String kp5_name = String.format("Kopo%02d", i); //�̸������
				int kp5_kor = (int)(Math.random()*100); //�����Լ��� �������� �����
				int kp5_eng = (int)(Math.random()*100); //�����Լ��� �������� �����
				int kp5_math = (int)(Math.random()*100); //�����Լ��� �������� �����
				k5_ArrayOneRec.add(new JavaUP_Score(i,kp5_name,kp5_kor,kp5_eng,kp5_math));
				//�ϳ��� JavaUP_ScoreŬ������ ������ ArrayList�� ����
			}
		}
		//#��� ���
		public static void kp5_HeaderPrint(int pageNum) { 
			Calendar kp5_cal = Calendar.getInstance(); // Calendar Ŭ������ ���� ��¥�� �ð��� �����´�.
			SimpleDateFormat kp5_sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // ��¥&�ð��� ��������� kp5_sdf�� ���Ѵ�.
			System.out.printf("%25s\n\n", "��������ǥ");
			System.out.printf("%s%s%17s%s\n", "PAGE : ", pageNum, "������� : ", kp5_sdf.format(kp5_cal.getTime())); // �������� ������ڸ� ���
			System.out.println("==================================================");
			System.out.printf("%s%4s%5s%5s%5s%5s%7s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���");
			System.out.println("==================================================");
		}
		//#���� ���
		public static void kp5_studentPrint(int i) {
			
			JavaUP_Score kp5_rec;
			kp5_rec = k5_ArrayOneRec.get(i-1); //ArrayList�� ��� ���� ���
			System.out.printf("%03d %8s %4d %6d %6d %7d %8.2f \n", kp5_rec.student_id(), kp5_rec.name(), kp5_rec.kor(), kp5_rec.eng(), kp5_rec.math(), kp5_rec.sum(), kp5_rec.ave());
			//��ȣ-�̸�-�����-�����-���м���-����-��� ������ ���
			//#���������� �հ�(����-����-����-����-���)
			kp5_korSum += kp5_rec.kor();
			kp5_engSum += kp5_rec.eng();
			kp5_mathSum += kp5_rec.math();
			kp5_sumSum += kp5_rec.sum();
			kp5_aveSum += kp5_rec.ave();
			//#���������� �հ�(����-����-����-����-���)
			kp5_korTotalSum += kp5_rec.kor();
			kp5_engTotalSum += kp5_rec.eng();
			kp5_mathTotalSum += kp5_rec.math();
			kp5_sumTotalSum += kp5_rec.sum();
			kp5_aveTotalSum += kp5_rec.ave();
			//#���������� ���(����-����-����-����-���)
			kp5_korTotalAve = kp5_korTotalSum/ i;
			kp5_engTotalAve = kp5_engTotalSum/ i;
			kp5_mathTotalAve = kp5_mathTotalSum/ i;
			kp5_sumTotalAve = kp5_sumTotalSum/ i;
			kp5_aveTotalAve = kp5_aveTotalSum/ i;
		}
		//#���� ���
		public static void kp5_TailPrint(int onePageStudents) {
			//#���������� ���(����-����-����-����-���)
			kp5_korAve=kp5_korSum/onePageStudents;
			kp5_engAve=kp5_engSum/onePageStudents;
			kp5_matAve=kp5_mathSum/onePageStudents;
			kp5_sumAve=kp5_sumSum/onePageStudents;
			kp5_aveAve=kp5_aveSum/onePageStudents;
			
			System.out.println("==================================================");
			System.out.printf("%s\n", "����������");
			System.out.printf("%s%6s%7d%7d%7d%7d%8d\n", "�հ�", " ", kp5_korSum, kp5_engSum, kp5_mathSum, kp5_sumSum, kp5_aveSum);
			System.out.printf("%s%6s%7d%7d%7d%7d%8d\n", "���", " ", kp5_korAve, kp5_engAve, kp5_matAve, kp5_sumAve, kp5_aveAve);
			System.out.println("==================================================");
			System.out.printf("%s\n", "����������");
			System.out.printf("%s%6s%7d%7d%7d%7d%8d\n", "�հ�", " ", kp5_korTotalSum, kp5_engTotalSum, kp5_mathTotalSum, kp5_sumTotalSum, kp5_aveTotalSum);
			System.out.printf("%s%6s%7d%7d%7d%7d%8d\n\n", "���", " ", kp5_korTotalAve, kp5_engTotalAve, kp5_mathTotalAve, kp5_sumTotalAve, kp5_aveTotalAve);
			kp5_korSum = 0; kp5_engSum = 0; kp5_mathSum = 0; kp5_sumSum = 0; kp5_aveSum = 0;
			kp5_korAve = 0; kp5_engAve = 0; kp5_matAve = 0; kp5_sumAve = 0; kp5_aveAve = 0;
		}
		//#������ ����
		public static void kp5_dataSort() {	 //ArrayList�� ������ �� ����Ѵ�.
			Comparator<JavaUP_Score> kp5_sort = new Comparator<JavaUP_Score>() { //��ü�� Comparator�� ���� ����� ����
			
				public int compare(JavaUP_Score kp5_1, JavaUP_Score kp5_2) {
					// TODO Auto-generated method stub
					return (kp5_2.sum()-kp5_1.sum());
					//return(String.valueOf(kp5_1.kor).compareTo(String.valueOf(kp5_2.kor))); -> ������ �� ��
				}
			};
			Collections.sort(k5_ArrayOneRec, kp5_sort); //������ ������ ����(���� ����->���� ����)
//			Collections.reverse(k5_ArrayOneRec); //reverse(������ ���� ����->���� ����)
		}
}
