package com.greenspacevoidUI;

import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.greenspacevoidUI.menus.main.ShipInfoPanel;
import com.greenspacevoidUI.menus.main.TargetingMenu;
import com.greenspacevoidclientcore.client.renderer.GSVRenderer;

import javax.swing.*;
import java.awt.*;

public class Desktop extends JFrame {
    private final JDesktopPane desktopPane = new JDesktopPane();

    public Desktop(LwjglApplicationConfiguration config){


        GSVRenderer.GameWindowFrame gameWindowFrame = new GSVRenderer.GameWindowFrame(config);
        //gameWindowFrame.pack();
        gameWindowFrame.setVisible(true);
        //gameWindowFrame.setBorder(null);
        desktopPane.add(TargetingMenu.createTargetingMenu().getFrame());
        desktopPane.add(ShipInfoPanel.generateShipInfoPanel().getFrame());
        desktopPane.add(gameWindowFrame);
        desktopPane.setBackground(new Color(0));



        this.add(desktopPane);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());







    }















}
