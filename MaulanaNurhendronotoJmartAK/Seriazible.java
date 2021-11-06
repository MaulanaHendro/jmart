package MaulanaNurhendronotoJmartAK;

import java.util.HashMap;
import java.util.Map;

//Praktikum Modul 5
//Maulana Nurhendronoto (2006577542)

public abstract class Seriazible implements Comparable<Seriazible>
{
   public int id = 0;
   private static Map<Class<?>, Integer> mapCounter = new HashMap();
   
   protected Seriazible()
   {
	   Integer count = mapCounter.get(getClass());
	   count = count == null ? 0 : count + 1;
	   
	   if(count == null)
	   {
		   mapCounter.put(getClass(), count);
		   this.id = 0;
	   }
	   else
	   {
		   mapCounter.put(getClass(), count + 1);
		   this.id = count + 1;
	   }
   }
   
   public static <T> int setClosingId(Class<T> clazz, int id)
   {
	   if (Class.class.isAssignableFrom(Seriazible.class))
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
	   if(Class.class.isAssignableFrom(Seriazible.class))
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
       if((other instanceof Seriazible) && ((Seriazible)other).id == id)
       {
           return true;
       }
       else
       {
           return false;
       }
   }
   
   public boolean equals(Seriazible other)
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
   
   public int compareto(Seriazible other)
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
public int compareTo(Seriazible o) {
	// TODO Auto-generated method stub
	return 0;
}
}
