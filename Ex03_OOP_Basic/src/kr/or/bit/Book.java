package kr.or.bit;
/*
 å�� �̸��� ������ �ְ� ������ ������ �ִ�
 å�� ���ǵǸ� �ݵ�� å�̸��� å�� ������ ������ �־�� �Ѵ�
 å�� �̸��� ���������� Ư�� ����� ���ؼ��� ���� �ְ� ,���ǵ� ���Ŀ��� ������ �� ����
 å�̸��� ���������� ���� Ȯ���� �� �ִ�
 */
public class Book {

	private String bookName;
	
	private int bookPrice;
	
	public Book(String bookName, int bookPrice){
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	public void nameBook() {
		System.out.println("å �̸� : " + bookName);
	}
	
	public void priceBook() {
		System.out.println("å ���� : " + bookPrice);
	}
	
	public void infoBook() {
		System.out.printf("å �̸� : %s , å ���� : %d\n", bookName, bookPrice);
	}

	public String getBookName() {
		return bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}
	
	
	
	
}
