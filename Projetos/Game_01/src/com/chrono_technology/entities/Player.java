package com.chrono_technology.entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import com.chrono_technology.main.Game;
import com.chrono_technology.main.Sound;
import com.chrono_technology.world.Camera;
import com.chrono_technology.world.World;

public class Player extends Entity {

	public boolean right, up, left, down;
	public int right_dir = 0, left_dir = 1, up_dir = 2, down_dir = 3;
	public int dir = right_dir;
	public double speed = 1.4;

	private int frames = 0, maxFrames = 5, index = 0, maxIndex = 3;
	private boolean moved = false;
	private BufferedImage[] rightPlayer;
	private BufferedImage[] leftPlayer;
	private BufferedImage[] upPlayer;
	private BufferedImage[] downPlayer;

	private BufferedImage playerDamage;

	private boolean arma = false;

	public int ammo = 0;

	public boolean isDamaged = false;
	private int damageFrames = 0;

	public boolean shoot = false, mouseShoot = false;

	public double life = 100, maxLife = 100;
	public int mx, my;

	public boolean jump = false;

	public boolean isJumping = false;

	public static int z = 0;

	public int jumpFrames = 50, jumpCur = 0;

	public boolean jumpUp = false, jumpDown = false;

	public double jumpSpd = 2;

	public Player(int x, int y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, sprite);

