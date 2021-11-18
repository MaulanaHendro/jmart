package com.MaulanaNurhendronotoJmartAK;

import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

/**
 * Praktikum Modul 4 CS
 *
 * @Maulana Nurhendronoto
 */
public abstract class Invoice extends Seriazible
{
    public final Date date;
    public int buyerId;
    public int productId;
    public int complaintId;
    public Rating rating;
    public Status status;
    
    public static enum Status{
        WAITING_CONFIRMATION,CANCELED, ON_PROGRESS, ON_DELIVERY, COMPLAINT, FINISHED, FAILED;
    }

    public static enum Rating{
        NONE,BAD,NEUTRAL,GOOD;
    }

    protected Invoice(int buyerId, int productId){
        this.buyerId = buyerId;
        this.productId = productId;
        this.date = new Date();
        this.complaintId = 1;
        this.rating = Rating.NONE;
    }

    public abstract double getTotalPay(Product product);
}