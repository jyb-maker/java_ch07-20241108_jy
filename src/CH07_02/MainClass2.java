package CH07_02;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Driver driver = new Driver(); //부모클래스
		Driver1 driver1 = new Driver1(); // 자식 클래스
		
		driver = driver1; // 부모는 자식의 모든 것을 받아 준다!! 
		driver1 = (Driver1) driver; // 강제 변환
		
	}

}
