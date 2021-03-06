package com.varun.esa;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.neelkamath.euphonia.api.ArtistMetadata;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class scoreFrame {
    private JButton btnNext;
    private JPanel scorePanel;
    private JLabel lblScore;
    private JFrame frame = new JFrame("Score");

    public scoreFrame(Score score) {
        frame.setContentPane(scorePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        //frame.setBackground(Color.BLUE);

        lblScore.setText("Score is: " + score.getScore() + " / 3");

        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //JOptionPane.showMessageDialog(null, "Hello, World");
                new endFrame();
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
        scorePanel = new JPanel();
        scorePanel.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        scorePanel.setBackground(new Color(-16250559));
        scorePanel.setForeground(new Color(-986896));
        scorePanel.setPreferredSize(new Dimension(600, 400));
        btnNext = new JButton();
        btnNext.setBackground(new Color(-16715776));
        btnNext.setForeground(new Color(-986896));
        btnNext.setText("NEXT");
        scorePanel.add(btnNext, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lblScore = new JLabel();
        lblScore.setBackground(new Color(-16250559));
        lblScore.setForeground(new Color(-986896));
        lblScore.setText("SCORE IS {SCORE}");
        scorePanel.add(lblScore, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return scorePanel;
    }

}
