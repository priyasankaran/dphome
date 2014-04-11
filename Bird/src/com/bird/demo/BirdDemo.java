package com.bird.demo;

import java.util.Map;

import com.bird.abstractFactory.BirdFactory;
import com.bird.actions.Action;
import com.bird.actions.ActionType;
import com.bird.concrete.Bird;

/**
 * 
 */

/**
 * @author priya
 *
 */
public class BirdDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bird bird = BirdFactory.getBird("PENGUIN");
		Map<ActionType,Action> birdActions = bird.getActions(bird);
		System.out.println(birdActions.keySet());
	}

}
