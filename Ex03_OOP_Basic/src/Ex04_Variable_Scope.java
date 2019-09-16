
/*
 instance variable (class�� ��������� ���� class Car {String color;} �ʱ�ȭ�� �ʿ� ���� default �� ������ ����
  local variable   (class Car { void move(){int speed;}})
 static variable   (�����ڿ�, ��ü���������� memory�� �ö󰡴� �ڿ�)
 */
class Variable{
	int iv;
	/*
	 1. member filed, instance variable
	 2. Variable v = new Variable(); heap �޸𸮿� iv ����
	 	Variable v2 = new Variable(); heap �޸𸮿� iv ����
	 3. ����: ������ �������� (������ �´� Type ������ �������Ѵ�)
	 		-����(�Ӽ�) >> ��������, ��������, ��ǰ(����)����
	 		-������ ��ü���� �ٸ� ���� ���� �� �ִ�. �׷��� ������ ���� �ʱ�ȭ ���� �ʴ´�->default ���� ������ �ִ�
	 		int >> 0; float>>0.0, boolean>>false
	 		String>>����(Ŭ����)>>null
	 4. �������� : new ��� �����ڸ� ���ؼ� heap ��ü�� ��������� ���� �ٷ� ���� ����
	 */
	static int cv;
	/*
	 1. class variable (Ŭ���� ����, static variable(���� ����))
	 2. ����: ������ ��� ��(�����Ǵ� ��� ��ü�� �����ϴ� �ڿ��� ���� ����): ��ü�� �����ڿ�
	 	heap�� ������ ��ü���� �����ڿ�(�����ڿ�)
	 3. Ư¡: ���ٹ�� >> Ŭ�����̸�.static ������(��ü�� ��������� ���� ��Ȳ���� ���� ����)
	 	ex)Math.Random() >> Math m = new ���� �ʾҾ��
	 	���ٹ��>> ��������.static������
		Variable v = new Variable() >> v.cv
		Variable v2 = new Variable() >> v2.cv
	4. ����: javac ������ >> java Variable (����)
		>> class loader�� ���ؼ� 
		1. Ŭ���� ����(meta data)�� �о �� ������ class area (static area) �÷���
			static �ڿ��� ���� memory�� �÷���
			>static �ڿ��� ��ü���� ������ memory �ö󰡴� �ڿ�
	 */
	
	void method() {
		int lv = 0;
		/*
		 loval variable (�Լ� �������� :�ݵ�� �ʱ�ȭ)
		 �����ֱ� : �Լ� ���� ����~ �Լ������� ���� �Ҹ�
		 
		 �Լ� �ȿ� if ��(�� ����) ,for �� (for(int i =0;...))
		 
		 */
	}
}
public class Ex04_Variable_Scope {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable.cv = 100;
		Variable v = new Variable();
		Variable v2 = new Variable();
		
		//����
		System.out.println("v.cv: " + v.cv);
		System.out.println("v2.cv: " +v 2.cv);
		
		v2.cv = 5000;
		System.out.println(Variable.cv);
	}

}
