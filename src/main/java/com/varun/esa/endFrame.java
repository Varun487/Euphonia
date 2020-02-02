package com.varun.esa;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class endFrame {


    private JPanel endPanel;
    private JButton btnTryAgain;
    private JButton btnQuit;
    private JLabel lblThankyou;
    private JFrame frame = new JFrame("endFrame");

    public endFrame() {
        frame.setContentPane(endPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBackground(Color.BLUE);

        btnQuit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.dispose();
            }
        });

        btnTryAgain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new Welcome();
                frame.dispose();
            }
        });
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
        endPanel = new JPanel();
        endPanel.setLayout(new GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));
        endPanel.setBackground(new Color(-16250559));
        endPanel.setForeground(new Color(-986896));
        endPanel.setPreferredSize(new Dimension(600, 400));
        btnTryAgain = new JButton();
        btnTryAgain.setBackground(new Color(-16715776));
        btnTryAgain.setForeground(new Color(-986896));
        btnTryAgain.setText("Try Again");
        endPanel.add(btnTryAgain, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        btnQuit = new JButton();
        btnQuit.setBackground(new Color(-1048576));
        btnQuit.setForeground(new Color(-986896));
        btnQuit.setText("Quit");
        endPanel.add(btnQuit, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lblThankyou = new JLabel();
        lblThankyou.setBackground(new Color(-16250559));
        lblThankyou.setForeground(new Color(-986896));
        lblThankyou.setText("THANKYOU FOR PLAYING!!");
        endPanel.add(lblThankyou, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return endPanel;
    }

}
