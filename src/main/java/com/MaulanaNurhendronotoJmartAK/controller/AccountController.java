package com.MaulanaNurhendronotoJmartAK.controller;

import com.MaulanaNurhendronotoJmartAK.Account;
import com.MaulanaNurhendronotoJmartAK.Payment;
import com.MaulanaNurhendronotoJmartAK.Store;
import com.MaulanaNurhendronotoJmartAK.dbjson.JsonAutowired;
import com.MaulanaNurhendronotoJmartAK.dbjson.JsonTable;
import org.springframework.web.bind.annotation.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/account")
public class AccountController implements BasicGetController<Account>
{
	public static final String REGEX_EMAIL = "^\\w+([\\~*_&.]?\\w+)*@\\w+([\\.-]?\\w+)*.?\\w+$";
	public static final String REGEX_PASSWORD = "(?=.*[a-z])(?=.*[A-Z])(?=\\\\S+$).{8,}$";
	public static final Pattern REGEX_PATTERN_EMAIL = Pattern.compile(REGEX_EMAIL);
	public static final Pattern REGEX_PATTERN_PASSWORD = Pattern.compile(REGEX_PASSWORD);
	
	@JsonAutowired(value = Account.class, filepath = "C:\\Users\\USER\\Documents\\Hendro\\Java Programming BlueJ\\jmart\\account.json")
	public static JsonTable<Account> accountTable;
	
	@Override
	public JsonTable<Account> getJsonTable()
	{
		return accountTable;
	}
	
	@GetMapping
	String index() {return "account page";}
	
	@PostMapping("/account/login")
	@ResponseBody Account login(String email, String password)
	{
		String encryptedPassword = null;
		try
		{
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(password.getBytes());
			byte[] digest = md.digest();
			StringBuilder sb = new StringBuilder();
			for(byte someByte : digest)
			{
				sb.append(Integer.toString((someByte & 0xff) + 0x100,16).substring(1));
			}
			
			encryptedPassword = sb.toString();
		}
		
		catch(NoSuchAlgorithmException e)
		{
			e.printStackTrace();
		}
		
		for(Account each : accountTable)
		{
			if(each.email == email && each.password == password)
			{
				return each;
			}
		}
		return null;
	}
	
	@PostMapping("/register")
	Account Register
	(
			@RequestParam String name,
			@RequestParam String email,
			@RequestParam String password
	)
	{
		String encryptedPassword = null;
		try
		{
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(password.getBytes());
			byte[] digest = md.digest();
			StringBuilder sb = new StringBuilder();
			for(byte someByte : digest)
			{
				sb.append(Integer.toString((someByte & 0xff) + 0x100,16).substring(1));
			}
			
			encryptedPassword = sb.toString();
		}
		
		catch(NoSuchAlgorithmException e)
		{
			e.printStackTrace();
		}
		
		Account newAccount = new Account(name, email, encryptedPassword, 0);
		
		if(!name.isBlank())
		{
			if(REGEX_PATTERN_EMAIL.matcher(email).matches() && REGEX_PATTERN_PASSWORD.matcher(password).matches())
			{
				for(Account account : getJsonTable())
				{
					if(account.email.equals(email))
					{
						break;
					}
					accountTable.add(account);
					return newAccount;
				}
			}
		}
		return null;
	}
	
	@PostMapping("/{id}/registerStore")
	Store RegisterStore
	(
			@RequestParam int id,
			@RequestParam String name,
			@RequestParam String address,
			@RequestParam String phoneNumber
	)
	{
		for(Account data : accountTable)
		{
			if(data.store == null && data.id == id)
			{
				data.store = new Store(name, address, phoneNumber, 0);
				return data.store;
			}
		}
		return null;
	}
	
	@PostMapping("/{id}/topUp")
	boolean topUp
	(
			@RequestParam int id,
			@RequestParam double balance
	)
	{
		for(Account data : accountTable)
		{
			if(data.id == id)
			{
				data.balance = data.balance + balance;
				return true;
			}
		}
		return false;
	}
	
	private static boolean timekeeper(Payment payment)
	{
		return false;
	}
}