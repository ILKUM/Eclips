package kr.or.bit;

public class Ex06_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		// ���Կ����� (+=, -=, *=, ) ����������
		sum += 1; // sum = sum + 1;
		sum -= 1; // sum = sum - 1;
		System.out.println("sum: " + sum);

		// ������ ���� ����
		// ���� A+, A- , B+, B- (score)
		// ���� : 94 ��
		// 95���̻� A+
		// �׿� A-

		// 90�� �̻��̸� A �ε�... 95 A+, 93 A-

		int score = 55;
		String grade = ""; // ���ڿ� �ʱ�ȭ
		System.out.println("����� ������ : " + score);

		if (score >= 90) {
			grade = "A";
			if (score >= 95) {// grade = grade"+"
				grade += "+";
			} else {
				grade += "-";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85) {// grade = grade+"+"
				grade += "+";
			} else {
				grade += "-";
			}

		} else if (score >= 70) {
			grade = "C";
			if (score >= 75) {// grade = grade+"+"
				grade += "+";
			} else {
				grade += "-";
			}
		} else {
			grade = "F";
		}
		System.out.println("����� ������ : " + grade + "�Դϴ�");

		// syso + ctrll+space �ڵ��ϼ�
		// �ڵ������ϱ� ctrl+A ��ϼ��� ctrl+shift+F �ڵ�����

		int data = 100;
		switch (data) {
		case 100:
			System.out.println("100�Դϴ�");
			break;
		case 90:
			System.out.println("90�Դϴ�");
			break;
		case 80:
			System.out.println("80�Դϴ�");
			break;
		default:
			System.out.println("default");
		}// break�� ���������� �ƴմϴ�(�ʿ信 ����)
			// case ���� �����ϴ� ���ĺ���
		data = 80;
		switch (data) {
		case 100:
			System.out.println("100�Դϴ�");

		case 90:
			System.out.println("90�Դϴ�");

		case 80:
			System.out.println("80�Դϴ�");

		default:
			System.out.println("default");
		}
		int month = 2;
		String res = "";
		switch (month) {
		case 1:
			System.out.println("1");
		case 3:
			System.out.println("3");
		case 5:
			System.out.println("5");
		case 7:
			System.out.println("7");
		case 8:
			System.out.println("8");
		case 10:
			System.out.println("10");
		case 12:
			res = "31";
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			res = "30";
			break;
		case 2:
			res = "29";
			break;

		default:
			res = "���� �ƴմϴ�";
		}
		System.out.println(month + "����" + res + "�����Դϴ�");

		// ����(������ : ������ ���Ⱚ)
		// java.lang.Math (Math Ŭ����)
		// default > java.lang.Math
		// java ���������� default ������� ������ �ִ�.(java.lang) >> import java.lang.*
		// ������ ���(��Ģ) import java.lang.Math; ����ϰڽ��ϴ�

		// Math.lang()
		// static Random() ��ü ���� ���̵� ��밡�� (static �Լ��� ���� ����ϴϱ�)
		// Returns a double value with a positive sugbm greater thatn or equal to 0.0
		// less than 1.0
		// ��� : 0.0 <= random <1.0

		System.out.println("Math.random(): " + Math.random());
		System.out.println("Math.random() * 10:" + Math.random()*10);
		//0~9������ ��������
		System.out.println("Math.random() * 10:" + (int)(Math.random()*10));
		//1~10
		System.out.println("Math.random() * 10:" + ((int)(Math.random()*10) +1));

		/*
		 �츮�� ��ȭ�� ��ǰ �ý����� ������� �Ѵ�
		 ��ǰ�ý����� ������ ������ ���� ��ǰ�� �����ϴ� �ý����̴�
		 ��ǰ ��÷�� 1000 ������ ������ ��ǰ���� 
		 TV, NoteBook, ����� , �ѿ켼Ʈ, ����
		 
		 ��ǰ ��÷�� 900 ������ ������ ��ǰ���� 
		 NoteBook, ����� , �ѿ켼Ʈ, ����
		 
		 ��ǰ ��÷�� 800 ������ ������ ��ǰ���� 
		 ����� , �ѿ켼Ʈ, ����
		 
		 ��ǰ ��÷�� 700 ������ ������ ��ǰ���� 
		 �ѿ켼Ʈ, ����
		 
		 ��ǰ ��÷�� 600 ������ ������ ��ǰ���� 
		 ����
		 
		 �׿� ������ 100~500������ ĩ��
		 ��÷�ý����� ���������� 100~100������ ���� 
		
		 ����ڰ� ��ǰ�ý��Ĥ��� ���� �����ϰ� 100 ~ 1000������ ���� ������ �Ǿ��ִ�
		 */
		
		
		switch((int)(Math.random()*10)*100) { 
		
		case 1000: System.out.println("����� ������" + ((int)(Math.random()*10)*100) +"�� �Դϴ�TV, NoteBook, ����� , �ѿ켼Ʈ, ����");
		break;
		case 900: System.out.println("����� ������" + ((int)(Math.random()*10)*100) +"NoteBook, ����� , �ѿ켼Ʈ, ����");
		break;
		case 800: System.out.println("����� ������" + ((int)(Math.random()*10)*100) +"����� , �ѿ켼Ʈ, ����");
		break;
		case 700: System.out.println("����� ������" + ((int)(Math.random()*10)*100) +"�ѿ켼Ʈ, ����");
		break;
		case 600: System.out.println( "����� ������" + ((int)(Math.random()*10)*100) +"����");
		break;
		default : System.out.println("����� ������" + ((int)(Math.random()*10)*100) +"ĩ��");
		break;
		}
		
}

}
