package Animals;

import java.util.Arrays;
import java.util.Random;

public class Rabbit extends Animal {
	
	public Rabbit(){
		Random random = new Random();
		this.position = new int[2];
		this.position[0] = random.nextInt(100);
		this.position[1] = random.nextInt(100);
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
	public void reproduce() {
		
	}
	public void sprint() {
		
	}
	public void move() {
		Random random = new Random();
		if(random.nextBoolean()) {
			if(this.position[0] <= 0) {
				this.position[0]++;
			}
			else if(this.position[0] >= 100) {
				this.position[0]--;
			}
			else {
				if(random.nextBoolean()) {
					this.position[0]++;
				}
				else {
					this.position[0]--;
				}
			}
		}
		else {
			if(this.position[1] <= 0) {
				this.position[1]++;
			}
			else if(this.position[1] >= 100) {
				this.position[1]--;
			}
			else {
				if(random.nextBoolean()) {
					this.position[1]++;
				}
				else {
					this.position[1]--;
				}
			}
		}
		this.hunger--;
		System.out.println(Arrays.toString(this.position));
	}
	public void mate() {

	}
	public void eat() {
		this.hunger = 0;
	}

}
