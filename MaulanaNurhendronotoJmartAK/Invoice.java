package MaulanaNurhendronotoJmartAK;

import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

/**
 * Praktikum Modul 4 CS
 *
 * @Maulana Nurhendronoto
 */
public abstract class Invoice extends Recognizable
{
    public final Date date;
    public int buyerId;
    public int productId;
    public int complaintId;
    public Rating rating;
    public Status status;
    ArrayList<Record> history;
    public enum Status{
        WAITING_CONFIRMATION, CANCELLED, ON_PROGRESS, ON_DELIVERY, COMPLAINT, FINISHED, FAILED
    }
    public enum Rating{
        NONE, BAD, NEUTRAL, GOOD
    }
    
    protected Invoice(int buyerId, int productId)
    {
        this.buyerId = buyerId;
        this.productId = productId;
        this.complaintId = -1;
        this.date = new Date();
        rating = Rating.NONE;
        status = Status.WAITING_CONFIRMATION;
    }
    
    public abstract double getTotalPay();
    
    public class Record
    {
        public Status status;
        public Date date;
        public String message;   
    }

}
