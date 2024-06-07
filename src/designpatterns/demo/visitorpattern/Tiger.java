package designpatterns.demo.visitorpattern;

public class Tiger implements Animal {
	
	private String food;
	
	private String sound;
	
	public Tiger(String food, String sound) {
		this.food = food;
		this.sound = sound;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	@Override
	public String accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
