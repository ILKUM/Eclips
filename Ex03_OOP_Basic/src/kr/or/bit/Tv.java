package kr.or.bit;
/*
 Tv ���赵
 �䱸���� ����
 Tv�� ä�� ������ ������ �ִ�(���� ��� 1~200)
 Tv�� �귣�� �̸��� ������ �ִ�(���� ��� �Ｚ, ����)
 Tv�� ä�� ��ȯ ����� ������ �ִ�(ä�� �� �� ä�� �� �̵� �����ϴ�)
 ->ä���� ���� ��Ű�� ��� �� ������ �ִ�
 ->ä���� ���� ��Ű�� ����� ������ �ִ�
 */
public class Tv {
	public String brand; //Tv �귣��
	public int channel; //Tv ä��
	public void plus() {//Tv ä�� ����
		channel++;
	}
	public void minus() {//Tv ä�� ����
		channel--;
	}
}
