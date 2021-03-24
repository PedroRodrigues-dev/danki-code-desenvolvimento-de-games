package com.chrono_technology.main;

import java.applet.Applet;
import java.applet.AudioClip;

public class Sound {

	private AudioClip clip;

	public static Sound musicBackGround = new Sound("/music.wav");
	public static Sound hurtEffect = new Sound("/hurt.wav");
	public static Sound musicMenu = new Sound("/menu.wav");
	public static Sound deathEffect = new Sound("/death.wav");
	public static Sound arrowEffect = new Sound("/arrow.wav");
	public static Sound selectEffect = new Sound("/select.wav");
	public static Sound pauseEffect = new Sound("/pause.wav");
	public static Sound saveEffect = new Sound("/save.wav");
	public static Sound cursorEffect = new Sound("/cursor.wav");
	public static Sound enemyHit = new Sound("/enemy_hit.wav");
	public static Sound enemyDie = new Sound("/enemy_die.wav");
	public static Sound jumpEffect = new Sound("/jump.wav");
	public static Sound getItem = new Sound("/get_item.wav");
	public static Sound getHeart = new Sound("/get_heart.wav");

	private Sound(String name) {
		try {
			clip = Applet.newAudioClip(Sound.class.getResource(name));
		} catch (Throwable e) {

		}
	}

	public void play() {
		try {
			new Thread() {
				public void run() {
					clip.play();
				}
			}.start();
		} catch (Throwable e) {

		}

	}

	public void loop() {
		try {
			new Thread() {
				public void run() {
					clip.loop();
				}
			}.start();
		} catch (Throwable e) {

		}

	}

	public void stop() {
		try {
			new Thread() {
				public void run() {
					clip.stop();
				}
			}.start();
		} catch (Throwable e) {

		}
	}
}
