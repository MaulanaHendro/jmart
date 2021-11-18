package com.MaulanaNurhendronotoJmartAK;

import java.util.Iterator;
import java.util.Arrays;
import java.util.*;
import java.util.List;
import java.util.Comparator;

//Praktikum Modul 5
//Maulana Nurhendronoto (2006577542)

public class Algorithm 
{
	private Algorithm()
	{
		
	}
	public static <T> List<T> collect(T[]array, T value)
	{
		final Iterator<T>iter = Arrays.stream(array).iterator();
		return collect(iter, value);
	}
	
	public static <T> List<T> collect(Iterable<T>iterable, T value)
	{
		final Iterable<T>iter = (Iterable<T>) iterable.iterator();
		return collect(iter, value);
	}
	
	public static <T> List<T> collect(Iterator<T>iterator, T value)
	{
		final Predicate<T> predicate = value::equals;
		return collect(iterator, value);
	}
	
	public static <T> List<T> collect(T[]array, Predicate<T>pred)
	{
		final Iterator<T>iter = Arrays.stream(array).iterator();
		return collect(iter, pred);
	}
	
	public static <T> List<T> collect(Iterable<T>iterable, Predicate<T>pred)
	{
		return null;
	}
	
	public static <T> List<T> collect(Iterator<T>iterator, Predicate<T>pred)
	{
		int count = 0;
		while(iterator.hasNext())
		{
			count++;
		}
		final Predicate<T>predicate = pred::equals;
		return collect(iterator, pred);
	}
	
	public static <T> int count(T[] array, T value)
	{
		return array.length;
	}
	
	public static <T> int count(Iterable<T>iterable, T value)
	{
		int i = 0;
		for(Object obj : iterable)
		{
			i++;
		}
		return i;
	}
	
	public static <T> int count (Iterator<T>iterator, T value)
	{
		int i = 0;
		while(iterator.hasNext())
		{
			i++;
		}
		return i;
	}
	
	public static <T> int count(T[] array, Predicate<T> pred)
	{
		int i = 0;
		if(pred.equals(false))
		{
			return 0;
		}
		else
		{
			for(T arr : array)
			{
				i++;
			}
		}
		return i;
	}
	
	public static <T> int count(Iterable<T>iterable, Predicate<T> pred)
	{
		int i = 0;
		if(pred.equals(false))
		{
			return 0;
		}
		else
		{
			for(T arr : iterable)
			{
				i++;
			}
		}
		return i;
	}
	
	public static <T> int count (Iterator<T>iterator, Predicate<T> pred)
	{
		int i = 0;
		if(pred.equals(false))
		{
			return 0;
		}
		else
		{
			while(iterator.hasNext())
			{
				i++;
			}
		}
		return i;
	}
	
	public static <T> boolean exist(T[] array, T value)
	{
		for(T arr : array)
		{
			if(arr.equals(value))
			{
				return true;
			}
		}
		return false;
	}
	
	public static <T> boolean exist(Iterable<T>iterable, T value)
	{
		for(T arr : iterable)
		{
			if(arr.equals(value))
			{
				return true;
			}
		}
		return false;
	}
	
	public static <T> boolean exist(Iterator<T>iterator, T value)
	{
		while(iterator.hasNext())
		{
			if(iterator.next().equals(value))
			{
				return true;
			}
		}
		return false;
	}
	
	public static<T> boolean exist(T[] array, Predicate<T> pred)
	{
		for(T arr : array)
		{
			if(arr.equals(pred))
			{
				return true;
			}
		}
		return false;
	}
	
	public static <T> boolean exist(Iterable<T>iterable, Predicate<T>pred)
	{
		for(T arr : iterable)
		{
			if(arr.equals(pred))
			{
				return true;
			}
		}
		return false;
	}
	
	public static <T> boolean exist(Iterator<T>iterator, Predicate<T>pred)
	{
		while(iterator.hasNext())
		{
			if(iterator.next().equals(pred))
			{
				return true;
			}
		}
		return false;
	}
	
	public static <T> T find(T[] array, T value)
	{
		for(T arr : array)
		{
			if(arr.equals(value))
			{
				return arr;
			}
		}
		return null;
	}
	
