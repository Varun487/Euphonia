package com.varun.esa;

public class Score {
    int score;

    public Score(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void increment() {
        score++;
        System.out.println("Score.increment() = " + score);
    }

}
