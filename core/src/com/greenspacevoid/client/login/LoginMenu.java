package com.greenspacevoid.client.login;

import com.esotericsoftware.kryonet.Client;
import com.greenspacevoid.client.misc.URLs;
import com.greenspacevoid.server.ClientSide;
import com.greenspacevoidsharedAPI.networking.network.messages.login.NetworkedLogin;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.security.MessageDigest;
import java.util.Locale;

public class LoginMenu {
    private JPanel panel1;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton forgotPasswordButton;
    private JButton newUserRegisterHereButton;
    private JButton joinOurDiscordButton;

    private static final long loginCooldownTimer = 3000; //In Milliseconds
    long lastTimeSinceLoginAttempt = 0;
    //Listeners


    public LoginMenu() {

        //Login Button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        //Forgot Password
        forgotPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openForgotPasswordLink();
            }
        });

        //Register as a new user
        newUserRegisterHereButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openRegistrationLink();
            }
        });

        //Join Discord
        joinOurDiscordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openDiscordLink();
            }
        });


    }


    public static void createLoginPane() {
        JFrame frame = new JFrame("Green Space Void: Login");
        frame.setContentPane(new LoginMenu().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public void login() {//Executed when login button is pressed.
        if (System.currentTimeMillis() - loginCooldownTimer > lastTimeSinceLoginAttempt) {
            lastTimeSinceLoginAttempt = System.currentTimeMillis();
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            byte[] hashedPassword;
            try {
                MessageDigest hasher = MessageDigest.getInstance("SHA-512");
                hashedPassword = hasher.digest(password.getBytes());
            } catch (Exception ignored) {
                System.out.println("Login Credentials Didn't Hash Correctly");
                return;
            }

            try {
                ClientSide.clientSide = new ClientSide();
                ClientSide.clientSide.connectToServer();
                NetworkedLogin.CLIENT.CLIENT_SEND_LoginMessage loginMessage = new NetworkedLogin.CLIENT.CLIENT_SEND_LoginMessage();
                loginMessage.username = username;
                loginMessage.password = hashedPassword;
                ClientSide.clientSide.sendMessage(loginMessage);
            } catch (Exception e) {
                System.out.println("Could not connect to server!!!!");
                e.printStackTrace();
                ClientSide.clientSide = null;
            }



        }

    }


    public void openForgotPasswordLink() {
        try {
            URI uri = new URI(URLs.passwordRetrievalLink);
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(uri);

        } catch (Exception ignored) {
            System.out.println("If for some reason the Forgot Password button doesn't work, you can reach the discord server at: " + URLs.passwordRetrievalLink);
        }
    }


    public void openRegistrationLink() {
        try {
            URI uri = new URI(URLs.registrationLink);
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(uri);

        } catch (Exception ignored) {
            System.out.println("If for some reason the registration button doesn't work, you can reach the discord server at: " + URLs.registrationLink);
        }
    }


    public void openDiscordLink() {
        try {
            URI uri = new URI(URLs.discordLink);
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(uri);

        } catch (Exception ignored) {
            System.out.println("If for some reason the Discord button doesn't work, you can reach the discord server at: " + URLs.discordLink);
        }
    }


    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(10, 5, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setBackground(new Color(-16777216));
        Font panel1Font = this.$$$getFont$$$("Courier New", -1, -1, panel1.getFont());
        if (panel1Font != null) panel1.setFont(panel1Font);
        panel1.setForeground(new Color(-9270822));
        panel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Login", TitledBorder.LEFT, TitledBorder.DEFAULT_POSITION, this.$$$getFont$$$("Courier New", -1, -1, panel1.getFont()), new Color(-16711936)));
        final JLabel label1 = new JLabel();
        label1.setBackground(new Color(-16777216));
        Font label1Font = this.$$$getFont$$$("Courier New", Font.BOLD, 22, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setForeground(new Color(-16711936));
        label1.setText("Welcome to Green Space Void!");
        panel1.add(label1, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        usernameField = new JTextField();
        usernameField.setBackground(new Color(-16777216));
        usernameField.setCaretColor(new Color(-16711936));
        usernameField.setForeground(new Color(-16711936));
        panel1.add(usernameField, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        passwordField = new JPasswordField();
        passwordField.setBackground(new Color(-16777216));
        passwordField.setForeground(new Color(-16711936));
        panel1.add(passwordField, new GridConstraints(4, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setBackground(new Color(-16777216));
        Font label2Font = this.$$$getFont$$$("Courier New", -1, -1, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setForeground(new Color(-16711936));
        label2.setText("Enter Email:");
        panel1.add(label2, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        panel1.add(spacer1, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        panel1.add(spacer2, new GridConstraints(2, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setBackground(new Color(-16777216));
        Font label3Font = this.$$$getFont$$$("Courier New", -1, -1, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setForeground(new Color(-16711936));
        label3.setText("Enter Password:");
        panel1.add(label3, new GridConstraints(3, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        loginButton = new JButton();
        loginButton.setBackground(new Color(-16777216));
        Font loginButtonFont = this.$$$getFont$$$("Courier New", -1, -1, loginButton.getFont());
        if (loginButtonFont != null) loginButton.setFont(loginButtonFont);
        loginButton.setForeground(new Color(-16711936));
        loginButton.setLabel("Login!");
        loginButton.setText("Login!");
        panel1.add(loginButton, new GridConstraints(5, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer3 = new Spacer();
        panel1.add(spacer3, new GridConstraints(9, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer4 = new Spacer();
        panel1.add(spacer4, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer5 = new Spacer();
        panel1.add(spacer5, new GridConstraints(4, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        newUserRegisterHereButton = new JButton();
        newUserRegisterHereButton.setBackground(new Color(-16777216));
        newUserRegisterHereButton.setBorderPainted(true);
        Font newUserRegisterHereButtonFont = this.$$$getFont$$$("Courier New", -1, -1, newUserRegisterHereButton.getFont());
        if (newUserRegisterHereButtonFont != null) newUserRegisterHereButton.setFont(newUserRegisterHereButtonFont);
        newUserRegisterHereButton.setForeground(new Color(-16729159));
        newUserRegisterHereButton.setText("New User? Register Here!");
        panel1.add(newUserRegisterHereButton, new GridConstraints(7, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        forgotPasswordButton = new JButton();
        forgotPasswordButton.setBackground(new Color(-16777216));
        Font forgotPasswordButtonFont = this.$$$getFont$$$("Courier New", -1, -1, forgotPasswordButton.getFont());
        if (forgotPasswordButtonFont != null) forgotPasswordButton.setFont(forgotPasswordButtonFont);
        forgotPasswordButton.setForeground(new Color(-26880));
        forgotPasswordButton.setLabel("Forgot Password?");
        forgotPasswordButton.setText("Forgot Password?");
        panel1.add(forgotPasswordButton, new GridConstraints(6, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        joinOurDiscordButton = new JButton();
        joinOurDiscordButton.setBackground(new Color(-7304742));
        joinOurDiscordButton.setForeground(new Color(-16711936));
        joinOurDiscordButton.setHideActionText(false);
        joinOurDiscordButton.setText("Join Our Discord!");
        panel1.add(joinOurDiscordButton, new GridConstraints(8, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }

}
