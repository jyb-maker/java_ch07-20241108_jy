package CH07_03;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Phone phone = new Phone("홍길동");  추상클래스는 인스턴스(객체)로 만들수 없다.
		
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.turnOn();
		smartPhone.internetSearch();
		
		
	}

}
