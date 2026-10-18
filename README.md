# Terrarium Facade

Assignment 4 for Software Design Patterns.

## About

This Java console program uses the Facade pattern to take care of a terrarium.

The subsystem has four classes: `WaterTank` stores water, `Soil` tracks moisture and calculates the required water, `WateringSystem` takes water from the tank and waters the soil, and `LightingSystem` controls the light brightness.

`TerrariumFacade` provides three methods: `refillWaterTank()`, `startDay()`, and `endDay()`. It waters the plants before turning on the light. `Main` uses only the facade. The subsystem classes do not depend on the facade and can also be used directly.

In this simple model, soil starts at 30% moisture and 10 ml of water adds 1 percentage point. Daily care raises moisture to 60% and sets light brightness to 70%. If the soil is already wet enough, watering is skipped.

## Clean Code

1. **Meaningful names:** `refillWaterTank()` and `startDay()` explain what the client can do.
2. **Single responsibility:** each subsystem has its own job; the facade only coordinates them.
3. **Encapsulation:** the facade keeps subsystem objects private and does not return them to the client.
4. **Small methods:** methods contain short steps, such as checking water or setting brightness.
5. **Error handling:** invalid amounts and percentages are rejected. If water is insufficient, watering stops before changing the soil or turning on the light, and `Main` prints the error.

## How to run

Open a terminal in this folder and run with a Java JDK:

```sh
javac *.java
java Main
```

The example adds 500 ml of water, uses 300 ml to reach 60% moisture, turns on the light, and then turns it off.
