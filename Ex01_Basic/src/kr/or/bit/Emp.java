package kr.or.bit;

//���� �ּ�(�ؼ������ʴ� �ּ�)
/*
 ������ : ȫ�浿
 ��¥ : 2019-08-05
 ���� : �������� ���������Դϴ�.
 
 class ���赵�̴�. (���� �߿��ϴ�)
 ���赵 �⺻���� �������(��������(�Ӽ�): ���� +��������(���):�Լ�)
 
 �ڵ��� ���赵 >> 
 ��������(�Ӽ�) : ��̸�, ����, Ÿ�̾�, â�� , �ӵ�  >>����>> int (Ÿ��) speed(����) = 0  
 ��������(���) : �޸���, �����, �ӵ��� ���δ�. >> �Լ� > public void speedup(){++speed}
 
 �������赵 : ��Ϲ���, ����, �⸧, 
 
 */

public/*������*/ class Emp { //����̶�� ���赵 
	 public int empno; //����� �纻�� �������ִ�.(��� ���ڵ�����)
	 //���� -> ������ ��Ÿ����(����)-> member field ->>instance variable 
	 public String ename; // �̸�
	 public String job; //����
	 
	
	 private int data;
	 
	 //Ʈ���� ���� : ĸ��ȭ�� �ڿ��� ���ؼ� set, get >> setter�Լ� , getter �Լ�
	 public int getData() { //��� (��������) >> method
		 return data;
		 
	 }
	 public void/*�� ������ �����ٰ� ���� ��� ���� �Լ�*/ setData(int input) {
		 if(input < 100) {
			 this.data=input;
		 }else {
			 this.data = 0;
		 }
		 //ĸ��ȭ�� ������ �ǹ� - �����Ҵ��� ���ϰ��ϰ� �����Ҵ��� �ϴ� �� 
		 
	 }

public String getEmpInfo() {
	return empno + "/"+ ename + "/" + job;
	
}
	 
	 
}
//���⿡ ����ϴ�.(������) : �������� �˼� �ִ� �ܾ�� ǥ���Ǿ���Ѵ�.
//getListById

//��������(���) : �Լ�(method)
//�Լ��� �ݵ�� ȣ�� ���� 














