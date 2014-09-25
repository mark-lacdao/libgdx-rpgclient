package org.nerv.libgdxrpgclient.java;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import org.nerv.libgdxrpgclient.core.RPGClient;

public class RPGClientDesktop {
	public static void main (String[] args) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new RPGClient(), config);
	}
}
