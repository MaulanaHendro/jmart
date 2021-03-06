package com.MaulanaNurhendronotoJmartAK;

import java.util.ArrayList;
import java.util.Date;

/**
 * Payment Class : 
 * Store value of shipment, status
 *
 * @author Maulana Nurhendronoto
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
        return (product.discount/100) * product.price;
    }

    public static class Record {
        public final Date date;
        public String message;
        public Status status;


        public Record(Status status, String message)
        {
            date = java.util.Calendar.getInstance().getTime();
            this.status = status;
            this.message = message;
        }

    }
}
