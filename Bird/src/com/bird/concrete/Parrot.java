package com.bird.concrete;

import java.util.HashMap;
import java.util.Map;

import com.bird.actions.Action;
import com.bird.actions.ActionType;
import com.bird.actions.Fly;
import com.bird.actions.Walk;

public class Parrot implements Bird{
	
	public Parrot(){
		System.out.println("Parrot Constructor");
	}

	@Override
	public Map<ActionType,Action> getActions(Bird bird) {
		Map<ActionType,Action> mapActions = new HashMap<ActionType,Action>();
		mapActions.put(ActionType.FLY,new Fly());
		mapActions.put(ActionType.WALK,new Walk());
		return mapActions;
	}

}
