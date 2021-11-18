package com.MaulanaNurhendronotoJmartAK;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Write a description of class Complaint here.
 *
 * @author Maulana Nurhendronoto
 * @version (a version number or a date)
 */
public class Complaint extends Seriazible
{
    public String desc;
    public Date date;
    
    public Complaint(String desc)
    {
        this.desc = desc;
        this.date = new Date();
    }
    
    public String toString()
    {
        SimpleDateFormat SDformat = new SimpleDateFormat("dd/MM/yyyy");
        String formatDate = SDformat.format(this.date);
        String date = "Complaint{date=" +formatDate+ ",";
        String desc = "desc='" + this.desc + "'";
        
        return date+desc;
    }
    
}
