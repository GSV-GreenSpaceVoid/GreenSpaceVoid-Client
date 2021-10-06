package com.greenspacevoid.client.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.greenspacevoid.client.renderer.renderableEntity.vessel.Ships;
import com.greenspacevoid.client.ui.menus.login.LoginMenu;
import com.greenspacevoid.client.renderer.GSVClient;



public class DesktopLauncher {
	//Previous Version 1.0.0
	public static final String version = "1.0.0 ALPHA";//Todo: Always be sure to change this before you distribute.




	public static void main (String[] arg) {

		//TargetingMenu.createTargetingMenu();

		//TargetingMenu menu = new TargetingMenu();
		LoginMenu.createLoginPane();
		//UserInterface.generateUIComponents();
		//MarketMenu.createMarketMenu();

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new GSVClient(), config);

		try{
			Thread.sleep(2000);
			System.out.println("Adding badlogic");
			GSVClient.renderedEntities.add(new Ships.Military.Edomite.TestFighter(1,-1920,-1920,0,null));
			Thread.sleep(4000);
			//System.out.println("Deleting badlogic");
			//GSVClient.renderedEntities.remove(0);
		}catch(Exception ignored){

		}







	}
}
