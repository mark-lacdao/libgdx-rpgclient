package org.nerv.libgdxrpgclient.html;

import org.nerv.libgdxrpgclient.core.RPGClient;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class RPGClientHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new RPGClient();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
