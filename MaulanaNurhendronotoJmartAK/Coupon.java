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
    
    public Coupon(String name, int code, Type type, double cut, double minimum)
    {
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
    
    public boolean canApply(Treasury treasury)
    {
       if(treasury.getAdjustedPrice(minimum, cut) >= minimum && (used = false))
       {
           return true;
       }
       else
       {
           return false;
       }
    }
    
    public double apply(Treasury treasury)
    {
        used = true;
        return treasury.getAdjustedPrice(minimum, cut) - cut;
    }
}
