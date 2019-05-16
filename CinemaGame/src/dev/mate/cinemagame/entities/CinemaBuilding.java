package dev.mate.cinemagame.entities;

import java.awt.Graphics;

import dev.mate.cinemagame.Handler;
import dev.mate.cinemagame.gfx.Assets;
import dev.mate.cinemagame.map.Map;

public class CinemaBuilding extends StaticObjects {

	public CinemaBuilding(Handler handler, float x, float y) {
		super(handler, x, y, Map.TILEWIDTH*4, Map.TILEHEIGHT*2);
		bound.x = 0;
		bound.y = 50;
		bound.width = 492;		
		bound.height = 246 - bound.y;
		
		actionArea.x = 0;
		actionArea.y = Map.TILEHEIGHT*2;
		actionArea.width = Map.TILEWIDTH*4;
		actionArea.height = 100;
	}

	@Override
	public void tick() {

		
	}
	
	public void action() {
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.cinema, (int) (x - handler.getCamera().getxOffset()), (int) (y - handler.getCamera().getyOffset()), width, height, null);

		g.fillRect((int) (x+actionArea.x - handler.getCamera().getxOffset()),
		(int) (y + actionArea.y - handler.getCamera().getyOffset()),
		actionArea.width, actionArea.height);		
		
	}

}
