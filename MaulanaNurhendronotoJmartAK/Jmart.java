package MaulanaNurhendronotoJmartAK;


/**
 * JMart Praktikum Modul 1
 *
 * @author Maulana Nurhendronoto (2006577542)
 * @version 1.0
 */
public class Jmart
{
    public static void main(String args[]){ //yet to be filled
        
    }
    
    public static int getPromo(){
        return 0;
    }
    
    public static String getCustomer(){
        return "oop";
    }
    
    public static float getDiscountedPercentage(int before, int after){
        if(before < after)
        {
            return 0.0f;
        }
        else return (float) before/(before - after);
    }
    
    public static int getDiscountedPrice(int price, float discountPercentage){
        if(discountPercentage > 100.0f){
            return 0;
        }
        else return price - (price * (int) discountPercentage);
    }
    
    public static int getOriginalPrice(int discountedPrice, float discountPercentage){
        return (100/(100-(int)discountPercentage))*discountedPrice;
    }
    
    public static float getCommissionMultiplier(){
        return 0.05f;
    }
    
    public static int getAdjustedPrice(int price){ //error data type conversion
        return price + (price*0.05);
    }
    
    public static int getAdminFee(int price){ //error data type conversion
        return 0.05*price;
    }
}
