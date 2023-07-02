package creational.builder1;

import java.util.Random;

public class MainEntry {

	public static void main(String[] args) {	
		Car car1 = new Car("V7", true, "Black", true, false);
		
		// 생성자를 이용해 호출하는 방식과 달리 builder패턴으로 객체를 생성하면 객체의 스펙 하나하나를 모두 지정할 수 있습니다.
		// 뿐만 아니라 객체의 생성을 원하는 만큼 지연시킬 수 있습니다.
		Car car2 = new CarBuilder()
				.setAEB(false)
				.setAirbag(false)
				.setCameraSensor(true)
				.setColor("White")
				.setEngine("V9")
				.build();
		
		CarBuilder builder = new CarBuilder()
				.setAEB(false)
				// .setAirbag(false)
				.setCameraSensor(true)
				.setColor("White")
				.setEngine("V9");
				// .build();
		
		Random random = new Random();
		Car car3 = builder
				.setAirbag(random.nextInt(2) == 0) // 50%의 확률로 에어백 장착 결정
				.build();
		
			System.out.println(car1);
			System.out.println(car2);
			System.out.println(car3);
	}
}
