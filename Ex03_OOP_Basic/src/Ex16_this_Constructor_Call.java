//2.this(�����ڸ� ȣ���ϴ� this)
//��Ģ : �����ڴ� ��ü ������ �� ���� ȣ�Ⱑ�� 
// this�� �̿��� �������� ������ �Լ��� ȣ��...

//****              ****
class Zcar{
	String color;
	String gearype;
	int door;
	
	Zcar(){
		//this.color = "red";
		//this.gearype = "auto";
		//this.door = 4;
		
		this("red","auto",4);//�� ���� �ٽ� �θ���
		//Zca("blue", "auto", 10); �����ؼ�
		//this �� ��ü�ڽ��� ����Ű�� �������ٸ� �����ڸ� ȣ���� ���ִ�
		System.out.println("default constructor");
	}
	Zcar(String color, String geartype, int door){
		
		this.color = color;
		
		this.gearype = geartype;
		this.door = door;
		//Ȯ������
		System.out.println("overloading constructor");
	}
	
	void print() {
		System.out.println(this.color + "/" + this.gearype + "/" + this.door);
	}
	
}

class Zcar3{
	String color;
	String geartype;
	int door;
	
	Zcar3(){
		this("red", 1);
		System.out.println("default constructor");
	}
	
	Zcar3(String color,int door){
		this(color,"auto",door);
		System.out.println("overloading constructor param 2��");
	}
	Zcar3(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloading constructor param 3��");
	}
	
	void print() {
		System.out.println(this.color + "," + this.geartype + "," + this.door);
	}
}

public class Ex16_this_Constructor_Call {

	public static void main(String[] args) {

		//Zcar z = new Zcar();
		//z.print();
		
		//Zcar z2 = new Zcar("blue","auto", 10);
		//z2.print();

		Zcar3 z3 = new Zcar3();
		z3.print();
		
		Zcar3 z2 = new Zcar3("gold", 2);
		z2.print();
	}

}
