public class WateringSystem
{
    private WaterTank waterTank;
    private Soil soil;

    public WateringSystem(WaterTank waterTank, Soil soil)
    {
        this.waterTank = waterTank;
        this.soil = soil;
    }

    public void waterPlants(int targetMoisture)
    {
        int amountMl = soil.getRequiredWater(targetMoisture);

        if (amountMl == 0)
        {
            System.out.println("The soil is already wet enough");
            return;
        }

        waterTank.useWater(amountMl);
        soil.absorbWater(amountMl);
        System.out.println("Plants watered with " + amountMl + " ml of water");
    }
}
