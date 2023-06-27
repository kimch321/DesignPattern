package creational.singleton;

public class MainEntity {

	public static void main(String[] args) {
		King king = King.getInstance();
		
		king.say();
		
		King king2 = King.getInstance();
		
		// 생성된 객체가 같은 객체임을 확인할 수 있다.
		if(king == king2) {
			System.out.println("same object.");
		} else {
			System.out.println("diffrent object.");
		}
	}

}