		rightPlayer = new BufferedImage[4];
		leftPlayer = new BufferedImage[4];
		upPlayer = new BufferedImage[4];
		downPlayer = new BufferedImage[4];
		playerDamage = Game.spritesheet.getSprite(0, 16, 16, 16);
		for (int i = 0; i < 4; i++) {
			rightPlayer[i] = Game.spritesheet.getSprite(32 + (i * 16), 0, 16, 16);
		}
		for (int i = 0; i < 4; i++) {
			leftPlayer[i] = Game.spritesheet.getSprite(32 + (i * 16), 16, 16, 16);
		}
		for (int i = 0; i < 4; i++) {
			upPlayer[i] = Game.spritesheet.getSprite(32 + (i * 16), 32, 16, 16);
		}
		for (int i = 0; i < 4; i++) {
			downPlayer[i] = Game.spritesheet.getSprite(32 + (i * 16), 48, 16, 16);
		}
	}

	public void tick() {

		if (jump) {
			if (isJumping == false) {
				Sound.jumpEffect.play();
				jump = false;
				isJumping = true;
				jumpUp = true;
			}
		}

		if (isJumping) {
			if (jumpUp) {
				jumpCur += jumpSpd;
			} else if (jumpDown) {
				jumpCur -= jumpSpd;
				if (jumpCur <= 0) {
					isJumping = false;
					jumpDown = false;
					jumpUp = false;
				}
			}
			z = jumpCur;
			if (jumpCur >= jumpFrames) {
				jumpUp = false;
				jumpDown = true;
				// System.out.println("Chegou a altura máxima!");
			}
		}

		moved = false;
		if (right && World.isFree((int) (x + speed), this.getY())) {
			moved = true;
			dir = right_dir;
			x += speed;
		} else if (left && World.isFree((int) (x - speed), this.getY())) {
			moved = true;
			dir = left_dir;
			x -= speed;
		}
		if (up && World.isFree(this.getX(), (int) (y - speed))) {
			moved = true;
			dir = up_dir;
			y -= speed;
		} else if (down && World.isFree(this.getX(), (int) (y + speed))) {
			moved = true;
			dir = down_dir;
			y += speed;
		}

		if (moved) {
			frames++;
			if (frames == maxFrames) {
				frames = 0;
				index++;
				if (index > maxIndex)
					index = 0;
			}
		}
		checkCollisionLifePack();
		checkCollisionAmmo();
		checkCollisionGun();

		if (isDamaged) {
			this.damageFrames++;
			if (this.damageFrames == 8) {
				this.damageFrames = 0;
				isDamaged = false;
			}
		}

		if (shoot) {
			shoot = false;
			if (arma && ammo > 0) {
				ammo--;
				int dx = 0;
				int dy = 0;
				int px = 0;
				int py = 0;
				if (dir == right_dir) {
					px = 4;
					py = 10;
					dx = 1;
				} else if (dir == left_dir) {
					px = 6;
					py = 10;
					dx = -1;
				} else if (dir == up_dir) {
					px = 3;
					py = -2;
					dy = -1;
				} else if (dir == down_dir) {
					px = 11;
					py = 8;
					dy = 1;
				}

				if (dir == right_dir || dir == left_dir) {
					BulletShoot bullet = new BulletShoot(this.getX() + px, this.getY() + py, 6, 1, null, dx, dy);
					Game.bullets.add(bullet);
				}
				if (dir == up_dir || dir == down_dir) {
					BulletShoot bullet = new BulletShoot(this.getX() + px, this.getY() + py, 1, 6, null, dx, dy);
					Game.bullets.add(bullet);
				}
			}
		}

		if (mouseShoot) {
			mouseShoot = false;
			double angle = Math.atan2(my - (this.getY() + 8 - Camera.y), mx - (this.getX() + 8 - Camera.x));
			if (arma && ammo > 0) {
				ammo--;
				double dx = Math.cos(angle);
				double dy = Math.sin(angle);
				int px = 0;
				int py = 0;

				if (dir == right_dir) {
					px = 4;
					py = 10;
					dx = 1;
				} else if (dir == left_dir) {
					px = 6;
					py = 10;
					dx = -1;
				} else if (dir == up_dir) {
					px = 3;
					py = -2;
					dy = -1;
				} else if (dir == down_dir) {
					px = 11;
					py = 8;
					dy = 1;
				}

				if (dir == right_dir || dir == left_dir) {
					BulletShoot bullet = new BulletShoot(this.getX() + px, this.getY() + py, 6, 1, null, dx, dy);
					Game.bullets.add(bullet);
				}
				if (dir == up_dir || dir == down_dir) {
					BulletShoot bullet = new BulletShoot(this.getX() + px, this.getY() + py, 1, 6, null, dx, dy);
					Game.bullets.add(bullet);
				}
			}
		}

		if (life <= 0) {
			// Game Over!!
			Sound.musicBackGround.stop();
			Sound.deathEffect.play();
			life = 0;
			Game.gameState = "GAME_OVER";
			Game.musicBackGround = true;
		}

		updateCamera();
	}

	public void updateCamera() {
		Camera.x = Camera.clamp(this.getX() - (Game.WIDTH / 2), 0, World.WIDTH * 16 - Game.WIDTH);
		Camera.y = Camera.clamp(this.getY() - (Game.HEIGHT / 2), 0, World.HEIGHT * 16 - Game.HEIGHT);
	}

	public void checkCollisionGun() {
		for (int i = 0; i < Game.entities.size(); i++) {
			Entity atual = Game.entities.get(i);
			if (atual instanceof Weapon) {
				if (Entity.isColidding(this, atual)) {
					Sound.getItem.play();
					arma = true;
					// System.out.println("Pegou a arma");
					Game.entities.remove(atual);
				}
			}
		}
	}

	public void checkCollisionAmmo() {
		for (int i = 0; i < Game.entities.size(); i++) {
			Entity atual = Game.entities.get(i);
			if (atual instanceof Bullet) {
				if (Entity.isColidding(this, atual)) {
					Sound.getItem.play();
					ammo += 1000;
					// System.out.println("Munição atual: " + ammo);
					Game.entities.remove(atual);
				}
			}
		}
	}

	public void checkCollisionLifePack() {
		for (int i = 0; i < Game.entities.size(); i++) {
			Entity atual = Game.entities.get(i);
			if (atual instanceof Lifepack) {
				if (Entity.isColidding(this, atual)) {
					Sound.getHeart.play();
					life += 10;
					if (life >= 100)
						life = 100;
					Game.entities.remove(atual);
				}
			}
		}
	}

	public void render(Graphics g) {
		if (!isDamaged) {
			if (dir == right_dir) {
				g.drawImage(rightPlayer[index], this.getX() - Camera.x, this.getY() - Camera.y - z, null);
				if (arma) {
					// Desenhar arma para a direita
					g.drawImage(Entity.GUN_RIGHT, this.getX() - Camera.x + 2, this.getY() - Camera.y + 3 - z, null);
				}
			} else if (dir == left_dir) {
				g.drawImage(leftPlayer[index], this.getX() - Camera.x, this.getY() - Camera.y - z, null);
				if (arma) {
					// Desenhar arma para a esquerda
					g.drawImage(Entity.GUN_LEFT, this.getX() - Camera.x - 2, this.getY() - Camera.y + 3 - z, null);
				}
			} else if (dir == up_dir) {
				g.drawImage(upPlayer[index], this.getX() - Camera.x, this.getY() - Camera.y - z, null);
				if (arma) {
					// Desenhar arma para cima
					g.drawImage(Entity.GUN_UP, this.getX() - Camera.x - 6, this.getY() - Camera.y + 4 - z, null);
				}
			} else if (dir == down_dir) {
				g.drawImage(downPlayer[index], this.getX() - Camera.x, this.getY() - Camera.y - z, null);
				if (arma) {
					// Desenhar arma para baixo
					g.drawImage(Entity.GUN_DOWN, this.getX() - Camera.x + 2, this.getY() - Camera.y + 3 - z, null);
				}
			}
		} else {
			g.drawImage(playerDamage, this.getX() - Camera.x, this.getY() - Camera.y - z, null);
		}
		if (isJumping) {
			g.setColor(Color.black);
			g.fillOval(this.getX() - Camera.x + 4, this.getY() - Camera.y + 12, 8, 8);
		}
	}

}
