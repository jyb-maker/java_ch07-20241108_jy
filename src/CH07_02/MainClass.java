package CH07_02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		KumhoTire kumhoTire = new KumhoTire();
		HnakookTire hnakookTire = new HnakookTire(); 
		
		car.tire1 = kumhoTire;
		car.tire2 = kumhoTire;
		car.tire3 = hnakookTire;
		car.tire4 = hnakookTire; //필드의 다형성
		
		Driver1 driver1 = new Driver1();
		Driver2 driver2 = new Driver2();
		
		car.drive(driver1);  // 매개변수의 다형성
		car.drive(driver2);  // 매개변수의 다형성
		
	}

}
