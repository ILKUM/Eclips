package kr.or.bit;

public class Practice_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_SIZE = 100;
		final char CONST_CHAR = '��';
		final int CONST_ASSIGNED;
		CONST_ASSIGNED = 12;
		
		System.out.println("������ ����� 10���Դϴ�");
		System.out.printf("������ ����� %d�� �Դϴ�.\n",10);
		
		/*int num1 = 20;
		System.out.println("������ �����" + num1 + "���Դϴ�");
		System.out.printf("������ ����� %d �Դϴ�.\n", 20);
		
		int num2 = 30;
		System.out.printf("num2(10����):%d\n", num2);
		System.out.printf("num2(8����):%o\n", num2);
		System.out.printf("num2(16����):%x\n", num2);
		*/
		System.out.printf("�ҹ��� \'%c\'�� �빮�ڴ� \'%c\'�Դϴ�.\n",'a','A');
		System.out.printf("\'%s\'�� �빮�ڷ� �ٲٸ� \'%s\'�Դϴ�\n", "java","JAVA");
		float f = 1.23f;
		System.out.printf("f = %f\n", f);
		double d = 1.23456d;
		System.out.printf("d = %f\n", d);
		
		//int num1 = 123;
		//int num2 = 0123;
		//int num3 = 0x123;
		
		//System.out.println("num1: " + num1);
		//System.out.println("num2: " + num2);
		//System.out.println("num3: " + num3);
		
		System.out.println("11 + 22 + 33 = " + (11 + 22 + 33));
		System.out.println("011 + 022 + 033 =" + (011 + 022 + 033));
		System.out.println("0x11 + 0x22 + 0x33 =" + (0x11 + 0x22 + 0x33));
		
		System.out.printf("%d\n",123);
		System.out.printf("%d\n",1234);
		System.out.printf("%d\n",12345);
		
		System.out.printf("%5d\n", 123);
		System.out.printf("%5d\n", 1234);
		System.out.printf("%5d\n", 12345);
		
		/*System.out.printf("%f\n", 1.23);
		System.out.printf("%0f\n", 1.23);
		System.out.printf("%1f\n", 1.23);
		System.out.printf("%2f\n", 1.23);
		*/
		
		/*short num = 10;
		num = (short)(num + 77l);
		int rate = 3;
		rate =(int)(rate*3.5);
		System.out.println(num);
		System.out.println(rate);
		
		num = 10;
		num += 77l;
		rate = 3;
		rate *=3.5;
		System.out.println(num);
		System.out.println(rate);
		
		System.out.println("3>=2 :" +(3>=2));
		
		
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		result = ((num1 +=10)<0) &&((num2 +=10)>0);
		System.out.println("result =" + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		System.out.println(num +=10);
		*/
		short num = 5;
		System.out.print((num++)+ " ");
		System.out.print((num++)+ " ");
		System.out.print((num++)+ "\n");
		System.out.print((num--)+ " ");
		System.out.print((num--)+ " ");
		System.out.print((num--)+"\n");
		
		int num5 = 15678; 
		System.out.println((byte)(num5));
		
		int num1 = 50;
		int num2 = 100;
		int big;
		int diff;
		
		big = (num1> num2)? num1: num2;
		System.out.println("ū��:" +big);
		
		diff = (num1>num2)?(num1-num2):(num2-num1);
		System.out.println("����:" +diff);
		
		/*int n = 3;
		if(n==1) {System.out.println("Simple Java");
		
		}else if(n==2){System.out.println("Funny Java");
		
		}else if(n==3) {System.out.println("Fantastic Java");
		
		}else if(n==4) {System.out.println("The Best Programing Java");
		
		}
		System.out.println("Do you like Java");
		*/
		
		int n = 24;
		switch(n/10) {
		case 0:
			System.out.println("0�̻� 10�̸��� ��");
			break;
		case 1:
			System.out.println("10�̻� 20�̸��� ��");
			break;
		case 2:
			System.out.println("20�̻� 30�̸��� ��");
			break;
		case 3:
			System.out.println("30�̻� 40�̸��� ��");
			break;
		default:
			System.out.println("40�̻� Ȥ�� ����");
		}
		
		
		System.out.printf("������ ����� %d�� �Դϴ�\n",10);
		System.out.printf("%c�� �빮�ڴ� %c�Դϴ�",'a','A');
		
		
		
		
		
		
		
		
		
		
		
				
				
		
		
		
		
		
	}

}
