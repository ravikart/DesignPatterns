package designpatterns.demo.visitorpattern;

public class Lion implements Animal{
	
	private String sound;
	
	private String food;
	
	public Lion(String food,String sound) {
		this.food = food;
		this.sound = sound;
	}

	@Override
	public String accept(Visitor visitor) {
		return visitor.visit(this);
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

}
