package inheritance;
public class PlatinumPackage extends PremiumPackage
{
    public PlatinumPackage(int nights)
    {
        super(nights);
    }

    @Override
    public String getResort()
    {
        return "Spa Spectacular Resort";
    }

    @Override
    public double getCostPerNight()
    {
        return 200.00;
    }
    
    @Override
    public String getMealPlan()
    {
        return "Breakfast, Lunch, and Dinner";
    }
}