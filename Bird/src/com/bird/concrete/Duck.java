package com.bird.concrete;

import java.util.HashMap;
import java.util.Map;

import com.bird.actions.Action;
import com.bird.actions.ActionType;
import com.bird.actions.FlyA;
import com.bird.actions.Swim;
import com.bird.actions.Walk;

public class Duck implements Bird{
	
	public Duck(){}

	@Override
	public Map<ActionType,Action> getActions(Bird bird) {
		Map<ActionType,Action> mapActions = new HashMap<ActionType,Action>();
		mapActions.put(ActionType.FLYA,new FlyA());
		mapActions.put(ActionType.WALK,new Walk());
		mapActions.put(ActionType.SWIM,new Swim());
		return mapActions;
	}

}
