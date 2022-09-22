package com.toby.JavaApi.domain;

public class DiceAverages {
    private float average;
    private float averageWithAdvantage;
    private float averageWithDisadvantage;

    public DiceAverages(float numberOfSides) {
        this.average = average(numberOfSides);
        this.averageWithAdvantage = averageWithAdvantage(numberOfSides);
        this.averageWithDisadvantage = averageWithDisadvantage(numberOfSides);
    }

    private float averageWithDisadvantage(float numberOfSides) {
        //Formula to find average value when rolling disadvantage with n sided dice
        return ((numberOfSides + 1) * (2 * numberOfSides + 1)) / (6 * numberOfSides);
    }

    private float averageWithAdvantage(float numberOfSides) {
        //Formula to find average value when rolling advantage with n sided dice
        return ((numberOfSides + 1) * (4 * numberOfSides - 1)) / (6 * numberOfSides);
    }

    private float average(float numberOfSides) {
        //Returns the average value when rolling an n sided die
        return (numberOfSides + 1) / 2;
    }

    public float getAverage() {
        return (float) ((float) Math.round(average * 1000d) / 1000d);
    }

    public float getAverageWithAdvantage() {
        return (float) ((float) Math.round(averageWithAdvantage * 1000d) / 1000d);
    }

    public float getAverageWithDisadvantage() {
        return (float) ((float) Math.round(averageWithDisadvantage * 1000d) / 1000d);
    }
}
