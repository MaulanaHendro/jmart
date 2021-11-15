package MaulanaNurhendronotoJmartAK;

import java.util.ArrayList;
import java.util.Date;

/**
 * Write a description of class Payment here.
 *
 * @Maulana Nurhendronoto
 */

public class Payment extends Invoice
{
    public Shipment shipment;
    public int productCount;
    public ArrayList<Record> history;

    public Payment(int buyerId, int productId, int productCount, Shipment shipment)
    {
        super(buyerId, productId);
        this.shipment = shipment;
        this.productCount = productCount;
    }

    @Override
    public double getTotalPay(Product product) 
    {
        return product.discount * product.price;
    }

    public class Record {
        public final Date date;
        public String massage;
        public Status status;


        public Record(Status status, String massage)
        {
            date = java.util.Calendar.getInstance().getTime();
            this.status = status;
            this.massage = massage;
        }

    }
}
