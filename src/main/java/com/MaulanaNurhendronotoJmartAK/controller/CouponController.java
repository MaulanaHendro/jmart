package com.MaulanaNurhendronotoJmartAK.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MaulanaNurhendronotoJmartAK.Algorithm;
import com.MaulanaNurhendronotoJmartAK.Coupon;
import com.MaulanaNurhendronotoJmartAK.dbjson.JsonAutowired;
import com.MaulanaNurhendronotoJmartAK.dbjson.JsonTable;

@RestController
@RequestMapping("/coupon")
public class CouponController implements BasicGetController<Coupon>
{
	@JsonAutowired(value = Coupon.class, filepath = "C:\\Users\\USER\\Documents\\Hendro\\Java Programming BlueJ\\jmart\\coupon.json")
	public static JsonTable<Coupon> couponTable;
	
	public JsonTable<Coupon> getJsonTable()
	   {
	       return couponTable;
	   }
	
	@GetMapping("/{id}/isUsed")
	public boolean isUsed(int id)
	{
		for(Coupon coupon : getJsonTable())
		{
			if(coupon.id == id)
			{
				return coupon.isUsed();
			}
		}
		return false;
	}
	
	@GetMapping("/{id}/canApply")
	public boolean canApply(@RequestParam int id, @RequestParam double price, @RequestParam double discount)
	{
		for(Coupon coupon : getJsonTable())
		{
			if(coupon.id == id)
			{
				return coupon.canApply(price, discount);
			}
		}
		return false;
	}
	
	
	public List<Coupon> getAvailable(int page, int pageSize)
	{
		return Algorithm.paginate(couponTable, page, pageSize, pred->!pred.isUsed());
	}
}
