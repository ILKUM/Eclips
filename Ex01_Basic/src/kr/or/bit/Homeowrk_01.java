package kr.or.bit;

import java.util.Scanner;

public class Homeowrk_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���");
		int number1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("�����ڸ� �Է��ϼ���");
		String sign = sc.nextLine();
		
		System.out.println("���ڸ� �Է��ϼ���");
		int number2 = Integer.parseInt(sc.nextLine());
		
		int answer = 0;
		if (sign.equals("+")) {
			answer = number1 + number2;

		} else if (sign.equals("-")) {
			answer = number1 - number2;

		} else if (sign.equals("*")) {
			answer = number1 * number2;

		} else if (sign.equals("/")) {
			answer = number1 / number2;

		} else {
			System.out.println("����");
			return; //return�ڿ� �ƹ��͵� �Ⱦ��� ������ ����ڴ�. �Լ��� ����
		}
		System.out.println(answer);
	}
}