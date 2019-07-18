package book;

/*
 * Book 여러개가 꼽혀있어
 * 책 객체 여러개를 한번에 저장하고 관리할 수 있는 클래스
 */

public class BookShelf {
	
	//멤버변수 
	Book[] books;
	
	public BookShelf() {
		books = new Book[0]; 
		// 디폴트형에선 매개변수로 넘어오는 값이 없어
		// 직접 할당함
	}
	
	BookShelf(Book[] books){
		this.books = books;	
	}
	
	// 책장에서 책을 추가 : add : void : 매개변수로 Book 1개를 받음
	public void add(Book book) {
		//현재 books보다 길이가 1 큰 배열을 새로 만든다.
		Book[] newBooks = new Book[books.length+1];
	
		
		// books의 모든 책 내용을 새로 생성한 1칸 큰 배열에 
		// 앞 쪽부터 복사
		for(int count = 0; count <books.length; count++) {
			newBooks[count] = books[count];
		}
		
		//매개변수로 넘겨진 book은 마지막 새로 생긴 칸에 저장
		newBooks[books.length] = book;
	}
	
	// 책장에서 책을 제거 : void : remove(Book book)
	public void remove(Book book) {
		// book 객체의 sequence가 같으면 같은 책으로 판단해서 삭제
		// 폐기 안하고 남는 책을 유지 할 새 배열
		
		
		// 1. 폐기할 책이 위치하는 인덱스를 찾기
		
		// 2. 폐기할 책의 인덱스가 -1보다 크면
		//    폐기할 책이 있다는 의미로 판단하고 삭제로직 진입
		
		// 3. 폐기 안할 책을 유지할 새 배열을 지금 배열 -1크기로 생성
		
		// 4. 폐기할 인덱스가 배열 중간일 때
		// (1)삭제할 책 앞쪽의 책정보는 같은 인덱스로 복사
	    // (2)삭제할 책 뒤쪽의 남는 책정보는 현재 인덱스 -1 로 복사
		
		// 5. 폐기할 인덱스가 배열 끝일 때
		// (1)삭제할 책 앞쪽까지만 새 배열에 복사
		
		// 6. 남는 책이 복사된 새 배열을 this.book에 새로 저장
	}
	
	
	// 책 정보를 수정하기
	public void set(Book book) {
		//수정할 book이 books 배열 몇번째 인덱스에 있는지 찾음
		int index = findBookIndex(book);
		
		if (index > -1) {
			books[index] = book;
		}
	}
	
	// 책 한권 얻기 Book : get(Book book)
	public Book get(Book book) {
		//입력된 book의 sequence 값과
		//내부 배열에 저장된 책들 중 일치하는 sequence를 가진
		//책 1권의 정보를 리턴	
		return findBook(book);
	}
	
	private Book findBook(Book book) {
		Book findBook = null;
		for (int idx = 0; idx < books.length; idx++) {
			if (books[idx].getSequence() == book.getSequence()) {
				// 같은 책 찾음
				findBook = books[idx];
				break;
			}
		}
		return findBook;
	}
	
	private int findBookIndex(Book book) {
		int index = -1;
		for (int idx = 0; idx < books.length; idx++) {
			if (books[idx].getSequence() == book.getSequence()) {
				// 같은 책 찾음
				index = idx;
				break;
			}
		}
		return index;
	}

	// 전체 책 목록을 얻기

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}
	

}
