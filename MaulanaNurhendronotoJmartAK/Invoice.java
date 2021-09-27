package MaulanaNurhendronotoJmartAK;


/**
 * Praktikum Modul 3 Post Test
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invoice extends Recognizable implements FileParser
{
    String date;
    int buyerId;
    int productId;
    int complaintId;
    Rating rating = Rating.NONE;
    Status status = Status.WAITING_CONFIRMATION;
    public enum Rating{
        NONE, BAD, NEUTRAL, GOOD
    }
    public enum Status{
        WAITING_CONFIRMATION, CANCELLED, ON_PROGRESS, ON_DELIVERY, COMPLAINT, FINISHED, FAILED
    }
    
    protected Invoice(int buyerId, int productId, int complaintId)
    {
        super(buyerId);
        this.productId = productId;
        this.complaintId = complaintId;
    }
    @Override
    public boolean read(String date)
    {
        date = "27092021";
        return false;
    }
    
    public double getTotalPay()
    {
        return 0.0;
           
    }
}
