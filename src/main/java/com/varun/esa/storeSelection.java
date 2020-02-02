package com.varun.esa;

import javax.swing.*;

public class storeSelection {
    public void setSelectionNumber(int selectionNumber) {
        this.selectionNumber = selectionNumber;
    }

    public void setSelectedButton(JRadioButton selectedButton) {
        this.selectedButton = selectedButton;
    }

    public int getSelectionNumber() {
        return selectionNumber;
    }

    public JRadioButton getSelectedButton() {
        return selectedButton;
    }

    public void setScore(int givenScore){
        System.out.println("Score is set");
        score = givenScore;
    }

    public int getScore() {
        return score;
    }

    int selectionNumber = -1;
    JRadioButton selectedButton = null;
    int score=0;
}
