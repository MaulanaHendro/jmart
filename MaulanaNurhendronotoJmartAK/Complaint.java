package MaulanaNurhendronotoJmartAK;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

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
    public Date date;
    
    public Complaint(int id, String desc)
    {
        super(id);
        this.desc = desc;
        this.date = new Date();
    }
    
    @Override
    public boolean read(String content)
    {
        return false;
    }
    
    public String toString()
    {
        /*Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(date);*/
        String date = "Complaint{date=" +this.date+ ",";
        String desc = "desc='" + this.desc + "'";
        
        return date+desc;
    }
    
}
