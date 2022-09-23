# Dice-Api
This was an attempt to create an API in Java. Spring-Boot was used which made the set up really simple.

The endpoints available are:
|endpoint|returns|parameters|
|--------|-------|----------|
|__/hello-world__|Returns hello world|N/A|
|__/hello__|Returns hello name|name : string|
|__/dice/find-average__|Provides the expected value when rolling an n-sided die, with advantage and disadvantage|sidesOfDice: number|

### Advantage and Disadvantage

* Advantage: Rolling two dice at the same time, take the higher number
* Disadvantage: Rolling two dice at the same time, take the lower number

Pull it down and click start, it should be runing on localhost:8080
