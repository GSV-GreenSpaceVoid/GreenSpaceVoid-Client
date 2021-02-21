package com.greenspacevoid.client.ui.menus.ui.auxiliary.social;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ChatMenu {

    //Todo: Create a custom chat window that can be duplicated/delegated into numerous tabbed JPanels


    private JPanel chatMenuPanel;
    private JTabbedPane tabbedPane1;
    private JPanel localChannelPanel;
    private JTextArea chatTextArea;
    private JList userInChannelList;
    private JScrollPane chatWindowScrollpane;
    private JLabel channelDescriptionLabel;
    private JLabel usersInChannelLabel;
    private JTextField messageTextField;
    private JButton sendButton;
    private JScrollPane userListScrollpane;


    public void addChatRoom(/*Mystery data in here B) */) {

        //Todo: On connect, add the player's personal chat rooms to their client. B)


    }

    public void updateChat(String channelID, String message, String username) {

        //Specify channel, message, and sender B) Listener on the client listens for enter keystrokes to send a message.


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
        chatMenuPanel = new JPanel();
        chatMenuPanel.setLayout(new GridLayoutManager(3, 2, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPane1 = new JTabbedPane();
        chatMenuPanel.add(tabbedPane1, new GridConstraints(1, 0, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        localChannelPanel = new JPanel();
        localChannelPanel.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPane1.addTab("Local", localChannelPanel);
        chatWindowScrollpane = new JScrollPane();
        chatWindowScrollpane.setVerticalScrollBarPolicy(22);
        localChannelPanel.add(chatWindowScrollpane, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        chatTextArea = new JTextArea();
        chatWindowScrollpane.setViewportView(chatTextArea);
        userListScrollpane = new JScrollPane();
        localChannelPanel.add(userListScrollpane, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        userInChannelList = new JList();
        final DefaultListModel defaultListModel1 = new DefaultListModel();
        defaultListModel1.addElement("Test1");
        defaultListModel1.addElement("Test2");
        defaultListModel1.addElement("Test3");
        userInChannelList.setModel(defaultListModel1);
        userListScrollpane.setViewportView(userInChannelList);
        usersInChannelLabel = new JLabel();
        usersInChannelLabel.setText("Users in Channel:");
        localChannelPanel.add(usersInChannelLabel, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        channelDescriptionLabel = new JLabel();
        channelDescriptionLabel.setText("Channel Description");
        localChannelPanel.add(channelDescriptionLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        messageTextField = new JTextField();
        chatMenuPanel.add(messageTextField, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(385, 30), null, 0, false));
        sendButton = new JButton();
        sendButton.setText("Send");
        chatMenuPanel.add(sendButton, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return chatMenuPanel;
    }

}
