package com.varun.esa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;
import java.util.Iterator;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.neelkamath.euphonia.Quizmaster;
import com.neelkamath.euphonia.api.*;
import com.varun.esa.utils.CommonUtils;

public class genreQ {
    private JPanel genrePanel;
    private JButton btnNext;
    private JLabel lblgenreQ;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JFrame frame = new JFrame("genreQ");

    ButtonGroup genreGroup = new ButtonGroup();

    public void checkGenreAnswer(Quizmaster Q, ButtonGroup genreGroup, Score score) {
        String answer = Q.getQuiz().getGenreQuestion().getAnswer();
        String selectedGenre = CommonUtils.getSelectedButtonText(genreGroup);
        if (selectedGenre != null && selectedGenre.equalsIgnoreCase(answer)) {
            score.increment();
        }
    }

    public genreQ(List<ArtistMetadata> artists, int Selection) throws IOException {
        Score score = new Score(0);
        frame.setContentPane(genrePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        //frame.setBackground(Color.BLUE);

        if (artists == null || artists.size() == 0) {
            frame.dispose();
            new errorFrame();
        } else {
            try {
                new Quizmaster(artists.get(Selection));
            } catch (Throwable e) {
                frame.dispose();
                new errorFrame();
                return;
            }
            //System.out.println(artists);
            Quizmaster Q = new Quizmaster(artists.get(Selection));

            lblgenreQ.setText(Q.getQuiz().getGenreQuestion().getQuestion());
            Iterator<String> i = Q.getQuiz().getGenreQuestion().getOptions().iterator();

            genreGroup.add(radioButton1);
            genreGroup.add(radioButton2);
            genreGroup.add(radioButton3);
            genreGroup.add(radioButton4);

            Iterator<AbstractButton> genreButtonIterator = genreGroup.getElements().asIterator();
            while (genreButtonIterator.hasNext()) {
                JRadioButton Button = (JRadioButton) genreButtonIterator.next();
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
                    checkGenreAnswer(Q, genreGroup, score);
                    if (CommonUtils.getSelectedButtonText(genreGroup) == null) {
                        lblgenreQ.setText("Please select an Option");
                    } else {
                        try {
                            frame.dispose();
                            new yearQ(artists, score, Selection);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
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
        genrePanel = new JPanel();
        genrePanel.setLayout(new GridLayoutManager(6, 1, new Insets(0, 0, 0, 0), -1, -1));
        genrePanel.setBackground(new Color(-16250559));
        genrePanel.setForeground(new Color(-986896));
        genrePanel.setPreferredSize(new Dimension(600, 400));
        btnNext = new JButton();
        btnNext.setBackground(new Color(-16715776));
        btnNext.setForeground(new Color(-986896));
        btnNext.setText("Next");
        genrePanel.add(btnNext, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lblgenreQ = new JLabel();
        lblgenreQ.setBackground(new Color(-16250559));
        lblgenreQ.setForeground(new Color(-986896));
        lblgenreQ.setText("Which");
        genrePanel.add(lblgenreQ, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        radioButton1 = new JRadioButton();
        radioButton1.setBackground(new Color(-16250559));
        radioButton1.setForeground(new Color(-986896));
        radioButton1.setText("RadioButton");
        genrePanel.add(radioButton1, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        radioButton2 = new JRadioButton();
        radioButton2.setBackground(new Color(-16250559));
        radioButton2.setForeground(new Color(-986896));
        radioButton2.setText("RadioButton");
        genrePanel.add(radioButton2, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        radioButton3 = new JRadioButton();
        radioButton3.setBackground(new Color(-16250559));
        radioButton3.setForeground(new Color(-986896));
        radioButton3.setText("RadioButton");
        genrePanel.add(radioButton3, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        radioButton4 = new JRadioButton();
        radioButton4.setBackground(new Color(-16250559));
        radioButton4.setForeground(new Color(-986896));
        radioButton4.setText("RadioButton");
        genrePanel.add(radioButton4, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return genrePanel;
    }

}
