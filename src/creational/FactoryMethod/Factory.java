package creational.FactoryMethod;

public abstract class Factory {
	public Item create(String name) {
		boolean creatable = this.isCreatable(name);
		if(creatable) {
			Item item = this.createItem(name);
			this.postprocessItem(name);
			return item;
		}
		
		return null;
	}
	
	protected abstract boolean isCreatable(String name);
	protected abstract Item createItem(String name);
	protected abstract void postprocessItem(String name);
}
