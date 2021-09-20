package MaulanaNurhendronotoJmartAK;


/**
 * Praktikum Modul 2 Post Test
 *
 * @Maulana Nurhendronoto (2006577542)
 * @version (a version number or a date)
 */
public class Coupon
{
    public String name;
    public int code;
    public double cut;
    public Type type;
    public double minimum;
    private boolean used;
    public enum Type{
        DISCOUNT, REBATE
    }
    
    public Coupon(String name, int code, Type type, double minimum, double cut)
    {
        this.name = name;
        this.code = code;
        this.type = type;
        this.minimum = minimum;
        this.cut = cut;
        this.used = false;
    }
    
    public boolean isUsed()
    {
        return this.used;
    }
    
    public boolean canApply(PriceTag priceTag)
    {
        if(priceTag.getAdjustedPrice() > this.minimum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public double apply(PriceTag priceTag)
    {
        this.used = true;
        return priceTag.getAdjustedPrice() - cut;
    }
}
