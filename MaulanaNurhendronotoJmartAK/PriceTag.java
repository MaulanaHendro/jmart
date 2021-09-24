package MaulanaNurhendronotoJmartAK;


/**
 * Jmart Praktikum Modul 2
 *
 * @author Maulana Nurhendronoto (2006577543)
 * @version (a version number or a date)
 */
//+ public, - private, _ static
//constructor = cetakan kue

public class PriceTag
{
    public static double COMMISSION_MULTIPLIER = 0.05;
    public static double BOTTOM_PRICE = 20000;
    public double BOTTOM_FEE = 1000;
    static double discount;
    static double price;
    
    public PriceTag(double price){
        this.price = price;
        this.discount = 0.0;
    }
    
    public PriceTag(double price, double discount){
        this.price = price;
        this.discount = discount;
    }
    
    public double getAdjustedPrice(){
        return getDiscountedPrice() + getAdminFee();
    }
    
    public double getAdminFee(){
        if(getAdjustedPrice() < BOTTOM_PRICE){
            return BOTTOM_FEE;
        }
        else{
            return getAdjustedPrice() - (COMMISSION_MULTIPLIER*getAdjustedPrice());
            
        }
    }
    
    private double getDiscountedPrice(){
        if(discount >= 100.0){
            return 0;
        }
        else{
            return (double) (price - (discount * price));
        }
    }
}
