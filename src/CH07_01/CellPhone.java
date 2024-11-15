package CH07_01;

public class CellPhone { // 부모 클래스 (super class)
	// 필드
	String model;
	String color;
	
	//생성자
	public CellPhone() {
		super();
	}	
		
	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	// 메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");		
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");		
	}
	void bell() {
		System.out.println("벨이 울립니다.");		
	}
	void hangOn() {
		System.out.println("전화를 겁니다.");		
	}
	void hangOff() {
		System.out.println("전화를 끊습니다.");		
	}
	
	
}
