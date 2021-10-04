package MaulanaNurhendronotoJmartAK;

import MaulanaNurhendronotoJmartAK.Shipment.MultiDuration;

/**
 * Jmart Praktikum Modul 2
 *
 * @Maulana Nurhendronoto (2006577542)
 * @version (a version number or a date)
 */
public class Product extends Recognizable implements FileParser
{
    public String name;
    public int weight;
    public boolean conditionUsed;
    public PriceTag priceTag;
    public ProductCategory category;
    public ProductRating rating;
    public int storeId;
    public MultiDuration multiDuration;
    
    public Product(int id, int storeId, String name, int weight, boolean conditionUsed, PriceTag priceTag, ProductCategory category, MultiDuration multiDuration)
    {
        super(id);
        this.storeId = storeId;
        this.name = name;
        this.weight = weight;
        this.conditionUsed = conditionUsed;
        this.priceTag = priceTag;
        this.category = category;
        this.rating = new ProductRating();
        this.multiDuration = multiDuration;
    }
    
    @Override
    public boolean read(String name)
    {
        return false;
    }
    
    public String toString()
    {
        String name = "Name: " + this.name + "\n";
        String weight = "Weight: " + this.weight + "\n";
        String conditionUsed = "conditionUsed: " + this.conditionUsed + "\n";
        String priceTag = "priceTag: " + this.priceTag + "\n";
        String category = "category: " + this.category + "\n";
        String rating = "Weight: " + this.rating + "\n";
        String storeId = "Weight: " + this.storeId + "\n";
        
        return name+weight+conditionUsed+priceTag+category+rating+storeId;
    }
}
