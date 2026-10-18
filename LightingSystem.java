public class LightingSystem
{
    private int brightness;

    public void setBrightness(int brightness)
    {
        if (brightness < 0 || brightness > 100)
        {
            throw new IllegalArgumentException("Brightness must be between 0 and 100");
        }

        this.brightness = brightness;

        if (brightness == 0)
        {
            System.out.println("Terrarium light is off");
        }
        else
        {
            System.out.println("Terrarium light brightness: " + brightness + "%");
        }
    }

    public int getBrightness()
    {
        return brightness;
    }
}
