package com.greenspacevoid.client.ui.menus.ui.main;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TargetingMenu {
    private JFrame frame;
    private JPanel targetingPanel;
    private JTable weaponryTable;
    private JTable lockedTargetTable;
    private JTextArea targetInfoPane;
    private JProgressBar targetShieldBar;
    private JProgressBar targetHullBar;
    private JProgressBar targetStructureBar;
    private JButton openDroneMenuButton;
    private JButton toggleModuleOverdriveForButton;
    private JButton ceaseAllWeaponsFireButton;
    private JButton lockOnToNearestAsteroidButton;
    private JButton volleyClosestTargetButton;
    private JButton lockOnToNearestVesselButton;
    private JButton carrierMenuButton;
    private JButton doomsdayDeviceMenuButton;
    private JButton mobileIndustryAndManufacturingButton;
    private JButton shipScannersSurveyButton;
    private JButton viewCargoHoldButton;
    private JTable shipsTargetTable;
    private JScrollPane shipsScrollPane;
    private JPanel navigationPanel;
    private JPanel stationsPanel;
    private JTable navigationTargetTable;
    private JTable table2;
    private JTable miningTargetsTable;
    private JScrollPane stationScrollPane;
    private JScrollPane miningScrollPane;
    private JTabbedPane stationsTargetTable;
    private JScrollPane navigationScrollPane;
    private JTable allTargetsTable;
    private JScrollPane allTargetsScrollpane;
    private JPanel allTargetsPanel;
    private JPanel shipsPanel;
    private JPanel miningPanel;


    public TargetingMenu() {
        toggleModuleOverdriveForButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Something happened!");
            }
        });
    }

    public static TargetingMenu createTargetingMenu() {
        JFrame frame = new JFrame("Targeting Menu");

        TargetingMenu menu = new TargetingMenu();
        menu.setFrame(frame);
        frame.setContentPane(menu.targetingPanel);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        return menu;
    }


    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JPanel getTargetingPanel() {
        return targetingPanel;
    }

    public JTable getWeaponryTable() {
        return weaponryTable;
    }

    public JTable getLockedTargetTable() {
        return lockedTargetTable;
    }

    public JTextArea getTargetInfoPane() {
        return targetInfoPane;
    }

    public JProgressBar getTargetShieldBar() {
        return targetShieldBar;
    }

    public JProgressBar getTargetHullBar() {
        return targetHullBar;
    }

    public JProgressBar getProgressBar3() {
        return targetStructureBar;
    }

    public JButton getOpenDroneMenuButton() {
        return openDroneMenuButton;
    }

    public JButton getToggleModuleOverdriveForButton() {
        return toggleModuleOverdriveForButton;
    }

    public JButton getCeaseAllWeaponsFireButton() {
        return ceaseAllWeaponsFireButton;
    }

    public JButton getLockOnToNearestAsteroidButton() {
        return lockOnToNearestAsteroidButton;
    }

    public JButton getVolleyClosestTargetButton() {
        return volleyClosestTargetButton;
    }

    public JButton getLockOnToNearestVesselButton() {
        return lockOnToNearestVesselButton;
    }

    public JButton getCarrierMenuButton() {
        return carrierMenuButton;
    }

    public JButton getDoomsdayDeviceMenuButton() {
        return doomsdayDeviceMenuButton;
    }

    public JButton getMobileIndustryAndManufacturingButton() {
        return mobileIndustryAndManufacturingButton;
    }

    public JButton getShipScannersSurveyButton() {
        return shipScannersSurveyButton;
    }

    public JButton getViewCargoHoldButton() {
        return viewCargoHoldButton;
    }

    public JTable getObjectsOfInterestTable() {
        return shipsTargetTable;
    }

    public JProgressBar getTargetStructureBar() {
        return targetStructureBar;
    }

    public JTable getShipsTargetTable() {
        return shipsTargetTable;
    }

    public JScrollPane getShipsScrollPane() {
        return shipsScrollPane;
    }

    public JPanel getNavigationPanel() {
        return navigationPanel;
    }

    public JPanel getStationsPanel() {
        return stationsPanel;
    }

    public JTable getNavigationTargetTable() {
        return navigationTargetTable;
    }

    public JTable getTable2() {
        return table2;
    }

    public JTable getMiningTargetsTable() {
        return miningTargetsTable;
    }

    public JScrollPane getStationScrollPane() {
        return stationScrollPane;
    }

    public JScrollPane getMiningScrollPane() {
        return miningScrollPane;
    }

    public JTabbedPane getStationsTargetTable() {
        return stationsTargetTable;
    }

    public JScrollPane getNavigationScrollPane() {
        return navigationScrollPane;
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
        targetingPanel = new JPanel();
        targetingPanel.setLayout(new GridLayoutManager(16, 4, new Insets(0, 0, 0, 0), -1, -1));
        targetingPanel.setBorder(BorderFactory.createTitledBorder(null, "Targeting Panel", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        lockedTargetTable = new JTable();
        targetingPanel.add(lockedTargetTable, new GridConstraints(2, 1, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 65), null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setText("Offensive/Harvesting Devices:");
        targetingPanel.add(label1, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("Locked-On Targets:");
        targetingPanel.add(label2, new GridConstraints(1, 1, 1, 3, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        targetInfoPane = new JTextArea();
        targetInfoPane.setEditable(false);
        Font targetInfoPaneFont = this.$$$getFont$$$("Courier New", -1, -1, targetInfoPane.getFont());
        if (targetInfoPaneFont != null) targetInfoPane.setFont(targetInfoPaneFont);
        targetInfoPane.setLineWrap(true);
        targetInfoPane.setText("Target Info:");
        targetInfoPane.setWrapStyleWord(true);
        targetingPanel.add(targetInfoPane, new GridConstraints(3, 1, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 65), null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setText("Targeting Utilities:");
        targetingPanel.add(label3, new GridConstraints(4, 1, 1, 3, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lockOnToNearestAsteroidButton = new JButton();
        lockOnToNearestAsteroidButton.setText("Lock-On to Nearest Asteroid");
        targetingPanel.add(lockOnToNearestAsteroidButton, new GridConstraints(5, 1, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lockOnToNearestVesselButton = new JButton();
        lockOnToNearestVesselButton.setText("Lock-On to Nearest Vessel");
        targetingPanel.add(lockOnToNearestVesselButton, new GridConstraints(6, 1, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        toggleModuleOverdriveForButton = new JButton();
        toggleModuleOverdriveForButton.setText("Toggle Module Overdrive For All Weapons");
        targetingPanel.add(toggleModuleOverdriveForButton, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        ceaseAllWeaponsFireButton = new JButton();
        ceaseAllWeaponsFireButton.setText("Cease All Weapons Fire");
        targetingPanel.add(ceaseAllWeaponsFireButton, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setText("Offensive/Harvesting Device Management:");
        targetingPanel.add(label4, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        openDroneMenuButton = new JButton();
        openDroneMenuButton.setText("Open Drone Menu");
        targetingPanel.add(openDroneMenuButton, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        volleyClosestTargetButton = new JButton();
        volleyClosestTargetButton.setText("Volley Closest Target");
        targetingPanel.add(volleyClosestTargetButton, new GridConstraints(7, 1, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label5 = new JLabel();
        label5.setText("Target Health Status:");
        targetingPanel.add(label5, new GridConstraints(8, 1, 1, 3, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label6 = new JLabel();
        label6.setText("Ship Functions / Specialties:");
        targetingPanel.add(label6, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        viewCargoHoldButton = new JButton();
        viewCargoHoldButton.setText("View Cargo Hold");
        targetingPanel.add(viewCargoHoldButton, new GridConstraints(9, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        shipScannersSurveyButton = new JButton();
        shipScannersSurveyButton.setText("Ship Scanners / Survey");
        targetingPanel.add(shipScannersSurveyButton, new GridConstraints(10, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        mobileIndustryAndManufacturingButton = new JButton();
        mobileIndustryAndManufacturingButton.setText("Mobile Industry And Manufacturing");
        targetingPanel.add(mobileIndustryAndManufacturingButton, new GridConstraints(11, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        carrierMenuButton = new JButton();
        carrierMenuButton.setText("Carrier Menu");
        targetingPanel.add(carrierMenuButton, new GridConstraints(12, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        doomsdayDeviceMenuButton = new JButton();
        doomsdayDeviceMenuButton.setText("Doomsday Device(s) Menu");
        targetingPanel.add(doomsdayDeviceMenuButton, new GridConstraints(13, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        targetShieldBar = new JProgressBar();
        targetShieldBar.setAutoscrolls(false);
        targetShieldBar.setIndeterminate(true);
        targetShieldBar.setOrientation(1);
        targetShieldBar.setString("Shields: 0%");
        targetShieldBar.setStringPainted(true);
        targetingPanel.add(targetShieldBar, new GridConstraints(9, 1, 7, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        targetHullBar = new JProgressBar();
        targetHullBar.setIndeterminate(true);
        targetHullBar.setOrientation(1);
        targetHullBar.setString("Hull: 0%");
        targetHullBar.setStringPainted(true);
        targetingPanel.add(targetHullBar, new GridConstraints(9, 2, 7, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        targetStructureBar = new JProgressBar();
        targetStructureBar.setIndeterminate(true);
        targetStructureBar.setOrientation(1);
        targetStructureBar.setString("Structure: 0%");
        targetStructureBar.setStringPainted(true);
        targetingPanel.add(targetStructureBar, new GridConstraints(9, 3, 7, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        stationsTargetTable = new JTabbedPane();
        targetingPanel.add(stationsTargetTable, new GridConstraints(0, 0, 1, 4, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        shipsPanel = new JPanel();
        shipsPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        stationsTargetTable.addTab("Ships", shipsPanel);
        shipsScrollPane = new JScrollPane();
        shipsScrollPane.setVerticalScrollBarPolicy(22);
        shipsPanel.add(shipsScrollPane, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        shipsTargetTable = new JTable();
        shipsScrollPane.setViewportView(shipsTargetTable);
        stationsPanel = new JPanel();
        stationsPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        stationsTargetTable.addTab("Stations", stationsPanel);
        stationScrollPane = new JScrollPane();
        stationScrollPane.setVerticalScrollBarPolicy(22);
        stationsPanel.add(stationScrollPane, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        table2 = new JTable();
        stationScrollPane.setViewportView(table2);
        miningPanel = new JPanel();
        miningPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        stationsTargetTable.addTab("Mining", miningPanel);
        miningScrollPane = new JScrollPane();
        miningScrollPane.setVerticalScrollBarPolicy(22);
        miningPanel.add(miningScrollPane, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        miningTargetsTable = new JTable();
        miningScrollPane.setViewportView(miningTargetsTable);
        navigationPanel = new JPanel();
        navigationPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        stationsTargetTable.addTab("Navigation", navigationPanel);
        navigationScrollPane = new JScrollPane();
        navigationScrollPane.setVerticalScrollBarPolicy(22);
        navigationPanel.add(navigationScrollPane, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        navigationTargetTable = new JTable();
        navigationScrollPane.setViewportView(navigationTargetTable);
        allTargetsPanel = new JPanel();
        allTargetsPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        stationsTargetTable.addTab("All", allTargetsPanel);
        allTargetsScrollpane = new JScrollPane();
        allTargetsScrollpane.setVerticalScrollBarPolicy(22);
        allTargetsPanel.add(allTargetsScrollpane, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        allTargetsTable = new JTable();
        allTargetsScrollpane.setViewportView(allTargetsTable);
        weaponryTable = new JTable();
        targetingPanel.add(weaponryTable, new GridConstraints(2, 0, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 130), null, 0, false));
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
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return targetingPanel;
    }

}
