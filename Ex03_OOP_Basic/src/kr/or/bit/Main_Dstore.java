package kr.or.bit;

import java.util.Scanner;

public class Main_Dstore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number;
		Dstore d1 = new Dstore("����Ű", 1);
		Dstore d2 = new Dstore("�Ƶ�ٽ�", 2);
		Dstore d3 = new Dstore("�����̽�", 3);
		do {
			System.out.println("������ ��ȸ�ϰ� ���� �� ���� �Է��Ͻÿ�(1,2,3)\n �����ϰ� �ʹٸ� \"����\"�� �Է����ּ���");
			Scanner sc = new Scanner(System.in);
			number = sc.nextLine();
			
			if(number.equals("1")) {
				System.out.println("1�� - ����Ű");
				continue;
			}else if(number.equals("2")){
				System.out.println("2�� - �Ƶ�ٽ�");
				
			}else if(number.equals("3")) {
				System.out.println("3�� - �����̽�");
			}else if(number.equals("����") ){
				System.out.println("�����մϴ�");
				System.exit(0);
			}else {
				System.out.println("�Է¿���");
			}
			
		}while(true);
				
	}

}
