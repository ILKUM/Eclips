package kr.or.bit;

import java.util.Scanner;

public class Ex09_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�Է�");
		Scanner sc = new Scanner(System.in); // ctrl+shift+o -> class�� import ���� �ڵ� ����

		
		/* if(sc.hasNextInt());{ //�ǹ��� �Լ�(is, has...)>> true, false
		 System.out.println("���� ���̾�"); 
		 } 
		 //else {
				System.out.println("�ٸ����ε�");
			}
		 
		// sc.hasNextLine()//�� ���ڿ� �����;�? >>true, false

		// ���(�ϱ�����)
		// ���ǹ�(if 3����) (switch(){case .. break;})
		// �ݺ��� for(�ݺ�Ƚ�� ��Ȯ) , while(true, false) , do~while()
		// �б⹮ break;(�� ��Ż��), continue(�Ʒ� ���� skip)

		int count = 0;
		if (count < 1) {
			System.out.println("True�Դϴ�");
		}
		// ������� ���� ����
		// �ڹ� ; �����ݷ� ������ �� (�ؼ��ϴ� ����)
		if (count < 10)
			System.out.println("True");

		char data = 'A';
		switch (data) {// switch(���ڰ�) ����(����), char, String ����
		case 'A':
			System.out.println("���ں�");
			break; // Ż���� ���� (switch ��)
		default:
			System.out.println("else ��� ��");
		}

		// �ݺ���
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			// System.out.println(i);
			// ������
			sum += i; // sum = sum + i
		}
		System.out.println("sum 1~10: " + sum);

		// for���� ����ؼ� 1~10������ Ȧ���� ��
		// �� for�� �ϳ��� ������ �ذ� (for�� �ȿ� if�� ����������

		int sum1 = 0;
		for (int i = 1; i <= 10; i += 2 /* i=i+2 */ //{
			//sum1 += i;
		//}
		//System.out.println(sum1);

		//1~100������ ¦���� ��
		
		/*sum3 = 0;
		
		for (int i = 1; i<=100; i++) {
			if(i%2==0) {
				sum3+=i;
		}
		}
			System.out.println(sum3);
		*/
		
		for(int i = 2; i <=9; i++) {
			for(int j = 1; j<=9 ; j++) {
				//System.out.println("i: " + i + "-" + "j" + j);
				System.out.printf("[%d]*[%d]=[%d]\t", i, j, i*j);
			
			} System.out.println();
		}
		//key point : break Ż��, continue ��ŵ
		
		for(int i = 2; i <=9; i++) {
			for(int j = 1; j<=9 ; j++) {
				//System.out.println("i: " + i + "-" + "j" + j);
				if(i == j) {
					break; //������ for�� Ż��
				
				}
				//System.out.printf("[%d]*[%d]=[%d]\t", i, j, i*j);
				System.out.printf("%s", "*");
			} System.out.println();
		}
		
		for(int i = 2; i <=9; i++) {
			for(int j = 1; j<=9 ; j++) {
				//System.out.println("i: " + i + "-" + "j" + j);
				if(i == j)continue; 
				System.out.printf("[%d]*[%d]=[%d]\t", i, j, i*j);
				
			} System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
