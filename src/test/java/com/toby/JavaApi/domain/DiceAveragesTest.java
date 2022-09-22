package com.toby.JavaApi.domain;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiceAveragesTest {

    @Test
    public void averageWorksWithAD2() {
        var diceAverages = new DiceAverages(2);
        assertEquals(1.5, diceAverages.getAverage(),0.001);
        assertEquals(1.75, diceAverages.getAverageWithAdvantage(),0.001);
        assertEquals(1.25, diceAverages.getAverageWithDisadvantage(),0.001);
    }
    @Test
    public void averageWorksWithAD4() {
        var diceAverages = new DiceAverages(4);
        assertEquals(2.5, diceAverages.getAverage(),0.001);
        assertEquals(3.125, diceAverages.getAverageWithAdvantage(),0.001);
        assertEquals(1.875, diceAverages.getAverageWithDisadvantage(),0.001);
    }
    @Test
    public void averageWorksWithAD6() {
        var diceAverages = new DiceAverages(6);
        assertEquals(3.5, diceAverages.getAverage(),0.001);
        assertEquals(4.4722, diceAverages.getAverageWithAdvantage(),0.001);
        assertEquals(2.5278, diceAverages.getAverageWithDisadvantage(),0.001);
    }
    @Test
    public void averageWorksWithAD8() {
        var diceAverages = new DiceAverages(8);
        assertEquals(4.5, diceAverages.getAverage(),0.001);
        assertEquals(5.8125, diceAverages.getAverageWithAdvantage(),0.001);
        assertEquals(3.1875, diceAverages.getAverageWithDisadvantage(),0.001);
    }
    @Test
    public void averageWorksWithAD10() {
        var diceAverages = new DiceAverages(10);
        assertEquals(5.5, diceAverages.getAverage(), 0.001);
        assertEquals(7.15, diceAverages.getAverageWithAdvantage(), 0.001);
        assertEquals(3.85, diceAverages.getAverageWithDisadvantage(), 0.001);
    }
    @Test
    public void averageWorksWithAD12() {
        var diceAverages = new DiceAverages(12);
        assertEquals(6.5, diceAverages.getAverage(), 0.001);
        assertEquals(8.4861, diceAverages.getAverageWithAdvantage(),0.001);
        assertEquals(4.5139, diceAverages.getAverageWithDisadvantage(),0.001);
    }
    @Test
    public void averageWorksWithAD20() {
        var diceAverages = new DiceAverages(20);
        assertEquals(10.5, diceAverages.getAverage(),0.001);
        assertEquals(13.825, diceAverages.getAverageWithAdvantage(),0.001);
        assertEquals(7.175, diceAverages.getAverageWithDisadvantage(),0.001);
    }
}