class InitTest{
	static int cv =1;
	
	int iv = 1;
	
	static { //static �ʱ��� (�Լ�) : ���� �ʱ�ȭ �������
		cv =2;
	}
	
	{iv = 3;}//instance �ʱ��� (�Լ�) : instance ���� �ʱ�ȭ
}
public class Ex05_Instance_Init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
