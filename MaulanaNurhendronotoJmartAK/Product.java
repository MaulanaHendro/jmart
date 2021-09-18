package MaulanaNurhendronotoJmartAK;


/**
 * Jmart Praktikum Modul 2
 *
 * @Maulana Nurhendronoto (2006577542)
 * @version (a version number or a date)
 */
public class Product
{
    private int idCounter;
    public int id;
    public String name;
    public int weight;
    public boolean conditionUsed;
    public ProductCategory category;
    public PriceTag priceTag;
    public ProductRating rating;
    
    public Product(String name, int id, boolean conditionedUsed, PriceTag priceTag, ProductCategory category)
    {
        this.name = name;
        this.weight = weight;
        this.conditionUsed = conditionedUsed;
        this.priceTag = priceTag;
        this.rating = rating;
        
    }
        
    
    
}