	public static <T> T find(Iterable<T>iterable, T value)
	{
		for(T arr : iterable)
		{
			if(arr.equals(value))
			{
				return arr;
			}
		}
		return null;
	}
	
	public static <T> T find(Iterator<T>iterator, T value)
	{
		while(iterator.hasNext())
		{
			if(iterator.next().equals(value))
			{
				return iterator.next();
			}
		}
		return null;
	}
	
	public static <T> T find(T[] array, Predicate<T> pred)
	{
		for(T arr : array)
		{
			if(arr.equals(pred))
			{
				return arr;
			}
		}
		return null;
	}
	
	public static <T> T find(Iterable<T>iterable, Predicate<T>pred)
	{
		for(T arr : iterable)
		{
			if(arr.equals(pred))
			{
				return arr;
			}
		}
		return null;
	}
	
	public static <T> T find(Iterator<T>iterator, Predicate<T>pred)
	{
		while(iterator.hasNext())
		{
			if(iterator.next().equals(pred))
			{
				return iterator.next();
			}
		}
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
		int max = 0;
		T maxT = null;
		for(T t : array)
		{
			if(t.hashCode() > max)
			{
				max = t.hashCode();
				maxT = t;
			}
		}
		return maxT;
	}
	
	public static <T> T max(Iterable<T>iterable)
	{
		int max = 0;
		T maxT = null;
		for(T t : iterable)
		{
			if(t.hashCode() > max)
			{
				max = t.hashCode();
				maxT = t;
			}
		}
		return maxT;
	}
	
	public static <T> T max(Iterator<T>iterator)
	{
		int max = 0;
		T maxT = null;
		while(iterator.hasNext())
		{
			if(iterator.next().hashCode() > max)
			{
				max = iterator.next().hashCode();
				maxT = iterator.next();
			}
		}
		return maxT;
	}
	
	public static <T> T max(T first, T second, Comparator<? super T>comparator)
	{
		int result = ((Comparable<T>)first).compareTo(second);
		return result <-1? second : first;
	}
	
	public static <T> T max(T[]array, Comparator<? super T>comparator)
	{
		return null;
	}
	
	public static <T> T max(Iterable<T>iterable, Comparator<? super T>comparator)
	{
		T maxT = null;
		for(T t : iterable)
		{
			if(((Comparable<T>)maxT).compareTo(t) < 0)
			{
				maxT = t;
			}
		}
		return maxT;
	}
	
	public static <T> T max(Iterator<T>iterator, Comparator<? super T>comparator)
	{
		return null;
	}

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
		int min = array[0].hashCode();
		T minT = null;
		for (T t : array)
		{
			if(t.hashCode() > min)
			{
				min = t.hashCode();
				minT = t;
			}
		}
		return minT;
	}
	
	public static <T> T  min(Iterable<T>iterable)
	{
		int min = iterable.hashCode();
		T minT = null;
		for(T t : iterable)
		{
			if(t.hashCode() > min)
			{
				min = t.hashCode();
				minT = t;
			}
		}
		return minT;
	}
	
	public static <T> T min(Iterator<T>iterator)
	{
		int min = iterator.next().hashCode();
		T minT = null;
		while(iterator.hasNext())
		{
			if(iterator.next().hashCode() > min)
			{
				min = iterator.next().hashCode();
				minT = iterator.next();
			}
		}
		return minT;
	}
	
	public static <T> T min(T first, T second, Comparator<? super T>comparator)
	{
		int result = ((Comparable<T>)first).compareTo(second);
		return result <-1? second : first;
	}
	
	public static <T> T min(T[] array, Comparator<? super T>comparator)
	{
		return null;
	}
	
	public static <T> T min(Iterable<T>iterable, Comparator<? super T>comparator)
	{
		T minT = null;
		for(T t : iterable)
		{
			if(((Comparable<T>)minT).compareTo(t) > 0)
			{
				minT = t;
			}
		}
		return minT;
	}
	
	public static <T> T min(Iterator<T>iterator, Comparator<? super T>comparator)
	{
		return null;
	}
		
}
