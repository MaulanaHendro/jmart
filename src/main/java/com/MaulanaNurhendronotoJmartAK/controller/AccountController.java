package com.MaulanaNurhendronotoJmartAK.controller;

import com.MaulanaNurhendronotoJmartAK.Account;
import com.MaulanaNurhendronotoJmartAK.dbjson.JsonTable;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/account")
public abstract class AccountController implements BasicGetController<Account>
{
	public static final String REGEX_EMAIL = "^\\w+([\\~*_&.]?\\w+)*@\\w+([\\.-]?\\w+)*.?\\w+$";
	public static final String REGEX_PASSWORD = "(?=.*[a-z])(?=.*[A-Z])(?=\\\\S+$).{8,}$";
	public static final Pattern REGEX_PATTERN_EMAIL = Pattern.compile(REGEX_EMAIL);
	public static final Pattern REGEX_PATTERN_PASSWORD = Pattern.compile(REGEX_PASSWORD);
	public static JsonTable<Account> accountTable;
	
	@GetMapping
	String index() { return "account page"; }
	
	 @PostMapping("/account/login")
     @ResponseBody Account login(String email, String password)
     {
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
	Account register
	(
		@RequestParam String name,
		@RequestParam String email,
		@RequestParam String password
	)
	{
		return new Account(name, email, password);
	}
	
	@Override
	@GetMapping("/{id}")
	public Account getById(@PathVariable int id)
	{
		return getJsonTable().get(id);
	}
	
	@Override
	@GetMapping("/page")
	public List<Account> getPage(int page, int pageSize)
	{
		return getJsonTable().subList(page, pageSize);
	}
}










	