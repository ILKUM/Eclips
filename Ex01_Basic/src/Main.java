import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (char c = 65; c <= 90; c++) {
			System.out.print(c);
		}

		System.out.println();
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 0) {
				System.out.println(i);
			} else {
				System.out.print(i + " ");
			}
		}

		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}

		}
		System.out.println(sum);

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				int sum1 = i + j;
				if (sum1 == 6) {
					System.out.printf("[%d] [%d]\n", i, j);
				}
			}

		}
		System.out.println("����, ����, ���� �Է��Ͻÿ�");
		Scanner sc = new Scanner(System.in);
		String i = sc.nextLine();
		int r = 0;
		if(i.equals("����")) { r = 1;
			
		} else if(i.equals("����")) {r = 2;
		
		} else if(i.equals("��")) {r = 3;
		
		} else {r = 4;
		
		} 
		
		
		int com = (int)((Math.random()*3)+1);
		if(com == 1) { System.out.println("��ǻ��: ����");
		
		} else if(com==2) {System.out.println("��ǻ��: ����");
		
		} else {System.out.println("��ǻ��: ��");
		
		} 

		if (r == com) {
			System.out.println("�����ϴ�");
		} else if ((r == 1 && com == 3) || (r == 2 && com == 1) || (r == 3 && com == 2)) {
			System.out.println("�̰���ϴ�");
		} else if ((r == 1 && com == 2) || (r == 2 && com == 3) || (r == 3 && com == 1)) {
			System.out.println("�����ϴ�");
		} else {
			System.out.println("Error");
		}
/*
		int i = 1;
		int sum3 = 0;
		while (i <= 99) {
			sum3 += i;
			i++;
		}
		System.out.println(sum3);

		int j = 1;
		while (j <= 100) {
			System.out.print(j + " ");
			j++;
		}
		System.out.println();

		int k = 100;
		while (1 <= k) {
			System.out.print(k + " ");
			k--;
		}
*/
	}
}
