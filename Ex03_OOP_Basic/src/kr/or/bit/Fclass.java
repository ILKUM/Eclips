package kr.or.bit;

/*
 * ****~~�Լ��� �ϳ��� ��ɸ� �����Ѵ�~~~***
 �Լ�(method): ��� ,������ �ּ� ����
 ex)�Դ�, �ȴ´�, �ܴ�
 
 Ŭ������ ������� : �ʵ� + ������ + �Լ�
 
 ex) ���ӹ� : ���ӱ�(�����ִ�) 1��
 			ĸ���̱�(���� �ְ�...������ ��ȯ) 3��
 			
  �Լ��� ����(4����)
 1.void, parameter(o) : void print(String str) {�����ڵ�}
 2.void, parameter(X) : void print(){�����ڵ�}
 3.return Type, parameter(o) : int print(int data){ return 100 }
 4.return Type, parameter(x) : int print() { return 200 }
 
 *void (�����ִ� ���� ����) : return value �� ����
 *return Type : [8���� �⺻ Ÿ��] + String + ����(��ü�� �ּ�) + Array + Collection + Interface
 **return Type ������ �ݵ�� {���ȿ��� return�̶�� Ű���尡 �����ؾ� �Ѵ�}
 *parameter( ����, �μ� ) :�������� 9(100��¥��, 1000¥�� ����), ���������� ������
 * �Լ��� �̸��� �ǹ��ִ� �ܾ��� ����:getReadnumber
 �Լ��� �ݵ�� ȣ��(Call) �Ǿ�߸� ����ȴ� : ������ ���� �̸��� �ҷ��־��� ��...
 *
 */
public class Fclass {
	public int data;

	// void m() {
	public void m() {
		System.out.println("�Ϲ��Լ� : void , parameter(x)");
	}

	public void m2(int i) {
		System.out.println("parameter value :" + i);
		System.out.println("�Ϲ��Լ� : void, parameter(0)");
	}

	public int m3() {
		return 100; // return Type ������ �ݵ�� return Ű���� ���
	}

	public int m4(int data) {
		return data + 1;
	}

	// Ȯ�� (parameter ������ ��ȭ)
	public int sum(int i, int j, int k) {
		return i + j + k;
	}

	// private (������, ������)
	// 1. Ŭ���� ���ο����� �ǹ� ����
	// 2. ��ü���忡���� private ������ �ʴ´�(ĸ��ȭ)

	// ��ü fc... ������ �ʴµ� ����� �� ���µ� why?
	// [private ������]�� ���� �Լ��� ������ �����ϱ�
	// Ŭ���� ���ο��� [�ٸ� �Լ�]�� [������ ����]����
	// [�����Լ�]... �������� �Լ��� ����ϴ� ���볻���� ������ �Լ� ex)��� �����Լ�
	private int operationMethod(int data) {
		return data * 200;
	}

	public int sum2(int data) {
		int result = operationMethod(data); //�ٸ� �Լ� ȣ�� �ϱ�
		if(result >0) {
			return 1;
		}else {
			return -1;
		}
	}
		
	//Quiz
	//a�� b ���߿� ū ���� return �ϴ� �Լ��� ���弼��
	//ex) max(500,300) return ���� 500 �ް� �ϸ� �ǿ�
	
	/*
	 public int max(int a, int b) {
		if(a>=b) {
			return a;
		}else {
			return b;
		}
	}
	*/
	
	public int max(int a, int b) {
		return (a>b) ? a : b;
	}
	
	public String concat(String s , String s2, String s3) {
		String result = s+"/" + s2 +"/" + s3;
		return result;
	}
		
	//��������� �⺻��
	//Ŭ������ Ÿ���̴�
	/*
	 public int call(){int data = 100; return data;} 
	 public Tv call(){ Tv t = new Tv(); return t;}
	 public Tv call() {return new Tv();} // new Tv heap �ø��� �ּҸ� return
	 
	 [Today Point]
	 Ŭ������ memory�� �÷��� ����� �� �ִ�
	 Tv t = new Tv(); (�޸𸮿� �ø��� ���)
	 
	 public int call (Tv t){}  //t��� ������ Tv Ÿ����(�ּ�) �� ���� �� �ִ�
	 public Tv call(){} //Tv Ÿ���� �ּҰ��� return�Ѵ�
	  
	  
	  
	  
	 
	 */
	
	public Tv objMethod() { 
		Tv t = new Tv(); //Tv Ÿ���� �ּҰ��� return�ؾ� �ϴ� �� ������ ����� new
		t.brand = "LG";
		return t;
	}
	public Tv objMethod() {
		return t;
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
