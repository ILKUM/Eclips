//******* static �Լ� (���� ����Ѵٸ� ����� ���ϰ� ����ϼ��� new ���� �ʰ�)
class StaticClass{
	int iv;
	
	static int cv;
	
	void m() {//�Ϲ��Լ�
		//1. �Ϲ��Լ����� iv ���� ó��(O)
		//2. �Ϲ��Լ����� cv ���� ó��(O) >> m�Լ��� ��������� ���� �̹� cv�� �޸𸮿� �ֱ� ������ Today Point (��������)
		//static �ڿ��� �Ϲ��ڿ����� ���� memory �� �ö󰣴�.
		StaticClass.cv = 1000; //cv=1000;
	}
	static void sm() {//static �Լ�
		//1. iv ���� ó��(X) why? ��������>>static �ڿ��� �Ϲ��ڿ����� ���� �޸𸮿� ���������
		//static�� static���� ��ƶ�( �׷��� error�� ���� ���̴�
		//�Լ� ���忡�� ���� iv �� �޸𸮿� ����
		//2. cv ���� ó��(O)
		StaticClass.cv = 2000;
		
	}
}

public class Ex07_Static_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticClass.cv);
		StaticClass.sm();
		System.out.println(StaticClass.cv);
		
		StaticClass sc = new StaticClass();
		sc.m();
		System.out.println(StaticClass.cv);

	}

}
