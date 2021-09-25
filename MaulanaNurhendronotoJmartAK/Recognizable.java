package MaulanaNurhendronotoJmartAK;


/**
 * Praktikum Modul 3
 *
 * @Maulana Nurhendronoto (2006577542)
 * @version (a version number or a date)
 */
public class Recognizable
{
    public final int id;
    
    protected Recognizable(int id)
    {
        this.id = id;
    }
    
    public boolean equals(Object recognizable)
    {
        return (recognizable instanceof Recognizable) && ((Recognizable) recognizable).id == id ;   
    }
    
    public boolean equals(Recognizable recognizable)
    {
        return recognizable.id == id;
    }
    
}
