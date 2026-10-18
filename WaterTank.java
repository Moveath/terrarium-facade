public class WaterTank
{
    private int waterAmountMl;

    public void refill(int amountMl)
    {
        if (amountMl <= 0)
        {
            throw new IllegalArgumentException("Water amount must be positive");
        }

        waterAmountMl += amountMl;
        System.out.println("Added " + amountMl + " ml to the water tank");
    }

    public void useWater(int amountMl)
    {
        if (amountMl <= 0)
        {
            throw new IllegalArgumentException("Water amount must be positive");
        }

        if (amountMl > waterAmountMl)
        {
            throw new IllegalStateException("Not enough water in the tank");
        }

        waterAmountMl -= amountMl;
        System.out.println("Water left in the tank: " + waterAmountMl + " ml");
    }

    public int getWaterAmountMl()
    {
        return waterAmountMl;
    }
}
