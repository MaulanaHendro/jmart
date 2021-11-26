package com.MaulanaNurhendronotoJmartAK.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.MaulanaNurhendronotoJmartAK.Account;
import com.MaulanaNurhendronotoJmartAK.ObjectPoolThread;
import com.MaulanaNurhendronotoJmartAK.Payment;
import com.MaulanaNurhendronotoJmartAK.Product;
import com.MaulanaNurhendronotoJmartAK.Shipment;
import com.MaulanaNurhendronotoJmartAK.dbjson.JsonAutowired;
import com.MaulanaNurhendronotoJmartAK.dbjson.JsonTable;

@RestController
@RequestMapping("/payment")
public class PaymentController implements BasicGetController<Payment>
{
	public static final long DELIVERED_LIMIT_MS = 1;
	public static final long ON_DELIVERY_LIMIT_MS = 2;
	public static final long ON_PROGRESS_LIMIT_MS = 3;
	public static final long WAITING_CONF_LIMIT_MS = 4;
	
	@JsonAutowired(value = Payment.class, filepath = "C:\\Users\\USER\\Documents\\Hendro\\Java Programming BlueJ\\jmart\\payment.json")
	public static JsonTable<Payment> paymentTable;
	public static ObjectPoolThread<Payment> poolThread;
	
	@PostMapping("/{id}/cancel")
	boolean accept(@RequestParam int id)
	{
		return false;
	}
	
	@PostMapping("/{id}/cancel")
	public boolean cancel(@RequestParam int id)
	{
		return true;
	}
	
	@PostMapping("/create")
	@ResponseBody Payment create(@RequestParam int buyerId, @RequestParam int productId, @RequestParam int productCount, @RequestParam String shipmentAddress, @RequestParam byte shipmentPlan)
	{
		for(Account data : AccountController.accountTable)
		{
			if(data.id == buyerId)
			{
				for(Product each : ProductController.productTable)
				{
					if(each.id == productId)
					{
						Payment payment = new Payment(buyerId, productId, productCount, new Shipment(shipmentAddress, 0, shipmentPlan, null));
						if(data.balance >= payment.getTotalPay(each))
						{
							data.balance -= payment.getTotalPay(each);
							paymentTable.add(payment);
							paymentTable.add(payment);
							return payment;
						}
					}
				}
			}
		}
		return null;
	}
	
	@PostMapping("/{id}/submit")
	public boolean submit(@RequestParam int id, @RequestParam String receipt)
	{
		return true;
	}
	
	@Override
	public JsonTable<Payment> getJsonTable()
	{
		return paymentTable;
	}

}
