package com.chrono_technology.entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.chrono_technology.main.Game;
import com.chrono_technology.world.Camera;

public class BulletShoot extends Entity{

	private double dx;
	private double dy;
	private double spd = 4;
	
	private int life = 30, curLife = 0;
	
	public BulletShoot(int x, int y, int width, int height, BufferedImage sprite, double dx, double dy) {
		super(x, y, width, height, sprite);
		this.dx = dx;
		this.dy = dy;
		// TODO Auto-generated constructor stub
	}
	
	public void tick() {
		x+=dx*spd;
		y+=dy*spd;
		curLife++;
		if(curLife == life){
			Game.bullets.remove(this);
			return;
		}
	}
	
	public void render(Graphics g) {
		g.setColor(new Color(0xFF964B00));
		g.fillRect(this.getX() - Camera.x, this.getY() - Camera.y, width, height);
	}
}
