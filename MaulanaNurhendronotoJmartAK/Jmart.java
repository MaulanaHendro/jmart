package MaulanaNurhendronotoJmartAK;


/**
 * JMart Praktikum Modul 1, 2
 *
 * @author Maulana Nurhendronoto (2006577542)
 * @
 */
public class Jmart
{
    public static void main(String args[]){ 
        
    }
    
    /*public static Product create()
    {
        return new Product("Sepeda", 100, true, new PriceTag(100.0), ProductCategory.AUTOMOTIVE);
    }*/
    
    public static Product createProduct()
    {
        return null;
    }
    
    public static Coupon createCoupon()
    {
        return null;
    }
    
    public static ShipmentDuration createShipmentDuration()
    {
        return null;
    }
        
    
   /* public static int getPromo(){
        return 0;
    }
    
    public static String getCustomer(){
        return "oop";
    }
    
    public static float getDiscountPercentage(int before, int after){
        if(before < after)
        {
            return 0.0f;
        }
        int cut = before - after;
        return (100.0f * cut)/before;
    }
    
    public static int getDiscountedPrice(int price, float discountPercentage){
        if(discountPercentage >= 100.0f){
            return 0;
        }
        else return price - (int) ((price *  discountPercentage)/100.0f);
    }
    
    public static int getOriginalPrice(int discountedPrice, float discountPercentage){
        float divider = 100.0f - discountPercentage;
        return (int) (100 * discountedPrice/divider);
    }
    
    public static float getCommissionMultiplier(){
        return 0.05f;
    }
    
    public static int getAdjustedPrice(int price){
        return  price + (int) (price * 0.05);
    }
    
    public static int getAdminFee(int price){
        return (int) (0.05 * price);
    }*/
}
