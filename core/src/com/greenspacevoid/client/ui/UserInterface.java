package com.greenspacevoid.client.ui;

import com.greenspacevoid.client.ui.menus.ui.main.TargetingMenu;

import javax.swing.*;
@Deprecated // Replaced by Desktop class
public class UserInterface {
    //Todo User interface manager!
    //Todo: Drag n drop





    public static TargetingMenu targetingMenu;


    public static void generateUIComponents(){
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }catch(Exception ignored){//Windows theme looks the best IMO. However, this is not set in stone.



        }
        /*
        This method is executed upon a successful login with the client. It will start the libGDX renderer and
        generate all menus and UI components. They may not appear visible, however by the activation of hotkeys or other
        menu buttons, will they then display.
         */
        targetingMenu = TargetingMenu.createTargetingMenu();






    }

    public static void updateAllInterfaceComponents(){








    }









}
