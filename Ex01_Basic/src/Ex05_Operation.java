//������
public class Ex05_Operation {
		public static void main(String[] args) {
			int result = 100/100;
			System.out.println(result);
			
			
			result = 13/2; //��
			System.out.println(result);
			
			//�������� ���ϴ� ������ (%)
			result = 13%2;//������ ���ϴ� ��
			System.out.println(result);
		
			//����, ����(������ ������ :�� ++, --) 1�� ����, 1�� ����
			int i = 10;
			//i = i+1;
			++i;//��ġ����
			System.out.println("��ġ i : " + i);
			i++;//��ġ����
			System.out.println("��ġ i :" + i);
			//���� ȥ�� : ��ġ, ��ġ ����
			
			//POINT : ��ġ ��ġ�� �ٸ� �����ڿ� ����(����_
			int i2 = 5;
			int j2 = 4;
			int result2 = i2 + ++j2;
			System.out.println("result2 = " + result2 + "j2 = " +j2);
			//result2 : 10, i2 = 5, j2 = 5
			result2 = i2 + j2++;
			System.out.println("result2 = " + result2 + "j2 = " + j2);
			
			//POINT
			//�ڹ��� ���� ��Ģ
			//������ ��� [����]�� int [��ȯ] �� ó��
			//byte + byte => �����Ϸ��� int + int
			byte b = 100; // -128~127 
			byte c = 1;
			byte d = (byte)(b + c);
			//1. int d = b+c;<<�̰� ���� ������
			//2. byte d = (int)(b+C); ������ �ս��� �ü��� ����.
			
			//byte + short => �����Ϸ� int + int
			//char + char => �����Ϸ� int + int
			//����ó����
			//point : ���꿡�� int ���� ���� Ÿ���� int ��ȯ(long����)
			//����(byte, char, short -> int) �ٲپ ó��
			
			//��Ģ �ǿ����� �� ǥ�� ������ ū Ÿ������ �ڵ� �� ��ȯ
			//byte + short -> int + int >>int
			//char + ont -> int + int >>int

			//int + lont -> long + long >>long
			
			//���� + �Ǽ�
			long ll = 10000000000l;
			float ff = 1.2f;
			float fresult = ll + ff; //���ڴ� �Ǽ�
			System.out.println("fresult : "+ fresult);
			
			float num2 = 10.45f;
			int num3 = 20;
			//num2 + num3 
			//�޴����� ūŸ���̱⶧���� �����ɰ� ����.: float + int >> float + float
			//float result5 = num2 + num3;
			System.out.println(result);
		
			int result5 = (int)(num2 + num3);
			System.out.println(result5); //�����θ�
			
			char c2 = '!';
			char c3 = '!';//char ����Ÿ�� �����������δ� �������� �������ִ�.
			
			//c2+c3�����...?
			//char results6= c2 + c3; int + int�ȵ˴ϴ�.
			int result6 = c2 +c3;
			System.out.println("result6 : " + result6);
		  //���Ѱ��� ���ڷ� ��� : ������ 66�� �ƽ�Ű�ڵ�ǥ ����
			System.out.println((char)result6);
			
			//���
			//�߼ұ�� ���蹮��(������ ���) >> �����]
			//2~9
			//2>> 1~9
			//2>> ~10
			
			//main �Լ� �ȿ� �ִ� lcak variable
			
			int sum =0;
			for(int j = 1 ; j<= 100; j++) {
				//System.out.println("j: "+ j);
				if (j%2 == 0) {
					System.out.println("j : "+ j);
					
				}
			}
			for(int j = 1 ; j<= 100; j++) {
				//System.out.println("j: "+ j);
				if (j%2 == 0) { // == true, false 
					//System.out.println("j : "+ j);
			   sum += j; //sum = sum +j;
			  				}
			}
			
			
				   System.out.println(sum);
			
			
			// == ������(���� ���ϴ� ������)
			if(10 == 10.0f) {
				System.out.println("True");
			} else {
				System.out.println("false");
				
			}
			
			
			//! ����������
			if ('A'!= 65) { //���� �ʴ�?
				System.out.println("�� �����ʾ�...");
			}else {
				System.out.println("�� ���� ���̾�");
				
				//�ϱ����� (point)
				//���׿����� 
				//if�� for�� while�� break�� continue�� �ܿ��!.
				int p = 10;
				int k = -10;
				int result8 = (p == k)? p : k; 
				//������ �����̸� k���� ���ϰ�
				//������ ���̸� p���� ���Ѵ�.
				System.out.println("result8:" + result8);
				//���׿����� if���� ȣȯ����
				//if ������ �ٲ㺸��
				
			}
			
			
			int p = 10;
			int k = -10;
			int result1 = 0;		
			if ( p == k) {
				result1 = p;
				
			}else {
				
					result1 = k;
					
			}
			System.out.println("result1=" + result1);
			
			
			//����ǥ
			/*
			 (������)
			 0 : false
			 1 : true
			 		OR 	AND
			  0 0 	0	0	
			  0 1	1	0
			  1 0	1	0
			  1 1	1	1
			  
			  SQL��(oracle)
			  select * (������� ��ü)
			  from emp (emp�κ���)
			  where empno = 1000 and sal>2000 (������ empno�� 1000 �׸��� sal >2000�ΰ�)
			  			  
			  select * (������� ��ü)
			  from emp (emp�κ���)
			  where empno = 1000 or sal>2000 (������ empno�� 1000 �Ǵ� sal >2000�ΰ�)
			  
			  ������
			  | or ������
			  & and ������
			  0�� 1�� ��ȯ�ؼ� bit ����
			  
			  || ������
			  && ��Ʈ����
			 
			 */
			
			int x = 3;
			int y = 5;
			System.out.println("x|y: " + (x|y));
			//������ 3�� -> 2���� (0�� 1�θ� �̷���� ������ �ٲپ)
			//2 0��, 2 1�� 
			// 128 64 32 16 8 4 2 1
			//				0 0 1 1 >> 3 2������
		//
		//					0 1 0 1	>> 5 2������	
		//OR				0 1 1 1	>> 4+2+1 > 7
		//AND 				0 0 0 1 >> 1	\
			System.out.println("x&y: " + (x&y));
		
		
		
			
		
		
			
		}
}


