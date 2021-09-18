package MaulanaNurhendronotoJmartAK;


/**
 * Jmart Praktikum Modul 2.
 *
 * @Maulana Nurhendronoto 2006577542
 * @version (a version number or a date)
 */
public class ProductRating
{
    private long total;
    private long count;
    
    public ProductRating(){
        this.total = 0;
        this.count = 0;
    }
    
    public void insert(int rating){
        this.total += rating;
        this.count++;
    }
    
    public double getAverage(){
        if(count == 0){
            System.out.printf("Error");
        }
        {
            return (double) total/count;
        }
       
    }
    
    public long getCount(){
        return this.count;
    }
    
    public long getTotal(){
        return this.total;
    }
}
