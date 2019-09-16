package kr.or.bit;

public class CarHouse {
	private static int stack;//�� ���
	private String model;//�� ��
	private int price;// ����
	private static int smartStack;// smart�� ���
	private static int webStack;// web �� ���
	private static int javaStack;// java �� ���
			
	public CarHouse(String model, int price){

		if(!model.equals("Smart") && !m.equals("Web") && !m.equals("Java")) {// �߸��Է½� �޽��� ���
			System.out.println("���� ���� Ȯ���ϼ���");	
			System.exit(0);
		} else {
			this.model = model;// model�� m�� �Է�
			this.price = price;// price�� p�� �Է�
			stack++;//�� ��� ����			
			if(model.equals("Smart")){//���� Smart�� ���
				smartStack++;//Smart ��� ����
			} else if (model.equals("Web")) {//���� Web�� ���
				webStack++;//Web ��� ����
			} else {
				javaStack++;//Java ��� ����
			}
		}
	}
	
	public void carinfo() {//���� ���� ȣ��
		
		if(model.equals("Smart")) {
			for(int i =1; i<=5; i++) //�ﰢ��
			{
				for(int j=1; j<=5-i; j++) 
				{
					System.out.print(" ");
				}
				for(int j=1; j<=i+i-1; j++) 
				{
					System.out.print("*");
				}
				System.out.println();
			}			
			System.out.println("�𵨸� : " + this.model + modelLogo.getSlogo() + "\t���� : " + this.price);
		}else if(model.equals("Web")) {
			for(int i = 1; i<=5; i++) {//���ﰢ��
				for(int j = 1; j<i; j++) {
					System.out.print(" ");
				}
				for(int j =1; j<=2*(5-i)+1;  j++ ) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("�𵨸� : " + this.model + modelLogo.getWlogo() + "\t���� : " + this.price);
		}else if(model.equals("Java")){
			for(int i=1; i<=5; i++) {//�簢��
				for(int j =1; j<=5; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("�𵨸� : " + this.model + modelLogo.getJlogo() + "\t���� : " + this.price);
		}else {
			System.out.println("���� ����");
		}
		
	}

	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}

	public void howmanyTotal() {//�� ��� Ȯ��
		System.out.println("����� : " + stack);
	}
	
	public void howmanySmart() {//Smart ��� Ȯ��
		System.out.println("Smart ��� :" + smartStack);
	}
	
	public void howmanyWeb() {//Web ��� Ȯ��
		System.out.println("Web ��� : " + webStack);
	}
	
	public void howmanyJava() {//Java ��� Ȯ��
		System.out.println("Java ��� : " + javaStack);
	}
}



