# Terrarium Facade

Assignment 4 for Software Design Patterns.

## About

This Java console program uses the Facade pattern to take care of a terrarium.

The subsystem has four classes:

- `WaterTank` stores water and checks that there is enough for watering.
- `Soil` tracks moisture and calculates how much water is needed.
- `WateringSystem` takes water from the tank and waters the soil.
- `LightingSystem` controls the light brightness from 0 to 100%.

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
javac -d bin *.java
java -cp bin Main
```

Expected output:

```text
Added 500 ml to the water tank
Starting terrarium care
Water left in the tank: 200 ml
Soil moisture: 60%
Plants watered with 300 ml of water
Terrarium light brightness: 70%
Terrarium light is off
```
