package com.greenspacevoidcore.client;

import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.greenspacevoidcore.client.menus.login.LoginMenu;

import javax.swing.*;

public class GameWrapper {

    public static GameWrapper gameWrapper;

    private boolean isLoggedIn = false;
    private LoginMenu loginMenu;
    private Desktop desktop;


    public GameWrapper(){
        logout();
    }



    public void logout(){
        this.loginMenu = LoginMenu.createLoginMenu();

        System.out.println("test");
    }


    public void enterLoggedInMode(){
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                gameWrapper.desktop = new Desktop(config);
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


    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }
}
