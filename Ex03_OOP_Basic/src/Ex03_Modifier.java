import kr.or.bit.Car;

/*
 ������(������) : modifier
 public (����:package ����(����) ���о��� ��� �ڿ� ����)
 private(����: Ŭ���� ���� �����ڿ�, ��ü ���忡���� ���� �Ұ�(���Ұ�))
 
 ��ü������ Ư¡
 1. ĸ��ȭ(����ȭ)
 1.1 Ŭ���� ���ο� �ִ� �ڿ�(member field, method) ����
     private int number; // instance variable
     private void cal(){} // ����(Ŭ����)������ ����ϴ� �����ڿ�
 1.2 ĸ��ȭ�� �� �ϴ� �ɱ�? private�� �־��� ?
 	 [�����Ҵ��� ���� �����Ҵ��� ���ؼ� �ڿ��� ��ȣ]
 	 
 	 [�����Ҵ�]
 	 public class Car {public int door} >>Car c = new Car(); c.door = 10; ���⼭ door�� �����Ҵ��� ������ �ڿ� Ÿ���� �Ҵ��� ���� ������
 	 
 	-1 �ȵǿ� ??
 	[�����Ҵ� : ������ ���ؼ� �����ϰ� �޴� ����] >>������ �Լ�
 	public class Car{ private int door; 
 						public void writeDoor(int data){
 						if(data >=0){door = data;}
 						else{door = 0; } }}
 						>>Car c = new Car(); c.writeDoor(100);
 						
 	�����ؿ�
 	1. private int number; // ���� �аų� ��>>�ּ� �ΰ��� �Լ��� �ʿ�???
 	   �Լ��� ����� �ǿ�(�ᱹ read �Լ� 1��, write �Լ� 1��)
 	   >>public void writeNumber(int data){ number = data;}//ĸ��ȭ�� �ڿ��� write
 	   >>public int readNumber(){return number;}//ĸ��ȭ�� �ڿ��� read
 	   
 	�׷��� java ������ Ư�ĳ� ������ �Լ��� �������� (ĸ��ȭ�� �ڿ��� ���ؼ� read, write) �����Լ�...
 	�����Լ��� setter �Լ�(write) , getter �Լ�(read)
 	
 	private int age;
 	-setter, getter ��λ���
 	-setter �� ����
 	-getter �� ����
 	 
 
 
 
 
 */
public class Ex03_Modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		int result = car.getWindow();
		System.out.println("result :" + result);
		car.setWindow(10);
		result = car.getWindow();
		System.out.println("result : "+ result);
		
		System.out.println("���� �ڵ��� �ӵ�:" + car.getSpeed());
		car.setSpeed(-100);
		System.out.println("���� �ڵ��� �ӵ�" + car.getSpeed());
		
		car.speedUp();
		car.speedUp();
		car.speedUp();
		car.speedUp();
		System.out.println(car.getSpeed());
		
		
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		System.out.println(car.getSpeed());
	}

}
