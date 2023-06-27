package creational.singleton;

public class King {
	private King() {}
	
	// static 변수: 여러 인스턴스가 공유해서  사용할 수 있는 변수
	// 프로세스가 메모리에 로드되는 순간 정적변수 영역(데이터 영역)에 생성되는 변수
	// 인스턴스의 생성과 상관 없이 사용할 수 있는 변수이며, 여러번 생성되는 변수가 아닌 한번만 생성되는 변수
	private static King self = null;
	
	// synchronized: 멀티쓰레드 환경에서 동작하도록 동기화 해주는 key
	public synchronized static King getInstance() {
		if(self == null) {
			self = new King();
		}
		return self;
	}
	
	public void say() {
		System.out.println("I`m only one..");
	}
}