import kr.or.bit.Emp;

public class Ex01_Helloworld {
//extends object ����Ʈ���̶� ǥ�ð� �ȵ�
//hello world �ȿ� object�� ���� �ֵ�.
	public static void main(String[] args) {
		//������ �̸� ���θ޼ҵ�
		//System.out.println("hello world");
		
		//kr.or.bit.Emp emp = new/*������*/ kr.or.bit.Emp(); //emp��� ���赵�� ���� �Ȱ��� ������ ��¶��� new
		//emp.data = 10000; �̰� �����Ҵ�
		//���뼺�� �߿��ϴ� ��ü���⿡��
		//emp.setData(10000); //�̰� �����Ҵ�
		//System.out.println(emp.getData());
		Emp emp = new Emp(); //��� �Ѹ��� �����մϴ�
		emp.empno = 7777;
		emp.ename = "ȫ�浿";
		emp.job = "IT";
		
		String str = emp.getEmpInfo();
		System.out.println(str);
		
		Emp emp2 = new Emp();
		emp2.empno = 8888;
		emp2.ename = "�ƹ���";
		emp2.job = "sales";
	
		String str2 = emp2.getEmpInfo();
		System.out.println(str2);
		
		}

}
