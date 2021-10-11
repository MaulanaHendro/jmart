package MaulanaNurhendronotoJmartAK;

import java.util.Iterator;
import java.util.*;
import java.util.List;

//Praktikum Modul 5
//Maulana Nurhendronoto (2006577542)

public class Algorithm 
{
	/*public static <T> List<T> collect(T[]array, T value)
	{
		
	}
	
	public static <T> List<T> collect(Iterable<T>iterable, T value)
	{
		
	}
	
	public static <T> List<T> collect(Iterator<T>iterator, T value)
	{
		
	}
	
	public static <T> List<T> collect(T[]array, Predicate<T>pred)
	{
		
	}
	
	public static <T> List<T> collect(Iterable<T>iterable, Predicate<T>pred)
	{
		
	}
	
	public static <T> List<T> collect(Iterator<T>iterator, Predicate<T>pred)
	{
		
	}*/
	
	public static <T> int count(T[] array, T value)
	{
		final Iterator<T>i = Arrays.stream(array).iterator();
		return count(i, value);
	}
	
	public static <T> int count(Iterable<T>iterable, T value)
	{
		final Iterator<T>i = iterable.iterator();
		return count(i, value);
	}
	
	public static <T> int count (Iterator<T>iterator, T value)
	{
		final Predicate<T>pred = value::equals;
		return count(iterator, pred);
		
	}
	
	public static <T> int count(T[] array, Predicate<T> pred)
	{
		final Iterator<T>i = Arrays.stream(array).iterator();
		return count(i, pred);
	}
	
	public static <T> int count(Iterable<T>iterable, Predicate<T> pred)
	{
		final Iterator<T>i = iterable.iterator();
		return count(i, pred);
	}
	
	public static <T> int count (Iterator<T>iterator, Predicate<T> pred)
	{
		return count(iterator, pred);
	}
	
	public static <T> boolean exist(T[] array, T value)
	{
		return true;
	}
	
	public static <T> boolean exist(Iterable<T>iterable, T value)
	{
		return false;
	}
	
	public static <T> boolean exist(Iterator<T>iterator, T value)
	{
		return true;
	}
	
	public static<T> boolean exist(T[] array, Predicate<T> pred)
	{
		return false;
	}
	
	public static <T> boolean exist(Iterable<T>iterable, Predicate<T>pred)
	{
		return true;
	}
	
	public static <T> boolean exist(Iterator<T>iterator, Predicate<T>pred)
	{
		return false;
	}
	
	public static <T> T find(T[] array, T value)
	{
		return null;
	}
	
	public static <T> T find(Iterable<T>iterable, T value)
	{
		return null;
	}
	
	public static <T> T find(Iterator<T>iterator, T value)
	{
		return null;
	}
	
	public static <T> T find(T[] array, Predicate<T> pred)
	{
		return null;
	}
	
	public static <T> T find(Iterable<T>iterable, Predicate<T>pred)
	{
		return null;
	}
	
	public static <T> T find(Iterator<T>iterator, Predicate<T>pred)
	{
		return null;
	}
	
	public static <T> T max(T first, T second)
	{
		if(first.hashCode() > second.hashCode())
		{
			return first;
		}
		else
		{
			return second;
		}
	}
	
	public static <T> T max(T[]array)
	{
		return null;
	}
	
	public static <T> T max(Iterator<T>iterator, T value)
	{
		if(iterator.next().hashCode() > value.hashCode())
		{
			return iterator.next();
		}
		else
		{
			return value;
		}
	}
	
	public static <T> T max(Iterable<T>iterable, T value)
	{
		if(iterable.hashCode() > value.hashCode())
		{
			return  (T) iterable;
		}
		else
		{
			return value;
		}
	}
	
	/*public static <T> T max(T first, T second, Comparator<?superT>comparator)
	{
		
	}*/
	
	/*public static <T> T max(T[]array, Comparator<?superT>comparator)
	{
		
	}*/

	public static <T> T min(T first, T second)
	{
		if(first.hashCode() < second.hashCode())
		{
			return first;
		}
		else
		{
			return second;
		}
	}
	
	public static <T> T min(T[]array)
	{
		return null;
	}
	
	public static <T> T min(Iterator<T>iterator, T value)
	{
		if(iterator.next().hashCode() > value.hashCode())
		{
			return iterator.next();
		}
		else
		{
			return value;
		}
	}
	

	
}
