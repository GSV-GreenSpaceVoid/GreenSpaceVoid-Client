package com.greenspacevoid.client.renderer;

import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.greenspacevoid.client.ui.menus.ui.main.ShipInfoPanel;
import com.greenspacevoid.client.ui.menus.ui.main.TargetingMenu;

import javax.swing.*;
import java.awt.*;

public class Desktop extends JFrame {
    private final JDesktopPane desktopPane = new JDesktopPane();

    public Desktop(LwjglApplicationConfiguration config){

<<<<<<< HEAD
        GSVRenderer.GameWindowFrame gameWindowFrame = new GSVRenderer.GameWindowFrame(config);
        //gameWindowFrame.pack();
        gameWindowFrame.setVisible(true);
        //gameWindowFrame.setBorder(null);
        desktopPane.add(TargetingMenu.createTargetingMenu().getFrame());
        desktopPane.add(ShipInfoPanel.generateShipInfoPanel().getFrame());
        desktopPane.add(gameWindowFrame);
        desktopPane.setBackground(new Color(0));
=======
        GSVClient.GameWindowFrame gameWindowFrame = new GSVClient.GameWindowFrame(config);
        //gameWindowFrame.pack();
        gameWindowFrame.setVisible(true);
        desktopPane.add(TargetingMenu.createTargetingMenu().getFrame());
        desktopPane.add(ShipInfoPanel.generateShipInfoPanel().getFrame());
        desktopPane.add(gameWindowFrame);
>>>>>>> 4ab25afaba7dd7f07d9b388bc61e42bb383d0d57
        gameWindowFrame.moveToBack();


        this.add(desktopPane);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());







    }















}
