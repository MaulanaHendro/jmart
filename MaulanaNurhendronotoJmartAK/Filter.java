package MaulanaNurhendronotoJmartAK;

import java.util.ArrayList;

/**
 * Praktikum Modul 4 CS
 *
 * @Maulana Nurhendronoto
 */
public class Filter
{
    public static ArrayList<PriceTag> filterPriceTag(PriceTag[] list, double value, boolean less)
    {
        ArrayList<PriceTag> filter = new ArrayList<PriceTag>();
        
        for(PriceTag listItem : list)
        {
            if((listItem.getAdjustedPrice() < value) && (less == true))
            {
                filter.add(listItem);
            }
            else if((listItem.getAdjustedPrice() >= value) && (less == false))
            {
                filter.add(listItem);
            }
        }
        
        return filter;
    }
    
    public static void filterProductRating(ArrayList<ProductRating> list, double value, boolean less)
    {
       ArrayList<ProductRating> filter = new ArrayList<ProductRating>();
       
       for(ProductRating listItem : list)
       {
           if((listItem.getAverage() < value) && (less == true))
           {
               filter.add(listItem);
           }
           else if((listItem.getAverage() >= value) && (less == false))
           {
               filter.add(listItem);
           }
       }
    }
}
