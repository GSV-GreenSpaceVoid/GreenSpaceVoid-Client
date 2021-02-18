package com.greenspacevoid.client.ui.menus.ui.auxiliary.economy;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import java.awt.*;

public class TransactionsMenu {
    private JTabbedPane tabbedPane1;
    private JPanel masterPanel;
    private JPanel transactionsPanel;
    private JTable transactionTable;
    private JScrollPane transactionPanelScrollPane;
    private JPanel financeReportPanel;
    private JSlider profitMarginDisplay;
    private JLabel proftMarginLabel;
    private JComboBox timeScaleSelectionBox;
    private JTextPane currentBalance$1234TextPane;
    private JLabel statisticOverPastAmountOfTimeLabel;
    private JLabel defecitLabel;
    private JLabel netIncomeLabel;
    private JTextPane transactionsInfoPane;

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
        masterPanel = new JPanel();
        masterPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPane1 = new JTabbedPane();
        masterPanel.add(tabbedPane1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        financeReportPanel = new JPanel();
        financeReportPanel.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPane1.addTab("Finance Report", financeReportPanel);
        profitMarginDisplay = new JSlider();
        profitMarginDisplay.setOrientation(1);
        profitMarginDisplay.setPaintLabels(true);
        profitMarginDisplay.setPaintTicks(true);
        financeReportPanel.add(profitMarginDisplay, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        financeReportPanel.add(spacer1, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        transactionsPanel = new JPanel();
        transactionsPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPane1.addTab("Transactions", transactionsPanel);
        transactionPanelScrollPane = new JScrollPane();
        transactionPanelScrollPane.setVerticalScrollBarPolicy(22);
        transactionsPanel.add(transactionPanelScrollPane, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        transactionTable = new JTable();
        transactionPanelScrollPane.setViewportView(transactionTable);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return masterPanel;
    }
}