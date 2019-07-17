package snack;


/*
 *  Oreo 쿠키를 정의하는 클래스
 *  속성 :
 *  cream     : String : 바닐라, 초코, 크림
 *  radius    : double : 오레오 쿠키 1개의 반지름 길이
 *  thickness : double : 오레오 쿠키 1개의 두께
 *  -------------------------------
 *  생성자 : 기본생성자, 중복된 this, this()로 정의하는 생성자 4개
 *  -------------------------------
 *  오레오 쿠키의 상태 void print 
 *  
 *  changeCream(String cream) : void : 오레오 쿠키의 크림 변경
 *   : 매개 변수로 입력된 cream값으로 오레오 쿠키의 크림을 변경힘
 *   
 *   
 *  
 */
public class Oreo {
	
    String cream;
	double radius;
	double thickness;
	
	Oreo(){
		
	}
	
	public Oreo(String cream){
		this();
		this.cream = cream;
	}
	
	public Oreo(String cream, double radius){
		this(cream);
		this.radius= radius;
	}
	
	public Oreo(String cream, double radius, double thickness){
		this(cream,radius);
		this.thickness = thickness;
	}
	
	public void print() {
		System.out.printf("크림 종류: %s\n반지름: %.2f\n두께: %.2f\n\n",cream,radius,thickness);
		
	}
	
	public void changeCream (String cream) {
		this.cream = cream;
	}
	
	
	

}
