package com.MaulanaNurhendronotoJmartAK;

import java.util.Date;

import com.MaulanaNurhendronotoJmartAK.dbjson.Serializable;

import java.text.SimpleDateFormat;

/**
 * Complaint Class : 
 * Store value of desc and date; 
 * 
 * @author Maulana Nurhendronoto
 */

public class Complaint extends Serializable
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
