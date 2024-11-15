package CH07_01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","블랙",10);
		//생성자를 통해서 부모객체에서 물려 받은 필드 2개까지 한번에 초기화 시킬 구 있다. this.model = model; this.color = color; 
		System.out.println(dmbCellPhone.color);
		
		Square square = new Square(10,20);
		square.area();
		
		Triangle triangle = new Triangle(10,20);
		triangle.area();
		
		final int a=10;  // final: 최종 마지막 값(변경 불가)
//		a=20;
		
		int b; // 4byte
		byte c=10; // 1byte
		
		b=c;  // 대입가능
	 // c=b; // 대입불가능
		
		
	}

}
