package com.MaulanaNurhendronotoJmartAK.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.MaulanaNurhendronotoJmartAK.ObjectPoolThread;
import com.MaulanaNurhendronotoJmartAK.Payment;
import com.MaulanaNurhendronotoJmartAK.dbjson.JsonTable;

@RestController
@RequestMapping("/payment")
public abstract class PaymentController implements BasicGetController<Payment>
{
	public static final long DELIVERED_LIMIT_MS = 0;
	public static final long ON_DELIVERY_LIMIT_MS = 0;
	public static final long ON_PROGRESS_LIMIT_MS = 0;
	public static final long WAITING_CONF_LIMIT_MS = 0;
	public static JsonTable<Payment> paymentTable;
	public static ObjectPoolThread<Payment> poolThread;
	
	public boolean accept(int id)
	{
		return true;
	}
	
	public boolean cancel(int id)
	{
		return true;
	}

}
