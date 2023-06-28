package creational.abstractFactory;

// 이 클래스는 오직 3개의 추상 메서드만을 포함하고 있으므로 인터페이스로 정의해도 된다.
public abstract class ComponentFactory {
	// 인자를 보면 각 컴포넌트의 생성자의 인자와 동일하다는 걸 알 수 있다.
	public abstract Button createButton(String caption);
	public abstract CheckBox createCheckBox(boolean bChecked);
	public abstract TextEdit createTextEdit(String value);
}
