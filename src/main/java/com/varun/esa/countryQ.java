package com.varun.esa;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.neelkamath.euphonia.Quizmaster;
import com.neelkamath.euphonia.api.ArtistMetadata;
import com.varun.esa.utils.CommonUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class countryQ {
    private JPanel countryPanel;
    private JButton btnNext;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JLabel lblCountryQ;
    private JFrame frame = new JFrame("countryQ");

    ButtonGroup countryGroup = new ButtonGroup();

    public void checkCountryAnswer(Quizmaster Q, ButtonGroup countryGroup, Score score) {
        String answer = Q.getQuiz().getCountryQuestion().getAnswer();
        String selectedCountry = CommonUtils.getSelectedButtonText(countryGroup);
        if (selectedCountry != null && selectedCountry.equalsIgnoreCase(answer)) {
            score.increment();
        }
    }

    public countryQ(List<ArtistMetadata> artists, Score score, int Selection) throws IOException {
        frame.setContentPane(countryPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        //frame.setBackground(Color.BLUE);

        Quizmaster Q = new Quizmaster(artists.get(Selection));
        lblCountryQ.setText(Q.getQuiz().getCountryQuestion().getQuestion());
        Iterator<String> i = Q.getQuiz().getCountryQuestion().getOptions().iterator();

        countryGroup.add(radioButton1);
        countryGroup.add(radioButton2);
        countryGroup.add(radioButton3);
        countryGroup.add(radioButton4);

        Iterator<AbstractButton> countryButtonIterator = countryGroup.getElements().asIterator();
        while (countryButtonIterator.hasNext()) {
            JRadioButton Button = (JRadioButton) countryButtonIterator.next();
            if (i.hasNext()) {
                String text = i.next();
                if (text == null || text.length() == 0) {
                    Button.setText("Sorry, No option");
                } else {
                    Button.setText(text);
                }
            } else {
                Button.setText("Sorry, No option");
            }
        }

        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                checkCountryAnswer(Q, countryGroup, score);
                if (CommonUtils.getSelectedButtonText(countryGroup) == null) {
                    lblCountryQ.setText("Please select an Option");
                } else {
                    frame.dispose();
                    new scoreFrame(score);
                }
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
        countryPanel = new JPanel();
        countryPanel.setLayout(new GridLayoutManager(6, 1, new Insets(0, 0, 0, 0), -1, -1));
        countryPanel.setBackground(new Color(-16250559));
        countryPanel.setForeground(new Color(-986896));
        countryPanel.setPreferredSize(new Dimension(600, 400));
        btnNext = new JButton();
        btnNext.setText("NEXT");
        countryPanel.add(btnNext, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lblCountryQ = new JLabel();
        lblCountryQ.setBackground(new Color(-16250559));
        lblCountryQ.setForeground(new Color(-986896));
        lblCountryQ.setText("Label");
        countryPanel.add(lblCountryQ, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        radioButton1 = new JRadioButton();
        radioButton1.setBackground(new Color(-16250559));
        radioButton1.setEnabled(false);
        radioButton1.setForeground(new Color(-986896));
        radioButton1.setText("RadioButton");
        countryPanel.add(radioButton1, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        radioButton2 = new JRadioButton();
        radioButton2.setBackground(new Color(-16250559));
        radioButton2.setForeground(new Color(-986896));
        radioButton2.setText("RadioButton");
        countryPanel.add(radioButton2, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        radioButton3 = new JRadioButton();
        radioButton3.setBackground(new Color(-16250559));
        radioButton3.setForeground(new Color(-986896));
        radioButton3.setText("RadioButton");
        countryPanel.add(radioButton3, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        radioButton4 = new JRadioButton();
        radioButton4.setBackground(new Color(-16250559));
        radioButton4.setForeground(new Color(-986896));
        radioButton4.setText("RadioButton");
        countryPanel.add(radioButton4, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return countryPanel;
    }

}
