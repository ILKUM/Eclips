/*
 ��ü���� ���
 1. ��� (���뼺�� ����)
 2. ĸ��ȭ (private) -> �Լ�(read, write): �����Ҵ�(�ڿ���ȣ) -> ĸ��ȭ�� member field
 	read(get) , write (set) �����Լ� -> setter ,getter -> ��� getEmpno, setEname
 3. ������
  
  [������ �̶��ϴ� �༮�� �� �κ�]
  
  [method overloading]
 �ϳ��� �̸����� �������� ����� �ϴ� �Լ�
 ���: System.out.println();
 Ư¡: �����ε��� ���� ��� ������ �ش�
 	 why> ���ϰ� ����ҷ��� >> ������
 	  ���(���赵 � ���� �����ϸ�) >> �Լ��� Ȱ���� ���� ��� (�پ��� parameter ���)
 	 ^^static �Լ� why...
 ���� : �Լ��� �̸��� ���� parameter �� ������ Ƽ���� �޸��ϴ� ���
 1. �Լ��� �̸��� ���ƾ� �Ѵ�
 2.[parameter] ���� �Ǵ� [Type] �� �޶�� �Ѵ�
 3. return type�� overloading �Ǵܱ����� �ƴϴ�
 4. parameter�� ������ �ٸ��� �����Ѵ� 
 */
class Human{//���赵 ==Ÿ�� �����>new �� ���� ��ü ����
	String name;
	int age;
}
class OverTest{
	void add(Human h) { //������ ������ Type Ʈ���� ����
		h.name = "ȫ�浿";				//Human ��ü�� �ּҰ��� ���� �� �ִ�
		h.age = 100;
		System.out.println(h);
	}
	
	int add(int i) {
		return 100+i;
	}
	/* �浹
	int add(int s) {
		return 200+s;
	}
	*/
	String add(String s) {
		return "hello" + s;
	}
	int add(int i , int j) {
		return i+j;
	}
	
	void add(int i, String s) {
		System.out.println("�����ε�" + i + "/" + s);
	}
	
	void add(String s , int i) {
		System.out.println("parameter ������ �ٸ��� ����");
	}
	
	//�迭�� �ִ� Ex05_Array_Object ��ġ�� ����
	//Array ...�迭�� ��ü�� >> �迭�� ���� �ִ� ���� �ּҰ� (int[] �����ϴ� �ּҰ�)
	int[] add(int[] param) {//param ������ �޴� ���� �����ϱ��?
		int [] target = new int[param.length];
		for(int i = 0; i <param.length; i++) {
			target[i] = param[i]+1;
		}
		return target;
	}
	
	int[] add(int[] so, int[] so2) {
		int[] target2 = new int[so.length];
		for(int i = 0; i<so.length; i++) {
			target2[i] = so[i]*so2[i];
		}
		return target2;
	}
	
	
}


public class Ex11_Method_overloading {
	public static void main(String[] args){
	OverTest ot = new OverTest();
	int result = ot.add(100);
	System.out.println(result);
	String str = ot.add("ȫ�浿");
	System.out.println(str);
	
	//1 ok
	Human m = new Human();
	System.out.println("m�� �ּҰ� :" + m);
	ot.add(m);
	
	//2 
	ot.add(new Human()); //heap ���� todtjdehls wnth qkfh wjsekf
	
	//Array parameter �� �Ǵ� return Type
	int [] source = {10,20,30,40,50};
	
	int[] target = ot.add(source);
	System.out.println(source == target);
	//������ for��
	for(int value : target) {
		System.out.println(value);
	}
	
	int[] so = {10,20,30};
	int[] ta = {11,21,41};
	int[] ta2 = ot.add(so, ta);
	for(int value : ta2) {
		System.out.println(value);
	}
	
	
	
	
	
	
	
	
	
	}	
}
