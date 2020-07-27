package Application;

import Animals.Fox;
import Animals.Rabbit;

public class Application {
	
	public static void main(String[] args) {

		Rabbit []rabbits = new Rabbit[12];
		Fox []foxes = new Fox[5];
		
		for(int i = 0; i < foxes.length; i++) {
			foxes[i] = new Fox();
		}
		for(int i = 0; i < rabbits.length; i++) {
			rabbits[i] = new Rabbit();
			System.out.println(rabbits[i].position[0]);
		}
	}
}
