package com.greenspacevoidcore.client.menus.auxiliary.inventory;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class ItemInformation {
    private JTabbedPane itemInformationTabbedPane;
    private JPanel itemPanel;
    private JTextArea descriptionUngaYouCanTextArea;
    private JTree requiredSkillTree;
    private JTable statisticsTable;
    private JScrollPane statisticsScrollPane;
    private JPanel requiredSkillsScrollPane;
    private JScrollPane infoScrollPane;
    private JPanel industryPanel;
    private JTable requiredMaterialsTable;
    private JScrollPane requiredMaterialsScrollPane;
    private JLabel buildTimeLabel;

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
        itemPanel = new JPanel();
        itemPanel.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        itemPanel.setBorder(BorderFactory.createTitledBorder(null, "Item Name", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        itemInformationTabbedPane = new JTabbedPane();
        itemPanel.add(itemInformationTabbedPane, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        infoScrollPane = new JScrollPane();
        itemInformationTabbedPane.addTab("Info", infoScrollPane);
        descriptionUngaYouCanTextArea = new JTextArea();
        descriptionUngaYouCanTextArea.setText("Description: Unga\n\nYou can('t) use this item.");
        infoScrollPane.setViewportView(descriptionUngaYouCanTextArea);
        statisticsScrollPane = new JScrollPane();
        itemInformationTabbedPane.addTab("Stats", statisticsScrollPane);
        statisticsScrollPane.setBorder(BorderFactory.createTitledBorder(null, "Statistics:", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        statisticsTable = new JTable();
        statisticsScrollPane.setViewportView(statisticsTable);
        requiredSkillsScrollPane = new JPanel();
        requiredSkillsScrollPane.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        itemInformationTabbedPane.addTab("Skills", requiredSkillsScrollPane);
        requiredSkillsScrollPane.setBorder(BorderFactory.createTitledBorder(null, "Required Skills", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        requiredSkillTree = new JTree();
        requiredSkillsScrollPane.add(requiredSkillTree, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        industryPanel = new JPanel();
        industryPanel.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        itemInformationTabbedPane.addTab("Industry", industryPanel);
        final Spacer spacer1 = new Spacer();
        industryPanel.add(spacer1, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        requiredMaterialsScrollPane = new JScrollPane();
        industryPanel.add(requiredMaterialsScrollPane, new GridConstraints(0, 0, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        requiredMaterialsScrollPane.setBorder(BorderFactory.createTitledBorder(null, "Required Materials", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        requiredMaterialsTable = new JTable();
        requiredMaterialsScrollPane.setViewportView(requiredMaterialsTable);
        buildTimeLabel = new JLabel();
        buildTimeLabel.setText("Buld time at current skill level: mm:dd:hh:mm:ss");
        industryPanel.add(buildTimeLabel, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        itemPanel.add(panel1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return itemPanel;
    }
}