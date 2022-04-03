package objectandclass;

class Book{
	String bookName;//instance variable
	int bookId;
}

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book();
		b.bookId = 123456;// reference assign
		b.bookName = "abcdef";
		System.out.println(b.bookId + b.bookName);
	}

}
