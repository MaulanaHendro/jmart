package MaulanaNurhendronotoJmartAK;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.google.gson.*;

/**
 * JMart Praktikum Modul 1, 2, 3, 4
 *
 * @author Maulana Nurhendronoto (2006577542)
 * @
 */
public class Jmart
{
	class Country
	{
		public String name;
		public int population;
		public List<String> listOfStates;
	}
	
	public static void main(String[] args)
	{
		String filepath = "C:\\Users\\USER\\Documents\\Hendro\\Java Programming BlueJ\\jmart\\city.json";
		Gson gson = new Gson();
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(filepath));
			Country input = gson.fromJson(br,  Country.class);
			System.out.println("name: " + input.name);
			System.out.println("population: " + input.population);
			System.out.println("states:");
			input.listOfStates.forEach(state -> System.out.println(state));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
    
	
	
	
	
	
	/*public static void main(String[] args)
    {
        Complaint comp = new Complaint(10, "barang rusak");
        System.out.println(comp.toString());
        
        Account acc = new Account(10, "Maulana", "maulana1@gmail.com", "MangUjang1");
        System.out.println(acc.toString());
        
        System.out.println("Hello from Eclipse!");
    }*/
    
    
    /*public static Product createProduct()
    {
        return new Product("Sepeda", 100, true, new PriceTag(100.0), ProductCategory.AUTOMOTIVE);
    }
    
    public static Coupon createCoupon()
    {
        return null;
    }
    
    public static ShipmentDuration createShipmentDuration()
    {
        return null;
    }*/
    
    /*public static ShipmentDuration createShipmentDuration()
    {
        return null;
    }*/
        
    
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
