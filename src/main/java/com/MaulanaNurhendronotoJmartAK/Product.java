package com.MaulanaNurhendronotoJmartAK;

import com.MaulanaNurhendronotoJmartAK.dbjson.Serializable;

/**
 * Product Class : 
 * Store the detail of product
 *
 * @author Maulana Nurhendronoto (2006577542)
 */
public class Product extends Serializable
{
    public int accountId;
    public ProductCategory category;
    public boolean conditionUsed;
    public double discount;
    public String name;
    public double price;
    public byte shipmentPlans;
    public int weight;
    
    public Product(int accountId, String name, int weight, boolean conditionUsed, double price, double discount, ProductCategory category, byte shipmentPlans)
    {
    	this.name = name;
        this.weight = weight;
        this.conditionUsed = conditionUsed;
        this.category = category;
        this.accountId = accountId;
        this.price = price;
        this.discount = discount;
        this.shipmentPlans = shipmentPlans;
    }
    
    public String toString()
    {
        String name = "Name: " + this.name + "\n";
        String weight = "Weight: " + this.weight + "\n";
        String conditionUsed = "conditionUsed: " + this.conditionUsed + "\n";
        String category = "category: " + this.category + "\n";
        String accountId = "accountid: " + this.accountId + "\n";
        String price = "price: " + this.price + "\n";
        String discount = "discount: " + this.discount + "\n";
        String shipmentPlans = "shipmentPlans: " + this.shipmentPlans + "\n";
        
        return name+weight+conditionUsed+category+accountId+price+discount+shipmentPlans;
    }
}
