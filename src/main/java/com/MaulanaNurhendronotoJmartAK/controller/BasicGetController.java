package com.MaulanaNurhendronotoJmartAK.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.MaulanaNurhendronotoJmartAK.dbjson.JsonTable;
import com.MaulanaNurhendronotoJmartAK.dbjson.Serializable;
@RestController
@RequestMapping

public interface BasicGetController<T extends Serializable> 
{
	@GetMapping("/{id}")
	public default @ResponseBody T getById(int id)
	{
		for(T myObj : getJsonTable())
		{
			if(myObj.id == 1)
			{
				return myObj;
			}
		}
		return null;
	}
	
	public abstract JsonTable<T> getJsonTable();
	
	@GetMapping("/page")
	public default List<T> getPage(int page, int pageSize)
	{
		return getJsonTable().subList(page, pageSize);
	}

}
