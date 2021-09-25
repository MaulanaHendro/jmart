package MaulanaNurhendronotoJmartAK;


/**
 * Praktikum Modul 3
 *
 * @Maulana Nurhendronoto (2006577542)
 * @version (a version number or a date)
 */
public interface FileParser
{
    public boolean read(String content);
    
    public default Object write()
    {
        return null;
    }
    
    public default Object newInstance(String content)
    {
        return null;
    }
    
    
      
    
    
}
