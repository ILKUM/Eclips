package kr.or.bit;

import java.util.Scanner;

public class Signup {
	private String name;//������û�� �̸�
	private String phone;// ������û�� �޴�����ȣ
	private String card;// ���Ϲ��ī��
	private boolean possesion;//ī��������� �̼���: false ����

	public Signup(String name, String phone) {//������û�ڴ� �ݵ�� �̸��� �޴��� ��ȣ�� ������
		this(name, phone, null);
		possesion = false;
	}

	public Signup(String name, String phone, String card) {//������û�ڴ� �ݵ�� �̸��� �޴��� ��ȣ�� ������
		this.name = name;
		this.phone = phone;
		this.card = card;
		possesion = true;
	}

	public void signup() {
		if (possesion == true) {
			int i;
			do {
				System.out.println("���� ��ȣ�� �����Ͻÿ�\n1.java " + "\t2. python\t3.c");
				Scanner sc = new Scanner(System.in);
				i = Integer.parseInt(sc.nextLine());
				if (i == 1) {
					System.out.println("java - ����(�Ӱ�� ����Ԣ�.��");
					break;
				} else if (i == 2) {
					System.out.println("python - ���ʺ���");
					break;
				} else if (i == 3) {
					System.out.println("c - ����");
					break;
				} else {
					System.out.println("�ٽ� �Է��ϼ���");
					continue;
				}
			} while (true);
		} else {
			System.out.println("���Ϲ��ī�尡 ��ϵ��� �ʾ� ������û�� �� �� �����ϴ�");
		}
	}

	public void showinfo() {
		if(possesion == true) {
		System.out.println("�̸� : " + this.name + "\t��ȭ��ȣ : " + this.phone + "\tī���ȣ" + this.card);
		}else {
			System.out.println("�̸� : " + this.name + "\t��ȭ��ȣ " + this.phone);
		}
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getCard() {
		return card;
	}

}
