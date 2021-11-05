package MaulanaNurhendronotoJmartAK;

//Praktikum Modul 5
//Maulana Nurhendronoto (2006577542)

public class Recognizable implements Comparable<Recognizable>
{
   public final int id;
   
   protected Recognizable(int id)
   {
       this.id = id;
   }
   
   public static <T> int setClosingId(Class<T> clazz, int id)
   {
	   if (Class.class.isAssignableFrom(Recognizable.class))
	   {
		   return 0;
	   }
	   else
	   {
		   return 1;
	   }
   }
   
   public static <T> int getClosingId(Class<T> clazz)
   {
	   if(Class.class.isAssignableFrom(Recognizable.class))
	   {
		   return 0;
	   }
	   else
	   {
		   return 1;
	   }
   }
   
   public boolean equals(Object other)
   {
       if((other instanceof Recognizable) && ((Recognizable)other).id == id)
       {
           return true;
       }
       else
       {
           return false;
       }
   }
   
   public boolean equals(Recognizable other)
   {
       if(other.id == id)
       {
           return true;
       }
       else
       {
           return false;
       }
   }
   
   public int compareto(Recognizable other)
   {
	  if(other.id == id)
	  {
		  return 1;
	  }
	  else
	  {
		  return 0;
	  }
   }

@Override
public int compareTo(Recognizable o) {
	// TODO Auto-generated method stub
	return 0;
}
}
