package Application;

import java.util.Arrays;

import Animals.Fox;
import Animals.Rabbit;

public class Application {
	
	public static void main(String[] args) {

		Rabbit []rabbits = new Rabbit[12];
		
		for(int i = 0; i < rabbits.length; i++) {
			rabbits[i] = new Rabbit();
		}
		int i = 0;
		while(i < 15) {
			for(int j = 0; j < rabbits.length; j++) {
				rabbits[j].move();
			}
			i++;
		}
		
		
	}
}
