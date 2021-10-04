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
       if((recognizable instanceof Recognizable) && ((Recognizable)recognizable).id == id)
       {
           return true;
       }
       else
       {
           return false;
       }
   }
   
   public boolean equals(Recognizable recognizable)
   {
       if(recognizable.id == id)
       {
           return true;
       }
       else
       {
           return false;
       }
   }
}
