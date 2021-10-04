package MaulanaNurhendronotoJmartAK;


/**
 * Praktikum Modul 3
 *
 * @Maulana Nurhendronoto
 */
public interface Transactor
{
    public boolean validate();
    
    public Invoice perform();
    
    /*public String time;
    public int buyerId;
    public int storeId;
    public Rating rating;
    public enum Rating{
        NONE, BAD, NEUTRAL, GOOD
    }
    
    protected Transaction(int id, int buyerId, int storeId)
    {
        super(id);
        this.buyerId = buyerId;
        this.storeId = storeId; 
    }
    
    protected Transaction(int id, Account buyer, Store store)
    {
        super(id);
        this.buyerId = buyer.id;
        this.storeId = store.id;
    }*/
    
    
    
}