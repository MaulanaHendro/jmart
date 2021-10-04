package MaulanaNurhendronotoJmartAK;

import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

/**
 * Praktikum Modul 4 CS
 *
 * @Maulana Nurhendronoto
 */
public abstract class Invoice extends Recognizable implements FileParser
{
    public Date date;
    public int buyerId;
    public int productId;
    public int complaintId;
    public Rating rating;
    public Status status;
    public enum Status{
        WAITING_CONFIRMATION, CANCELLED, ON_PROGRESS, ON_DELIVERY, COMPLAINT, FINISHED, FAILED
    }
    public enum Rating{
        NONE, BAD, NEUTRAL, GOOD
    }
    
    protected Invoice(int id, int buyerId, int productId)
    {
        super(id);
        this.buyerId = buyerId;
        this.productId = productId;
        this.complaintId = -1;
        this.date = new Date();
        rating = Rating.NONE;
        status = Status.WAITING_CONFIRMATION;
    }
    
    @Override
    public boolean read(String content)
    {
        return false;
    }
    
    public abstract double getTotalPay();
    
    public class Record
    {
        public Status status;
        public Date date;
        public String message;
        
        ArrayList<Record> history = new ArrayList<Record>();
        
    }

}
