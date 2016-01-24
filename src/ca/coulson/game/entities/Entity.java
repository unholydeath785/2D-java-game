package ca.coulson.game.entities;

import ca.coulson.game.gfx.Screen;
import ca.coulson.game.level.Level;

public abstract class Entity {
	public int x;
	public int y;
	
	protected Level level;
	
	public Entity(Level level) {
		init(level);
	}
	
	public final void init(Level level) {
		this.level = level;
	}
	
	public abstract void tick();
	
	public abstract void render(Screen screen);
}
