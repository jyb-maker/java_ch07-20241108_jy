package CH07_03;

public abstract class Phone {  // 추상클래스: abstract
	//필드
	String owner;

	//생성자
	public Phone() {
		super();
	}
	
	public Phone(String owner) {
		super();
		this.owner = owner;
	}	
	
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
	//추상메소드
	public abstract void powerType(); // 추상메소드: 추상클래쓰에서만 사용할 수 있다.  
	// 1) 추상메소드는 추상클래스 내에서만 선언 가능하다.
	// 2) 추상메소드는 메소드의 내용이 없다-> {} 없다.
	
	
	
//	{
//		System.out.println("전원 타입은 C type입니다.");
//	}
	
}
