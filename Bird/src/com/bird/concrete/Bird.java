/**
 * 
 */
package com.bird.concrete;

import java.util.Map;


import com.bird.actions.Action;
import com.bird.actions.ActionType;

/**
 * @author priya
 *
 */
public interface  Bird {	
	public abstract Map<ActionType,Action> getActions(Bird bird);
}
