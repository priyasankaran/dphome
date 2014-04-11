package com.bird.concrete;

import java.util.HashMap;
import java.util.Map;

import com.bird.actions.Action;
import com.bird.actions.ActionType;
import com.bird.actions.Run;
import com.bird.actions.Walk;

public class Ostritch implements Bird{
	
	public Ostritch(){
		System.out.println("Ostritch constructor");
	}

	@Override
	public Map<ActionType,Action> getActions(Bird bird) {
		Map<ActionType,Action> mapActions = new HashMap<ActionType,Action>();
		mapActions.put(ActionType.RUN,new Run());
		mapActions.put(ActionType.WALK,new Walk());
		return mapActions;
	}

}
