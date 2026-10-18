public class Soil
{
    private static final int WATER_PER_PERCENT_ML = 10;

    private int moistureLevel = 30;

    public int getRequiredWater(int targetMoisture)
    {
        if (targetMoisture < 0 || targetMoisture > 100)
        {
            throw new IllegalArgumentException("Moisture must be between 0 and 100");
        }

        return Math.max(0, targetMoisture - moistureLevel) * WATER_PER_PERCENT_ML;
    }

    public void absorbWater(int amountMl)
    {
        if (amountMl <= 0)
        {
            throw new IllegalArgumentException("Water amount must be positive");
        }

        moistureLevel = Math.min(100, moistureLevel + amountMl / WATER_PER_PERCENT_ML);
        System.out.println("Soil moisture: " + moistureLevel + "%");
    }

    public int getMoistureLevel()
    {
        return moistureLevel;
    }
}
