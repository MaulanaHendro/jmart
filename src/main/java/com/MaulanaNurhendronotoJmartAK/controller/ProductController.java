package com.MaulanaNurhendronotoJmartAK.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MaulanaNurhendronotoJmartAK.Jmart;
import com.MaulanaNurhendronotoJmartAK.Payment;
import com.MaulanaNurhendronotoJmartAK.Product;
import com.MaulanaNurhendronotoJmartAK.ProductCategory;
import com.MaulanaNurhendronotoJmartAK.dbjson.JsonAutowired;
import com.MaulanaNurhendronotoJmartAK.dbjson.JsonTable;

@RestController
@RequestMapping("/product")
public class ProductController implements BasicGetController<Product>
{
	@JsonAutowired(value = Product.class, filepath = "C:\\Users\\USER\\Documents\\Hendro\\Java Programming BlueJ\\jmart\\product.json")
	public static JsonTable<Product> productTable;
	
	@Override
	public JsonTable<Product> getJsonTable() 
	{
		return productTable;
	}
	
	@PostMapping("/create")
	Product create
	(
			@RequestParam int accountId,
			@RequestParam String name,
			@RequestParam int weight,
			@RequestParam boolean conditionUsed,
			@RequestParam double price,
			@RequestParam double discount,
			@RequestParam ProductCategory category,
			@RequestParam byte shipmentPlans
	)
	{
		for(Product each : productTable)
		{
			if(each.accountId == accountId)
			{
				Product product = new Product(accountId, name, weight, conditionUsed, price, discount, category, shipmentPlans);
				productTable.add(product);
				return product;
			}
		}
		return null;
	}
	
	@PostMapping("/{id}/store")
	List<Product> getproductByStore(@RequestParam int id, @RequestParam int page, @RequestParam int pageSize)
	{
		return null;
	}
	
	@GetMapping("/getFiltered")
	List<Product> getProductFiltered
	(
			@RequestParam int page,
			@RequestParam int pageSize,
			@RequestParam int accountId,
			@RequestParam String search,
			@RequestParam int minPrice,
			@RequestParam int maxPrice,
			@RequestParam ProductCategory category
	)
	{
		return null;
		
	}
	
	


}
