
public class Ex08_Static_Method {

	public void method() {
		System.out.println("나 일반함수야");
	}
	
	public static void smethod() {
		System.out.println("나 static 함수야");
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("나 static main 함수야");
		smethod();
		Ex08_Static_Method ex= new Ex08_Static_Method();
		ex.method(); 
		ex.smethod();
	}

}
