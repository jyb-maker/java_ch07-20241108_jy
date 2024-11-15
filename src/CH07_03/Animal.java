package CH07_03;

public abstract class Animal {
	public String Kind; // 동물 종류
	
	public Animal() {
		super();
	}
	
	public Animal(String kind) {
		super();
		Kind = kind;
	}

	public void breath(  ) {
		System.out.println("숨을 쉽니다.");
	}
	public abstract String sound();  //추상메소드 
	
}

// 추상 클래스인 Animal을 상속 받는 Cat 클래스와 Dog 클래스를 만드시오.
// 단, 부모 클래스의 kind를 초기화하는 생성자를 클래스 내에 생성하시오. 
