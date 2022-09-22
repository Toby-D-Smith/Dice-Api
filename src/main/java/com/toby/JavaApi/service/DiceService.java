package com.toby.JavaApi.service;

import com.toby.JavaApi.domain.DiceAverages;

public class DiceService {
    public DiceAverages findAverage( int sidesOfDice) {
        var diceAverages = new DiceAverages((float) sidesOfDice);
        return diceAverages;
    }
}
