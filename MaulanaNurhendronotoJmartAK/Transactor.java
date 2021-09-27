package MaulanaNurhendronotoJmartAK;


/**
 * Praktikum Modul 3 Post Test
 *
 * @Maulana Nurhendronoto 2006577542
 */

public interface Transactor
{
    public default boolean validate()
    {
        return false;
    }
    
    public default Invoice perform()
    {
        return null;
    }
    
}
