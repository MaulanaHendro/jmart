package MaulanaNurhendronotoJmartAK;


/**
 * Write a description of class Payment here.
 *
 * @Maulana Nurhendronoto
 */
public class Payment extends Invoice implements Transactor
{
    public int productCount;
    public Shipment shipment;
    
    
    public Payment(int id, int buyerId, int storeId, int productId, Shipment shipment)
    {
        super(id, buyerId, storeId);
        this.productId = productId;
        this.shipment = shipment;
    }
    
    @Override
    public double getTotalPay()
    {
        return 0.0;
    }
    
    @Override
    public boolean validate()
    {
        return false;
    }
    
    @Override
    public Invoice perform()
    {
        return null;
    }
}
