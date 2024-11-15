package CH08_01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television();
		Audio audio = new Audio();
		tv.setVolume(70);
		audio.turnOn();
		
		RemoteControl rControl;  // 인터페이스는 new 생성 못하고, 선언만 가능(메모리에 인스턴스 생성되지 X)
		
		rControl =tv;
		
		RemoteControl rc1 = new Television();
		RemoteControl rc2 = new Audio();
		
	}

}
