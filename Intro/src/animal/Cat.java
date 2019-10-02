package animal;

public class Cat extends Animal {
	private String sound;

	public Cat() {
		super();
		this.sound = "Meow";
	}
	
	public Cat(int id, int age, int poid, double speed, String name, String sound) {
		super(id, name, speed, poid, age);
		this.sound = "Meow";
	}
	
	public String parle() {
		return this.sound;
	}

}
