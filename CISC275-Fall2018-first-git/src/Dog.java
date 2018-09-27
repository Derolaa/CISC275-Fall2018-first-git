
public class Dog extends Animal {
	public String name;
	public int legs;
	
	public Dog(String name, int legs) {
		super(name, legs);
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Animal arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
