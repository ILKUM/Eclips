class Data{ //Ŭ���� ==Ÿ��(ūŸ��)
	int i;
	
}


public class Ex10_Method_Call {

	public static void main(String[] args) {
		Data d = new Data();
		d.i = 100;
		System.out.println("d.i : " + d.i);
		
		scall(d);//POINT (d��� ������ �ּҰ�(����) � Ÿ���� ����>Data)
		vcall(d.i);
		System.out.println("d.i : " + d.i);
	}
	
	static void scall(Data data) { // �ּҰ� ����
		//data ��� ������ Data��� Ŭ������ �ּҰ��� ������ �ſ�
		//Data�� �ǹ��ϴ� ���� �ּҰ�
		System.out.println("�Լ� : " + data.i);
		data.i = 1111;
	}
	
	static void vcall(int x) { //�ּҰ� �ƴ� �� ����
		System.out.println("before : " + x);
		x= 8888;
		System.out.println("after : " + x);
	}

}
