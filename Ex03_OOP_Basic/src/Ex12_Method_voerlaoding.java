class Human2{
	String name;
	int age;
	
}

class Test{
	Human2 add (Human2 h){//�ּҰ��� �޾Ƽ� �ּҰ��� �����Ѵ�
		 				//�ּҰ��� Human2�� �ּҰ�
		h.name = "ȫ�浿";
		h.age = 200;
		return null;
			
	}
	
	Human2 add(Human2 h, Human2 h2) { //h >>xx����  h2>>yy����
		h2.age = h.age;
		h2.name = h.name;
		return h2;
	}
}
public class Ex12_Method_voerlaoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		Human2 man = new Human2();
		Human2 man2 = t.add(man);
		System.out.println("man �������� == man2 ��������" + (man==man2));
		System.out.println(man2.name +"/" + man2.age);
		System.out.println(man);
		System.out.println(man2);
		////////////////////////
		Human2 m = new Human2();//xx����
		m.age = 20;
		m.name = "�ƹ���";
		
		Human2 m2 = new Human2();//yy����
		
		Human2 m3 = t.add(m, m2); //xx����, yy����
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
