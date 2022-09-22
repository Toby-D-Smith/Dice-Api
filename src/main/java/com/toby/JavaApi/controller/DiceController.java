package com.toby.JavaApi.controller;

import com.toby.JavaApi.domain.Dice;
import com.toby.JavaApi.domain.DiceAverages;
import com.toby.JavaApi.service.DiceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dice")
public class DiceController {
    @GetMapping("/find-average")
    public DiceAverages findAverage(@RequestParam int sidesOfDice) {
        var dice = new Dice(sidesOfDice);
        var diceService = new DiceService();
        return diceService.findAverage(dice.getSides());
    }
}
