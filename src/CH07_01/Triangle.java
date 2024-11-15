package CH07_01;

public class Triangle extends Shape{

	String name;
	int point;
	
	public Triangle() {
		super();
	}

	public Triangle(int width, int height) {
		super(width,height);
	}

	@Override  // annotation(어노테이션): 명시하다 
	void area() {
		// TODO Auto-generated method stub		
		System.out.println(width*height*0.5); // 100.0
		super.area(); // 200: 부모 area 메소드 호출
	}
	
	
}
