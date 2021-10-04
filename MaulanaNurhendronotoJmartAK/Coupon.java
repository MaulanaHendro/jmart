package MaulanaNurhendronotoJmartAK;


/**
 * Praktikum Modul 2 Post Test
 *
 * @Maulana Nurhendronoto (2006577542)
 * @version (a version number or a date)
 */
public class Coupon extends Recognizable
{
    public final String name;
    public final int code;
    public final double cut;
    public final Type type;
    public final double minimum;
    private boolean used;
    public enum Type{
        DISCOUNT, REBATE
    }
    
    public Coupon(int id, String name, int code, Type type, double cut, double minimum)
    {
        super(id);
        this.name = name;
        this.code = code;
        this.type = type;
        this.cut = cut;
        this.minimum = minimum;
        used = false;
    }
    
    public boolean isUsed()
    {
        return used;
    }
    
    public boolean canApply(PriceTag priceTag)
    {
       if(priceTag.getAdjustedPrice() >= minimum && (used = false))
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
        used = true;
        return priceTag.getAdjustedPrice() - cut;
    }
}
