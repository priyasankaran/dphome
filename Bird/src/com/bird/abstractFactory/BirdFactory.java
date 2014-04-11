package com.bird.abstractFactory;

import com.bird.concrete.Bird;
import com.bird.concrete.Crow;
import com.bird.concrete.Duck;
import com.bird.concrete.Hen;
import com.bird.concrete.Ostritch;
import com.bird.concrete.Parrot;
import com.bird.concrete.Penguin;

public abstract class BirdFactory {
	
	public static Bird getBird(String birdType){
		Bird birdObject = null;
		if(birdType.equalsIgnoreCase(BirdType.CROW.toString()))
			birdObject = new Crow();
		else if(birdType.equalsIgnoreCase(BirdType.DUCK.toString()))
			birdObject = new Duck();
		else if(birdType.equalsIgnoreCase(BirdType.HEN.toString()))
			birdObject = new Hen();
		else if(birdType.equalsIgnoreCase(BirdType.OSTRITCH.toString()))
			birdObject = new Ostritch();
		else if(birdType.equalsIgnoreCase(BirdType.PARROT.toString()))
			birdObject = new Parrot();
		else if(birdType.equalsIgnoreCase(BirdType.PENGUIN.toString()))
			birdObject = new Penguin();
		return birdObject;
	}

}
