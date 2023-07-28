package structural.proxy;

public class ScreenDisplay implements Display {

	@Override
	public void print(String content) {
		// content를 화면에 출력하기 위해 준비작업이 오래 걸린다고 가정.
		try {
			Thread.sleep(500);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(content);
	}

}
