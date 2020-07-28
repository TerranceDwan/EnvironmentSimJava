package Animals;

public abstract class Animal {
	
	public int[] position;
	public String gender;
	public float speed;
	public float horniness;
	public float hunger;
	public float thirst;
	public float age;
	public float longevity;
	
	abstract void move();
	abstract void sprint();
	abstract void eat();
	abstract void mate();
	abstract void reproduce();
	
	
}
