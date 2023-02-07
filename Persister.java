package OOP_Lesson6_Solid;

public abstract class Persister {
	protected String name;
    
	public Persister(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Persister [user=" + name + "]";
	}

	public String getName() {
		return name;
	}

}
