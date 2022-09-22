package com.toby.JavaApi.domain;
import com.toby.JavaApi.service.DiceService;

public class Dice {
    private int sides;
    public Dice(int numberOfSides) {
        sides = numberOfSides;
    }

    public int getSides() {
        return sides;
    }

}
