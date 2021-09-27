package MaulanaNurhendronotoJmartAK;


/**
 * Write a description of class Complaint here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Complaint extends Recognizable implements FileParser
{
   public int paymentId;
   public String desc;
   public String date;
   
   /*public Complaint(int id, Payment payment, String desc)
   {
       
   }*/
   public Complaint(int id, int buyerId, int storeId, int paymentId, String desc)
   {
       super(id);
       this.paymentId = paymentId;
       this.desc = desc;
       //super(buyerId;
       //this.storeId = storeId;
   }
   
   /*public Complaint(int id, String desc)
   {
       date = "27092021";
       this.desc = desc;
       super(id);
   }*/
   public boolean validate()
   {
       return false;
   }
   
   public Transactor perform()
   {
       return null;
   }
   
   public boolean read (String desc)
   {
       return false;
   }
   
}
