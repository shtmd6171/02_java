package Book;

public class BookTest {

	public static void main(String[] args) {
		Book book = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		Book book4 = new Book();
		Book[] books = new Book[0];
		BookShelf bookshelf = new BookShelf(books);
		

		
		book.setSequence(3); // 일련번호 3인 책1 추가
		book.print();
		bookshelf.add(book);

		book2.setSequence(6);  // 일련번호 6인 책2 추가
		book2.print();
		bookshelf.add(book2);

		book3.setSequence(8); // 일련번호 8인 책3 추가
		book3.print();
		bookshelf.add(book3);
		
		bookshelf.remove(book3);
	
		
		
		

	}



}
