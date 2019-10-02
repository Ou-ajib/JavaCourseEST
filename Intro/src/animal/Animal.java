package animal;

public abstract class Animal {
	public static int nbrAnimal;
	private int id;
	private String name;
	private double speed;
	private int poid;
	private int age;
	
	public Animal() {
		Animal.nbrAnimal++;
	}
	
	public Animal(int id, String name, double speed, int poid, int age) {
		Animal.nbrAnimal++;
//		this.id = id;
//		this.name = name;
//		this.speed = speed;
//		this.poid = poid;
//		this.age = age;
		this.setId(id);
		this.setName(name);
		this.setSpeed(speed);
		this.setPoid(poid);
		this.setAge(age);
	}
	public Animal(int age,String nom) {
		this.age = age;
		this.name = nom;
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getPoid() {
		return poid;
	}

	public void setPoid(int poid) {
		this.poid = poid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Animal :" +this.name + " Id : " +this.id + "Speed : " +this.speed + "Poids : " +this.poid + " Age : "+this.age ;
	}


	public abstract String parle();
	
}
