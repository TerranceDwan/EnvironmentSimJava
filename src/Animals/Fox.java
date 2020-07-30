package Animals;

import java.util.Random;

public class Fox extends Animal {
	
	Random random = new Random();
	public Fox(){
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
				this.speed = 7 + random.nextFloat() * 2;
			} else {
				this.speed = 7 - random.nextFloat() * 2;
			}
				
		//Set Horniness
			if(random.nextBoolean()) {
				this.horniness = 5 + random.nextFloat() * 3;
			} else {
				this.horniness = 5 - random.nextFloat() * 3;
			}		
		
	}
	
	Fox(Fox male, Fox female){
		
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
	void sprint() {
		
	}
	void move() {
		
	}
	void mate() {
		
	}
	void eat() {
		
	}

}
