package product;

import point.Point;

public class ProductTest {

	public static void main(String[] args) {
		
		// 1. 선언 : 제품을 사용하기 위한 객체 참조 변수
				Product mouse; // alt + shift + R
				Product airFrier = new Product(); 
				// 2. 초기화
				mouse = new Product("P001", "MS-아크 터치 마우스", 51330, 36);
				// Product의 각 필드가 default일 때 가능
				//airFrier = new Product();
				//airFrier.pcode = "P002";
				//airFrier.pname = "[필립스] 에어프라이어 HD-9743";
				//airFrier.price = 329000;
				//airFrier.quantity = 5;
				
				// Product의 각 필드가 private일 때 수정자에 의해서만 가능
				airFrier.setPcode("P002");
				airFrier.setPname("[필립스] 에어프라이어 HD-9743");
				airFrier.setPrice(329000);
				airFrier.setQuantity(5);
				
				System.out.println(airFrier.getPrice());
							
				// 3. 사용
				// (1) 제품 상태 출력
				mouse.print();
				// (2) 20% 할인가는 어떻게 되나?
				int dcPrice = mouse.discount(0.2);
				System.out.printf("제품 가격 : %d,  20%% 할인가 : %d%n"
						         , 51330, dcPrice);
				
				// (3) 2개 판매(sell)
				mouse.sell(2);
				
				// (4) 상태 출력
				mouse.print();
				
				// (5) 10개 입고(buy)
				mouse.buy(10);
				
				// (6) 상태 출력
				mouse.print();
				
				System.out.println("==============================");
				System.out.println(mouse);
				System.out.println("==============================");		
				
				Point point = new Point(); // ctrl + shift + o import
				point.x = 0;
				point.setY(-10);
				


	}

}
