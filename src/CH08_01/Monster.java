package CH08_01;

public interface Monster {//인터페이스 -> 인스턴스(객체)로 만들 수 없음!
	//필드 X
	//상수
	int health=300; // 초기 값이 없는 필드 선언은 에러->상수만 선언 가능
	//생성자 X 
	
	//메소드 : 인터페이스는 "추상메소드" 만 선언 가능!!!
	public void run(); // 추상메소드
	public void walk(); // 추상메소드
	public void attack(); // 추상메소드
	public void fly(); // 추상메소드
//	{
//		System.out.println("뛰다");
//	}
	
	
}

//인터페이스의 특징
//1.인스턴스(객체) 생성 불가능 (new 연산자 사용 X) -> 상속전용 클래스
//2.상수만 선언 가능
//3.추상메소드만 선언가능
//4.implements로 구현