/*
 Ŭ���� == ���赵 == Ÿ��
 
 Ŭ������ ������� : �ʵ� + ������ _ �Լ�
 *�ʵ�>> ��������, ���� ����, ��������
 *������>> �ʵ��� �ʱ�ȭ�� �������� �ϴ� �Լ� constructor
 *�Լ� >> ��� method
 
 Ŭ���� , �ʵ�, ������. �Լ�: ���� �����ϱ� ���ؼ� (������, ������, ������)
 >>public, private, default, protected (��ӿ���)
 
 1.public class Test {}
 
 2.class Test{} >>�����Ϸ��� ���������� default �����ڸ� ���δ�
 >>>>>>default class Test {}
 >>default ���� �ʴ´�...
 >>default �����ڴ� : ���� ���� �ȿ����� ������ ����, �ٸ� ������������ ���� ������ �Ұ�
 
 ex> �ǽ�
 1/kr.or.bit.common ���� 
 CommmonClass >> public class >>
 Ex01_main �� Common �ٸ� ������ �ִ�
 Exo1_main Ŭ������ CommonClass �ڿ� ���� ����
 
 2. kr.or.bit.common ����
 Ex01_main Ŭ���� �ڿ� ���� ���
 why? ������()���� ���� �ȿ����� ���� ����, �ٸ� ������ �����鼭 ���� ���� �Ұ�
 >>default class ���� ����ϴ� ���� :���� ���� ������ ���� ��������
 
 3. �ϳ��� �������� �ڹ������� �������� Ŭ������ ���� �� �ִ� (O)
   �� public �� �ϳ��� class �� ���´�(�������� default)
 */
public class Ex01_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			kr.or.bit.common.CommonClass cc = new kr.or.bit.common.CommonClass;
			cc.p_iv = 100; //why ? public int p_iv
			
			Test tt = new Test();
			tt.d_iv = 200; //���� ���� (default ������ ���� ����)
			tt.p_iv = 300; //public �� ������ ������� ���� ����
			//tt.pri_iv ���ٺҰ�
		}
	}

}
