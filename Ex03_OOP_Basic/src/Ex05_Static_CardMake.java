import kr.or.bit.Airplane;
import kr.or.bit.Card;

public class Ex05_Static_CardMake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Card c = new Card();
		c.number = 1;
		c.kind = "heart";
		c.cardInfor();
		
		Card c2 = new Card();
		c2.number = 2;
		c2.kind = "heart";
		c2.cardInfor();
		*/
		
		//..53�� ��������...
		//��: ī�尡 ���� �����ߴ� ũ�Ⱑ �ƴϳ׿�
		
		
			
		Card c = new Card();
		c.number = 1;
		c.kind = "heart";
		Card.h = 100;
		Card.w = 70;
		c.cardInfor();
		
		Card c2 = new Card();
		c2.number = 2;
		c2.kind = "heart";
		c2.cardInfor();
		
			
		Airplane a1 = new Airplane("����",747);
		
		Airplane a2 = new Airplane("����",858);
		Airplane.checktotal();
		a1.showMe();
		a2.showMe();
				
	}

}
