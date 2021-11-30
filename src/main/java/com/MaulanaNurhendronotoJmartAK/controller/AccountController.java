package com.MaulanaNurhendronotoJmartAK.controller;

import com.MaulanaNurhendronotoJmartAK.Account;
import com.MaulanaNurhendronotoJmartAK.Payment;
import com.MaulanaNurhendronotoJmartAK.Store;
import com.MaulanaNurhendronotoJmartAK.dbjson.JsonAutowired;
import com.MaulanaNurhendronotoJmartAK.dbjson.JsonTable;
import org.springframework.web.bind.annotation.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/account")
public class AccountController implements BasicGetController<Account> {
 public static final String REGEX_EMAIL = "^\\w+([\\&_*~.]?\\w+)*@\\w+([\\.-]?\\w+)*.?\\w+$";
 public static final String REGEX_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";
 public static final Pattern REGEX_PATTERN_EMAIL = Pattern.compile(REGEX_EMAIL);
 public static final Pattern REGEX_PATTERN_PASSWORD = Pattern.compile(REGEX_PASSWORD);

 @JsonAutowired(value = Account.class, filepath = "account.json")
 public static JsonTable<Account> accountTable;

 @Override
 public JsonTable<Account> getJsonTable() {
  return accountTable;
 }

 @PostMapping("/login")
 public Account login(@RequestParam String email, @RequestParam String password) {
	 try {
		 MessageDigest md = MessageDigest.getInstance("MD5");
		 md.update(password.getBytes());
		 byte[] bytes = md.digest();

		 StringBuilder sb = new StringBuilder();
		 for (byte aByte : bytes) {
			 sb.append(Integer.toString((aByte & 0xff) + 0x100, 16).substring(1));
		 }
		 password = sb.toString();
	 } 	catch (NoSuchAlgorithmException e) {
		 e.printStackTrace();
	 	}

	 for (Account account : getJsonTable()) {
   if (account.email.equals(email) && account.password.equals(password)) {
    return account;
   }
  }
  return null;
 }

 @PostMapping("/register")
 public Account register(@RequestParam String name, @RequestParam String email, @RequestParam String password) {
  boolean cekEmail = REGEX_PATTERN_EMAIL.matcher(email).find();
  boolean cekPassword = REGEX_PATTERN_PASSWORD.matcher(password).find();

  try {
   MessageDigest md = MessageDigest.getInstance("MD5");
   md.update(password.getBytes());
   byte[] bytes = md.digest();
   StringBuilder sb = new StringBuilder();
   for (byte aByte : bytes) {
    sb.append(Integer.toString((aByte & 0xff) + 0x100, 16).substring(1));
   }
   password = sb.toString();
  } catch (NoSuchAlgorithmException e) {
   e.printStackTrace();
  }

  if (!name.isBlank() && cekEmail && cekPassword
    && accountTable.stream().noneMatch(account -> account.email.equals(email))) {
   Account account = new Account(name, email, password, 0);
   accountTable.add(account);
   return account;
  }
  return null;
 }

 @PostMapping("/{id}/registerStore")
 public Store registerStore(@RequestParam int id, @RequestParam String name, @RequestParam String address,
   @RequestParam String phoneNumber) {
  for (Account account : getJsonTable()) {
   if (account.id == id && account.store == null) {
    account.store = new Store(name, address, phoneNumber, 0);
    return account.store;
   }
  }
  return null;
 }

 @PostMapping("/{id}/topUp")
 public boolean topUp(@RequestParam int id, @RequestParam double balance) {
  for (Account account : accountTable) {
   if (account.id == id) {
    account.balance += balance;
    return true;
   }
  }
  return false;
 }

 @Override
 @GetMapping("/{id}")
 public Account getById(@PathVariable int id) {
  return BasicGetController.super.getById(id);
 }

 @Override
 public List getPage(int page, int pageSize) {
  return BasicGetController.super.getPage(page, pageSize);
 }

}