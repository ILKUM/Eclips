import kr.or.bit.Emp;
import kr.or.bit.Menu;
import kr.or.bit.Person;
import kr.or.bit.Tv;

public class Ex01_Ref_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i = 100;
		
		Person person=null; //���� �ִ� ���� >>stack �̶�� �޸� ������ ������ ��������� null �� �Ҵ�
						//person ���� 4 byte ũ�⸦ ���´�
		System.out.println("person :" + person);
		person = new Person(); //�Ҵ�(Person ��ü�� �ּҰ�)
								//person Ÿ���� �޸𸮸� ���´�
		System.out.println("Ref person :" + person);//kr.or.bit.Person@15db9742
		person.name = "ȫ�浿";
		person.age = 10;
		person.print();
		
		//����� �Ҵ��� ���ÿ�
		Person myperson = new Person();
		myperson.name = "�ƹ���";
		myperson.age = 100;
		myperson.print();
		
		int num = 100;// local variable �ݵ�� �ʱ�ȭ: ó�� ���� �ִ� ����
		Person you;//�ʱ�ȭ �Ǿ� ���� �ʾƿ�... ���Ұ� ... Person �� Type ��
		//System.out.println(you);
		//The local variable you may not have been initialized
		
		//1. you ��� ������ �ʱ�ȭ(���� ... ���������� null �Ҵ�... �Ϲ������� �ּҰ��� ���� ��)
		you = new Person();//�ּҰ����� �ʱ�ȭ
		
		Person my;
		my = you;// �ʱ�ȭ �Ͽ����ϴ�(�ּҰ����� �ʱ�ȭ)
				//my �� you ���Ÿ� ����... ���� ���� ���ּҸ� ������ �����ϱ�)
		System.out.println(my == you);
		System.out.println(my + " : " + you);
		
		//Tv�����
		Tv tv1 = new Tv();
		tv1.brand = "samsung";
		tv1.channel = 100;
		tv1.plus();
		System.out.println(tv1.channel + "/" + tv1.brand);
		
		Tv tv2 = new Tv();
		tv2.brand = "lg";
		tv2.channel = 10;
		tv2.minus();
		System.out.println(tv2.channel +" / " + tv2.brand);
		
		Menu one = new Menu();
		one.code= 1;
		one.name= "�˸����ø���";
		one.kind= "���";
		one.price = 8000;
		
		
		Emp emp = new Emp();
		BodyInformation bodyinfo = new BodyInformation;
		
		emp.empno = 7788;
		emp.name = "������";
		emp.job = "IT";
		emp.sal = 5000;
		emp.bodyinfo.height = 180;
		emp.bodyinfo.weight = 70;
		
		
		
		
		
		
	}

}
