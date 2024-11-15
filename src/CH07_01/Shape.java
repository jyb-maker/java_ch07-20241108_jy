package CH07_01;

public class Shape { // *비교: public final class Shape - 상속불가 (자식 클래스 없음)
	//필드
	int width;
	int height;
	String color;
		
	//생성자
	public Shape() {
		super();
	}

	public Shape(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	//메소드
	void area() {
		System.out.println(width*height);
	}
	
	final void color() { //오버라이딩 불가 메소드 선언 
		System.out.println(color);
	}
	
}
