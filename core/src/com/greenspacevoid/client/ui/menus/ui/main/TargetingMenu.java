package com.greenspacevoid.client.ui.menus.ui.main;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class TargetingMenu {
    private JPanel targetingPanel;
    private JTable weaponryTable;
    private JTable lockedTargetTable;
    private JTextArea targetInfoPane;
    private JProgressBar targetShieldBar;
    private JProgressBar targetHullBar;
    private JProgressBar progressBar3;
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
    private JTable objectsOfInterestTable;

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
        targetingPanel.setLayout(new GridLayoutManager(17, 4, new Insets(0, 0, 0, 0), -1, -1));
        targetingPanel.setBorder(BorderFactory.createTitledBorder(null, "Targeting Panel", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        final JLabel label1 = new JLabel();
        label1.setText("Objects of Interest:");
        targetingPanel.add(label1, new GridConstraints(0, 0, 1, 4, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        list1 = new JList();
        targetingPanel.add(list1, new GridConstraints(1, 0, 1, 4, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        weaponryTable = new JTable();
        targetingPanel.add(weaponryTable, new GridConstraints(3, 0, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        lockedTargetTable = new JTable();
        targetingPanel.add(lockedTargetTable, new GridConstraints(3, 1, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("Offensive/Harvesting Devices:");
        targetingPanel.add(label2, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setText("Locked-On Targets:");
        targetingPanel.add(label3, new GridConstraints(2, 1, 1, 3, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        targetInfoPane = new JTextArea();
        targetInfoPane.setText("Target Info:");
        targetingPanel.add(targetInfoPane, new GridConstraints(4, 1, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setText("Targeting Utilities:");
        targetingPanel.add(label4, new GridConstraints(5, 1, 1, 3, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lockOnToNearestAsteroidButton = new JButton();
        lockOnToNearestAsteroidButton.setText("Lock-On to Nearest Asteroid");
        targetingPanel.add(lockOnToNearestAsteroidButton, new GridConstraints(6, 1, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lockOnToNearestVesselButton = new JButton();
        lockOnToNearestVesselButton.setText("Lock-On to Nearest Vessel");
        targetingPanel.add(lockOnToNearestVesselButton, new GridConstraints(7, 1, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        toggleModuleOverdriveForButton = new JButton();
        toggleModuleOverdriveForButton.setText("Toggle Module Overdrive For All Weapons");
        targetingPanel.add(toggleModuleOverdriveForButton, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        ceaseAllWeaponsFireButton = new JButton();
        ceaseAllWeaponsFireButton.setText("Cease All Weapons Fire");
        targetingPanel.add(ceaseAllWeaponsFireButton, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label5 = new JLabel();
        label5.setText("Offensive/Harvesting Device Management:");
        targetingPanel.add(label5, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        openDroneMenuButton = new JButton();
        openDroneMenuButton.setText("Open Drone Menu");
        targetingPanel.add(openDroneMenuButton, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        volleyClosestTargetButton = new JButton();
        volleyClosestTargetButton.setText("Volley Closest Target");
        targetingPanel.add(volleyClosestTargetButton, new GridConstraints(8, 1, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label6 = new JLabel();
        label6.setText("Target Health Status:");
        targetingPanel.add(label6, new GridConstraints(9, 1, 1, 3, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label7 = new JLabel();
        label7.setText("Ship Functions / Specialties:");
        targetingPanel.add(label7, new GridConstraints(9, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        viewCargoHoldButton = new JButton();
        viewCargoHoldButton.setText("View Cargo Hold");
        targetingPanel.add(viewCargoHoldButton, new GridConstraints(10, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        shipScannersSurveyButton = new JButton();
        shipScannersSurveyButton.setText("Ship Scanners / Survey");
        targetingPanel.add(shipScannersSurveyButton, new GridConstraints(11, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        mobileIndustryAndManufacturingButton = new JButton();
        mobileIndustryAndManufacturingButton.setText("Mobile Industry And Manufacturing");
        targetingPanel.add(mobileIndustryAndManufacturingButton, new GridConstraints(12, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        carrierMenuButton = new JButton();
        carrierMenuButton.setText("Carrier Menu");
        targetingPanel.add(carrierMenuButton, new GridConstraints(13, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        doomsdayDeviceMenuButton = new JButton();
        doomsdayDeviceMenuButton.setText("Doomsday Device Menu");
        targetingPanel.add(doomsdayDeviceMenuButton, new GridConstraints(14, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        targetShieldBar = new JProgressBar();
        targetShieldBar.setAutoscrolls(false);
        targetShieldBar.setIndeterminate(true);
        targetShieldBar.setOrientation(1);
        targetShieldBar.setString("Shields: 0%");
        targetShieldBar.setStringPainted(true);
        targetingPanel.add(targetShieldBar, new GridConstraints(10, 1, 7, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        targetHullBar = new JProgressBar();
        targetHullBar.setIndeterminate(true);
        targetHullBar.setOrientation(1);
        targetHullBar.setString("Hull: 0%");
        targetHullBar.setStringPainted(true);
        targetingPanel.add(targetHullBar, new GridConstraints(10, 2, 7, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        progressBar3 = new JProgressBar();
        progressBar3.setIndeterminate(true);
        progressBar3.setOrientation(1);
        progressBar3.setString("Structure: 0%");
        progressBar3.setStringPainted(true);
        targetingPanel.add(progressBar3, new GridConstraints(10, 3, 7, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return targetingPanel;
    }
}
