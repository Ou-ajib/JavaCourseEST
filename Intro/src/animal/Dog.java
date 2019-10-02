package animal;

public class Dog extends Animal{
	private String sound = "Haw Haw";

	public Dog() {
		super();
		
	}
	public Dog(int age, String nom, double speed) {
		super(age, nom);
		super.setSpeed(speed);
	}

	public String parle() {
		return this.sound;
	}

}
