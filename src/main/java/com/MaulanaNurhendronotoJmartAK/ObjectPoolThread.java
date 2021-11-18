package com.MaulanaNurhendronotoJmartAK;

import java.util.Vector;
import java.util.function.Function;

public class ObjectPoolThread<T> extends Thread 
{
	private boolean exitSignal;
	private Vector<T> objectPool;
	private Function<T, Boolean> routine;

	public ObjectPoolThread(String name, Function<T, Boolean>routine)
	{
		super(name);
		this.routine = routine;
	}
	
	public ObjectPoolThread(Function<T, Boolean>routine)
	{
		this.routine = routine;
	}
	
	public void add(T object)
	{
		objectPool.add(object);	
	}
	
	public void exit()
	{
		
	}
	
	public void run()
	{
		while(exitSignal == false)
		{
			if(objectPool.isEmpty())
			{
				try
				{
					Thread.class.wait();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
					
				}
			}
			else
			{
				for(T object : objectPool)
				{
					if(routine.apply(object) == true)
					{
						objectPool.remove(object);
					}
					else
					{
						continue;
					}
				}
			}
		}
	}
	
	public int size()
	{
		return objectPool.size();
		
	}

}
