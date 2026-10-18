public class TerrariumFacade
{
    private static final int TARGET_MOISTURE = 60;
    private static final int DAY_BRIGHTNESS = 70;

    private WaterTank waterTank;
    private WateringSystem wateringSystem;
    private LightingSystem lightingSystem;

    public TerrariumFacade()
    {
        waterTank = new WaterTank();
        Soil soil = new Soil();
        wateringSystem = new WateringSystem(waterTank, soil);
        lightingSystem = new LightingSystem();
    }

    public void refillWaterTank(int amountMl)
    {
        waterTank.refill(amountMl);
    }

    public void startDay()
    {
        System.out.println("Starting terrarium care");
        wateringSystem.waterPlants(TARGET_MOISTURE);
        lightingSystem.setBrightness(DAY_BRIGHTNESS);
    }

    public void endDay()
    {
        lightingSystem.setBrightness(0);
    }
}
