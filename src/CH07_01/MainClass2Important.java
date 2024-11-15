package CH07_01;

public class MainClass2Important {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape shape = new Shape();  // Shape: 부모 클래스
		Square square = new Square();  // Square: 자식 클래스
		Triangle triangle  = new Triangle(10,20); // Triangle: 자식 클래스
		
		shape = square; // 대입성공
	  //square = shape; // 대입불가
		
		Shape shape2 = triangle; // 자동 타입 변환 자식객체 - > 부모객체
		shape2.area(); // triangle(자식클래스): 100.0 이 반환 
		
//		triangle = square;
		
	}

}
