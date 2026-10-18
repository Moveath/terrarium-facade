public class Main
{
    public static void main(String[] args)
    {
        TerrariumFacade terrarium = new TerrariumFacade();

        try
        {
            terrarium.refillWaterTank(500);
            terrarium.startDay();
            terrarium.endDay();
        }
        catch (IllegalStateException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
