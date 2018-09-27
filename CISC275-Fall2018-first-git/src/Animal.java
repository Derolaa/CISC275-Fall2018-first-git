
abstract class Animal implements Comparable<Animal> {
	String name;
	int legs = 0;
	
	public Animal(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}
	
	public int getLegs() {
		return legs;
	}
	
	public String getName() {
		return name;
	}

}
