package kr.or.bit;
/*
 �츮 ȸ��� ����⸦ �ֹ� ����
 
 �䱸����
 1.����⸦ �����ϰ� ������� �̸��� ��ȣ�� �ο��ؾ� �մϴ�
 2.����Ⱑ ����Ǹ� ������� �̸��� ��ȣ �°� �ο��Ǿ����� Ȯ�� �ϴ� �۾��� �ʿ��մϴ�(�������Ȯ��)
 3.�������� ������� ������� ������� �Ѵ�� (����)�� Ȯ�� �� �� �ֽ��ϴ�.
 */
public class Airplane {
/*
	private String airName;
	private int airNum;
	private static int stack; //��ü���� �����Ǵ� �ڿ�(��ü�� �����ڿ�)
	
	public void mkAirplane(String name, int num) {
		airName = name;
		airNum = num;
		stack++;
		System.out.printf("%d �� %s �����\n" , airNum,airName);
	}
	
	public void howMany() {
		System.out.println(stack);
	}
*/	
	private String airName;
	private int airNum;
	private static int totalNum;
	
	public Airplane(String airName, int airNum ){
		this.airName = airName;
		this.airNum = airNum;
		totalNum ++;
		
	}
	public void showMe() {
		System.out.printf("����� �̸� : %s, ����� ��ȣ : %d\n",airName,airNum);
	}
	public static void checktotal() {
		System.out.println(totalNum);
	}
	
}
