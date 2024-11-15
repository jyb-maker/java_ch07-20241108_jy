package CH08_01;

// interface는 extends로 상속 받는 것이 X (확장이 X), implements로 구현 O
public class Spider implements Monster{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("거미 뜀");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("거미 걸음");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("거미 독 공격");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("날지 못함");
	}

}
