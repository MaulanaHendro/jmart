package MaulanaNurhendronotoJmartAK;


/**
 * Jmart Praktikum Modul 2
 *
 * @Maulana Nurhendronoto (2006577542)
 * @version (a version number or a date)
 */
public class Product extends Recognizable
{
    private static int idCounter = 0;
    public String name;
    public int weight;
    public boolean conditionUsed;
    public ProductCategory category;
    public PriceTag priceTag;
    public ProductRating rating;
    public int storeId;
    
    public Product(int weight, int storeId, String name, int id, boolean conditionedUsed, PriceTag priceTag, ProductCategory category)
    {
        super(id);
        this.name = name;
        this.weight = weight;
        this.conditionUsed = conditionedUsed;
        this.priceTag = priceTag;
        this.rating = new ProductRating();
        this.storeId = storeId;
        
    }
    
    public Product(int id, Store store, String name, int weight, boolean conitionUsed, PriceTag priceTag, ProductCategory category)
    {
        super(id);
        this.name = name;
        this.weight = weight;
        this.conditionUsed = conditionUsed;
        this.priceTag = priceTag;
        this.rating = new ProductRating();
        this.storeId = store.id;
        
    }
    
    public boolean read (String name)
    {
        return false;
    }
     
    
    
}
