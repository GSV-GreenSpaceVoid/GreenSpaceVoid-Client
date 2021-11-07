package com.greenspacevoiddesktop.client.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.greenspacevoidclientcore.client.renderer.Desktop;
import com.greenspacevoidclientcore.client.renderer.renderableEntity.RenderedEntity;
import com.greenspacevoidclientcore.client.login.LoginMenu;
import javax.swing.*;


public class DesktopLauncher {
	//Previous Version 1.0.0
	public static final String version = "1.0.0 ALPHA";//Todo: Always be sure to change this before you distribute.




	public static void main (String[] arg) {

		//TargetingMenu.createTargetingMenu();
		System.out.println(RenderedEntity.T.SKOOGUS);
		//TargetingMenu menu = new TargetingMenu();
		LoginMenu.createLoginPane();
		//UserInterface.generateUIComponents();
		//MarketMenu.createMarketMenu();

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();





		//new LwjglApplication(new GSVClient(), config);


		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Desktop desktop = new Desktop(config);
				//desktop.pack();
				desktop.setVisible(true);
			}
		});






		try{
			Thread.sleep(2000);
			System.out.println("Adding badlogic");
			//GSVRenderer.renderedEntities.add(new Ships.Military.Edomite.TestFighter(1,0,0,0,null));
			Thread.sleep(4000);
			//System.out.println("Deleting badlogic");
			//GSVClient.renderedEntities.remove(0);
		}catch(Exception ignored){

		}







	}
}
