package kr.or.bit;

public class Prime {

	public int primeNum(int n) {
		for (int i = 2; i < n; i++) { // �Է°����� ���� ������ ������ �Ҽ� Ȯ��
			while (n % i == 0) { // 2~ n-1 ���� ������ �������� ���´ٸ� �Ҽ�
					System.out.println("�Ҽ� �ƴ�");
					break;
			}
			break;
		}
		return n;
	}
}

	/*public int sumPrime(int n) {
		int sum = 0;
		for(int i =2; i<=n; i++) {// �Է°����� ���� ������ ������ �Ҽ� Ȯ��
			for (int j = 2; j < i;) { // �Է°����� ���� ������ ������ �Ҽ� Ȯ��
				while (n % j != 0) { // 2~ n-1 ���� ������ �������� ���´ٸ� �Ҽ�
					j++;// i+1 �Ͽ� n-1���� �ݺ�
				}

			}
			sum+= i;
		
	}return sum;
}
}*/
