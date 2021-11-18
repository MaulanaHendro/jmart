package com.MaulanaNurhendronotoJmartAK;

public class Pair <T, U>
{
	public T first;
	public U second;
	
	public Pair()
	{
		first = null;
		second = null;
	}
	
	public Pair(T first, U second)
	{
		this.first = first;
		this.second = second;
	}
}