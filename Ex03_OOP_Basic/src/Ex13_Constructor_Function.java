import kr.or.bit.Book;

/*
 ������ �Լ�(constructor)
 1. �Լ��� �Լ��ε� Ư���� ������ �Լ�
 2. Ư���� ���� (memmber field �ʱ�ȭ)
 
 Tip) static >> static{}, �Ϲݺ��� >> {}
 
 3. �Ϲ��Լ��� �ٸ���
 3.1	�Լ��� �̸� ����(class �̸��� ����)
 3.2	���� ���� ������ return Type�� ����, void > defalt�� void �� ����
 3.3	���� ���� ��ü���� �� ȣ��Ǵ� �Լ�
 
 4. ����: �����Ǵ� ��ü���� �ٸ� �ʱⰪ�� �ο��ϴ� ���m
 
 class Car{ int door=0;}
 
 5. ������ �Լ��� overloading ����
 ************* �������� �ǵ� ***********
 *���������� overloading �� ������ �Լ��� �ϳ��� �����Ѵٸ� �����Ϸ��� �ڵ����� default ������ �Լ��� ������ �ʴ´�
 *���� default ������ �Լ��� ����ϰ� �ʹٸ� ���� �����ϼ���
 *why? �������� ������ �ǵ��� ����ִ� �� 
 �Ϲ� �Լ����� �ڵ差�� ����...
 */

class Car{
	String name;
	//Car(){} ������� ������ Compiler�� Car(){} �ִٰ� �����ϰ� �����մϴ�
}

class Car2{
	String carname;
	Car2(){ //default constructor (������)
		System.out.println("�� ������ �Լ���^^");
		carname = "pony"; //member field �ʱ�ȭ
	}
}

class Car3{
	int number;
	Car3(){
		System.out.println("member field �ʱ�ȭ");
	}
}

class Car4{
	int door;
	int wheel;
	
	//Car4(){			}
	Car4(int num){ //overloading (����)
		door = num;
		System.out.println("overloading door" + door);
	}
	Car4(int num, int num2){
		door = num;
		wheel = num2;
		System.out.println("overloading wheel,door" + wheel+"/"+door);
	}
}

class Car5{
	String name;
	int wheel;
	Car5(String carName, int carWheel){
		name = carName;
		wheel = carWheel;
		System.out.printf("�̸� : %s , �ٰ��� : %d",name, wheel);
				
	}
}

class House{
	String doorcolor;
	House(String color){
		doorcolor = color;
	}
}

class House2{
	String doorcolor;
	
	House2(){
		doorcolor = "yellow";
	}
	
	House2(String color){
		doorcolor = color;
	}
}

public class Ex13_Constructor_Function {

	public static void main(String[] args) {
		Car c = new Car();//Car(); �Լ��� ȣ��
		
		//Car2 c2 = new Car2();
		//Car2 c22 = new Car2();
		Car4 c4 = new Car4(10,50);
		Car4 c5 = new Car4(50, 100);
		
		//Car5 sc = new Car5("�浿", 4);
		
		House h = new House("black");
		
		House2 h3 = new House2();
		System.out.println(h3.doorcolor);
		
		House2 h4 = new House2("red");
		System.out.println(h4.doorcolor);
		
		
		Book b1 = new Book("�Ұ���", 10000);
		b1.nameBook();
		b1.priceBook();
		b1.infoBook();
		
		Book b2 = new Book("�����", 5000);
		b2.nameBook();
		b2.priceBook();
		b2.infoBook();
		
		Book b3 = new Book("���� ���� �ı��� �Ǹ��� �ִ�", 8000);
		b3.nameBook();
		b3.priceBook();
		b3.infoBook();
		
		String b1name = b1.getBookName();
		System.out.println(b1name);
				
		
	}

}
