package kr.or.bit;
//class == ���赵 == Type
//���赵�� ��üȭ(�޸𸮿� �÷���)�� ���ؼ� ��ü�� �����Ǿ�� �Ѵ�
//��üȭ �Ȱ��� >>��ü, �ν��Ͻ�
//���赵�� ������ �⺻���� ������� ( �ʵ� + ������ + �Լ�)

//class Tire {    }
//class Car { Tire tire; }
//class Window {int i;}

public class Person {
	public String name;//instance variable(�ʱ�ȭ�� ���� �ʾƵ� �ȴ�) :default(�⺻��)�� ������ �ִ�
	public int age;	//�����ڸ� public���� �־
	
	public void print() {//���, ���� (method)
		System.out.println(name + " / " + age);
	}
}
