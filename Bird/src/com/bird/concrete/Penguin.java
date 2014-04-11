package com.bird.concrete;

import java.util.HashMap;
import java.util.Map;

import com.bird.actions.Action;
import com.bird.actions.ActionType;
import com.bird.actions.Slide;
import com.bird.actions.Swim;
import com.bird.actions.Walk;

public class Penguin implements Bird{
	
	public Penguin(){
		System.out.println("Penguin Constructor");
	}

	@Override
	public Map<ActionType,Action> getActions(Bird bird) {
		Map<ActionType,Action> mapActions = new HashMap<ActionType,Action>();
		mapActions.put(ActionType.SLIDE,new Slide());
		mapActions.put(ActionType.WALK,new Walk());
		mapActions.put(ActionType.SWIM,new Swim());
		return mapActions;
	}

}
