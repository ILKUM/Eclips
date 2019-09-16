package kr.or.bit;
import java.util.Scanner;
public class Ex07_Printf_format {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java: System.out.println();
		//C#: Console.WriteLine();
		
		System.out.println("A");// ��ü���� ��� �����ε�
		System.out.print("B");
		System.out.print("C");
		System.out.println("D");
		
		int num = 100;
		System.out.println(num);
		System.out.println("num ���� :" + num + "�Դϴ�");
		//����(format)
		System.out.printf("num ���� : %d �Դϴ� \n", num);
		//format ���� ����
		// %d (10���� ������ ����) >> ����� �ڸ���
		// %f(�Ǽ�)
		// %s (���ڿ�)
		// %c (����)
		// Ư������ : \t (tab), \n (�ٹٲ�)
		System.out.printf("num ���� [%d] �Դϴ� �׸��� [%d] �� �־��", num, 1000);
		
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("�������� %f �Դϴ� \n", f); //f �������� 3.140000 �Դϴ�

		//cmd(console) â���� �Է��� �� �о����
		//java.util.Scanner sc = java.utill.Scanner ( System.in);
		//import ���� ��� ... Scanner ���
		Scanner sc = new Scanner(System.in);
		/*System.out.println("���� �Է��ϼ���");
		String value = sc.nextLine(); // ������ nextLine() ����� �Է��� ���� ���ڿ��� ����
		System.out.println("�Է°� :" + value);
		
		int number = sc.nextInt();//�������� �о �����ϰڽ��ϴ�
		System.out.println("������: " + number);
		*/
		//sc.nextFloat(); �Ǽ��� �б�
		//���� ����: nextInt, nextFloat �Լ����ٴ� nextLine() �� �������
		//Today point
		//[���ڸ� -> ���ڷ� �ٲٱ�]
		//Integer.parseInt(s) ���ڸ� ������
		//Float.parseFloat(s) ���ڸ� �Ǽ���
		//Double.parseDouble(s) ���ڸ� �Ǽ���
		
		
		System.out.println("���� �Է��ϼ���");
		int number = Integer.parseInt(sc.nextLine());
		System.out.println("������:" + number);
		
		//Tip
		// ���ڸ� -> ���ڷ� (����)
		String data = String.valueOf(10000);
		System.out.println(data);
		
}

}
