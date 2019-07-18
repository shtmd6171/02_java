package book;

/*
 * 책 한 권의 정보를 담는 클래스
 * -----------------------------
 * 일련번호  : sequence   int
 * ISBN      : isbn       String
 * 제목      : title      String
 * 저자      : author     String
 * 출판사    : company    String
 * 페이지 수 : totalPage  int
 * 가격      : price      int
 * 재고수량  : quantity   int
 * -----------------------------
 * 생성자 중복정의
 * (기본생성자 명시, 매개변수 생성자 중복 정의)
 * --------------------------------------------
 * 메소드  : 
 * print() : 책의 정보를 출력하는 메소드
 * buy (int amount) : amount만큼 책의 재고를 늘리는 메소드
 * sell(int amount) : amount만큼 책의 재고를 줄이는 메소드
 * 
 * 
 * 각 필드를 설정하는 메소드
 * 자바 빈즈(Java Beans) 규격에 의한 접근자/수정자 메소드
 * getter/setter
 * 
 * getter 작성시 메소드 이름 규격
 * get으로 시작하고 멤버변수 필드의 첫글자를 대문자로 조합
 * 매개변수는 없음.
 * 리턴타입이 해당 멤버변수 필드의 타입과 맞춤
 * 예) sequence 필드의 getter는 다음의 규격을 갖는다
 * int getSequence(){
 *    return this.requence;
 * }
 * 
 * setter 작성시 메소드 이름 규격
 * set으로 시작하고 멤버변수 필드의 첫글자를 대문자로 조합
 * 매개변수는 해당 멤버변수 필드와 같은 타입과 변수 받음
 * 리턴값 없이 작성
 * 
 * void setSequence(int sequence) {
 *  this.sequenece = sequence;
 * }
 * 
 * 만약 멤버변수 필드가 boolean 타입이라면 getter의 이름은
 * get -> is
 * 
 * ------------------------------------------------------
 * 
 * 
 */
public class Book {
	
	int sequence;
	String isbn;
	String title;
	String author;
	String company;
	int  totalPage;
	int price;
	int quantity;
	int amount;
	
	Book(){
		
	}
	
	Book(int sequence) {
		this();
		setSequence(sequence); // 쌉가능
	}
	
	Book(int sequence, String isbn) {
		this(sequence);
		this.isbn = isbn;
	}
	
	Book(int sequence, String isbn, String title) {
		this(sequence, isbn);
		this.title = title;
	}
	
	Book(int sequence, String isbn, String title, String author) {
		this(sequence,isbn,title);
		this.author = author;
	}
	
	Book(int sequence, String isbn, String title, String author, String company) {
		this(sequence,isbn, title, author);
		this.company = company;
	}
	
	Book(int sequence,String isbn, String title, String author, String company,int totalPage) {
		this(sequence, isbn, title, author, company);
		this.totalPage  = totalPage;
	}
	
	Book(int sequence,String isbn, String title, String author, String company,int totalPage, int price) {
		this(sequence, isbn,title, author, company, totalPage);
		this.price  = price;
	}
	
	Book(int sequence,String isbn, String title, String author, String company,int totalPage, int price, int quantity) {
		this(sequence, isbn, title, author, company, totalPage, price);
		this.quantity  = quantity;
	}
	
	public void print() {
		System.out.println("일련번호 : "+ sequence);
		System.out.println("ISBN : "+ isbn);
		System.out.println("제목 : "+ title );
		System.out.println("저자 : "+ author);
		System.out.println("출판사 : "+ company);
		System.out.println("페이지 수 : "+ totalPage);
		System.out.println("가격 : "+ price);
		System.out.println("재고수량 : "+ quantity);
		System.out.println();
	}
	
	public void buy(int amount) {
		this.amount+=amount;
	}
	
	public void sell(int amount) {
		this.amount-=amount;
	}
	
	
	public int getSequence() {
		return sequence;
	}
	
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public int getTotalPage() {
		return totalPage;
	}
	
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	

}
