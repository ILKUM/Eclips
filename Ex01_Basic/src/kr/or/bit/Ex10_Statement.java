package kr.or.bit;

import java.util.Scanner;

//�ݺ���(while, do~while)

public class Ex10_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		while (i >= 10) {// ����true ���ѹݺ�
			System.out.println(i);
			// �ݵ�� ������� ������
			i--;
		}

		//while (1~100)������ ��
		int j =1; int sum = 0;
		while(j<=100) {
			sum+=j;
			j++;//������� ������ (���� �� �������ѰͰ� ���� �� ������ �Ѱ��� ����� ��
		}
		System.out.println("1~100������ ��: " + sum);
		
		//while ������ ������
		
		int k =2;
		int p =1;
		while(k <=9) 
		{
			p=1;
			while(p<=9) 
			{
				System.out.printf("[%d]*[%d]= [%d]\t",k,p,k*p);
				p++;
				//int n = 0; while ���� ����,,,while ������ �Ҹ�
			}
				System.out.println();
				k++;			
		}
		System.out.println("k��: " + k);
		
		//do ~while : ������ ����(����)... ������ �ѹ��� ���� �ϰڴ�
		//do{ ���๮ } while(����)
		//�޴� ����
		//1. �λ����
		//2. �޿�����
		//����� ���ϴ� ���� ��ȣ�� �Է��ϼ���? (������ �ѹ� ����)
		//3�� �Է��ϸ� ���ǿ��� true ������ ���� �ٽ� �Է� �޵���
		Scanner sc = new Scanner(System.in);
		int inputdata = 0;
		do 
		{
			System.out.println("�����Է���(0~10)");
			inputdata = Integer.parseInt(sc.nextLine());
		}
		while(inputdata > 10 ); //����: true do ���� ��� ����
		//10 ���� ū ���� ���� true.. do �� �ݺ� ����
		//0~10������ ���� �ԷµǸ� false while Ż��
		System.out.println("����� �Է��� ����:" + inputdata);
		
	}

}
