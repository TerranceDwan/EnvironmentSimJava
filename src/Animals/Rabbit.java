package Animals;

import java.util.Random;

public class Rabbit extends Animal {
	
	public Rabbit(){
		Random random = new Random();
		this.age = 0;
		this.longevity = 75;
		this.hunger = 100;
		this.thirst = 100;
		//Set Gender
			Boolean masculineGenes = random.nextBoolean();
			if(masculineGenes) {
				this.gender = "Male";
			} else {
				this.gender = "Female";
			}
				
		//Set Speed
			if(random.nextBoolean()) {
				this.speed = 5 + random.nextFloat() * 3;
			} else {
				this.speed = 5 - random.nextFloat() * 3;
			}
				
		//Set Horniness
			if(random.nextBoolean()) {
				this.horniness = 5 + random.nextFloat() * 3;
			} else {
				this.horniness = 5 - random.nextFloat() * 3;
			}		
		
	}
	Rabbit(Rabbit male, Rabbit female){
		Random random = new Random();
		
		//Set Age
		this.age = 0;
		
		//Set Longevity
		if(random.nextBoolean()) {
			this.longevity = male.longevity + female.longevity / 5 + random.nextFloat() * 2;
		} else {
			this.longevity = male.longevity + female.longevity / 5 - random.nextFloat() * 2;
		}
		
		//Set Position
		this.position = female.position;
		
		//Set Hunger
		this.hunger = 100;
		
		//Set Thirst
		this.thirst = 100;
		
		//Set Gender
		Boolean masculineGenes = random.nextBoolean();
		if(masculineGenes) {
			this.gender = "Male";
		} else {
			this.gender = "Female";
		}
		
		//Set Speed
		if(random.nextBoolean()) {
			this.speed = male.speed + female.speed / 2 + random.nextFloat() * 2;
		} else {
			this.speed = male.speed + female.speed / 2 - random.nextFloat() * 2;
		}
		
		//Set Horniness
		if(random.nextBoolean()) {
			this.horniness = male.horniness + female.horniness / 2 + random.nextFloat() * 2;
		} else {
			this.horniness = male.horniness + female.horniness / 2 - random.nextFloat() * 2;
		}
		
	}
	void reproduce() {
		
	}
	void move() {
		
	}
	void mate() {

	}
	void eat() {
		
	}
}
