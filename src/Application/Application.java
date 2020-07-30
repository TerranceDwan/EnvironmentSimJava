package Application;

import Animals.Fox;
import Animals.Rabbit;

public class Application {
	
	public static void main(String[] args) {

		Rabbit []rabbits = new Rabbit[1];
		
		for(int i = 0; i < rabbits.length; i++) {
			rabbits[i] = new Rabbit();
		}
		while(rabbits[0].hunger > 0) {
			for(int j = 0; j < rabbits.length; j++) {
				rabbits[j].move();
			}
			System.out.println(rabbits[0].hunger);
		}

	}
}
