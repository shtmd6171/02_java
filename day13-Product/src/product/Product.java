package product;

/*
 * 전자제품을 판매하는 매장에서
 * 관리하는 대상인 제품을 정의하는 클래스
 * --------------------------------------
 * (public 선언 x)
 * 제품번호 : pcode    : String : <== "P001"
 * 제품명   : pname    : String : <== "삼성 지펠"
 * 가격     : price    : int    : 진짜 가격
 * 재고수량 : quantity : int    :
 * ---------------------------------------
 * 생성자 (public 선언)
 * 기본, 매개변수 생성자 필드 1씩 늘려가며 생성
 * this, this() 사용
 * ---------------------------------------
 * 메소드 (public 선언)
 * print() : void
 *  제품의 상태를 출력
 *  
 * toString() : String
 *  이 제품을 대표하는 문자열을 리턴
 *  String.format()으로 문자열 생성후 리턴
 *  
 * discount(double percentage) : int
 *   입력된 퍼센트만큼 할인된 가격
 *   
 * sell(int amouny) : void
 *  매장에서 판매되어 재고수량이 amount만큼 줄어들도록 반영
 *  재고수량이 amount만큼 줄어들도록 반영
 *  재고 수량이 0보다 작아질수 없도록 제한
 *  
 * buy(int amount) : void
 *  매장에 입고되어 재고수량이 
 *  amount 만큼 늘어나도록 반영
 * ----------------------------------------
 * 
 * 각 필드, 생성자, 메소드 선언할 때 설명을 문서 주석을 달 것
 *   
 */
public class Product {

	String pcode;
	String pname;
	int price;
	int quantity;

	// 기본 생성자
	public Product() {

	}

	// 매개변수 생성자
	public Product(String pcode) {
		this();
		this.pcode = pcode;

	}

	public Product(String pcode, String pname) {
		this(pcode);
		this.pname = pname;

	}

	public Product(String pcode, String pname, int price) {
		this(pcode, pname);
		this.price = price;

	}

	public Product(String pcode, String pname, int price, int quantity) {
		this(pcode, pname, price);
		this.quantity = quantity;

	}

	// toString() 메소드
	@Override
	public String toString() {
		return String.format("코드: %s, 이름 : %s, 가격 : %d, 수량 : %d", pcode, pname, price, quantity);
	}

	public void print() {
		System.out.println(this);
	}

	public void sell(int amount) {
		if (quantity - amount < 0) {
			System.out.println("X");
		} else {
			quantity -= amount;
		}
	}

	public void buy(int amount) {
		quantity += amount;
	}
	
	
	public int discount(double percentage) {
		double disc = (100 - percentage) / 100;
		price = price * (int)disc;
		return price;
	}

	
	
	
	

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
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
