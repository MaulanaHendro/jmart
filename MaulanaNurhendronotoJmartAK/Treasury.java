package MaulanaNurhendronotoJmartAK;


/**
 * Jmart Praktikum Modul 2
 *
 * @author Maulana Nurhendronoto (2006577543)
 * @version (a version number or a date)
 */
//+ public, - private, _ static
//constructor = cetakan kue

public class Treasury
{
    public static double COMMISSION_MULTIPLIER = 0.05;
    public static double BOTTOM_PRICE = 20000.0;
    public static double BOTTOM_FEE= 1000.0;


    public double getAdjustedPrice(double price, double discount)
    {
        return getDiscountedPrice(price, discount) + getAdminFee(price, discount);
    }
    
    public double getAdminFee(double price, double discount)
    {
        if(getAdjustedPrice(price, discount) < BOTTOM_PRICE)
        {
            return COMMISSION_MULTIPLIER * getDiscountedPrice(price, discount);
        }
        else
        {
            return BOTTOM_FEE;
        }
    }
    
    private double getDiscountedPrice(double price, double discount)
    {
        if(discount > 100.0)
        {
            return 100.0;
        }
        else if(discount == 100.0)
        {
            return 0.0;
        }
        else
        {
            return (double)(price - (discount*price));
        }
    }
}
