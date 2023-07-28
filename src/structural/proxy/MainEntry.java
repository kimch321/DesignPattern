package structural.proxy;

public class MainEntry {

	public static void main(String[] args) {
		// Display display = new ScreenDisplay();
		Display display = new BufferDisplay(5);

		display.print("안녕하세요");
		display.print("안녕하세요");
		display.print("안녕하세요");
		display.print("안녕하세요");
		display.print("안녕하세요");
		display.print("안녕하세요");
		display.print("안녕하세요");
		
		((BufferDisplay)display).flush();
	}

}
