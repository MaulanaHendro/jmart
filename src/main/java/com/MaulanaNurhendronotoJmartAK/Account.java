package com.MaulanaNurhendronotoJmartAK;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.MaulanaNurhendronotoJmartAK.dbjson.Serializable;

/**
 * Praktikum Modul 3
 *
 * @Maulana Nurhendronoto (2006577542)
 */
public class Account extends Serializable
{
    public static String REGEX_EMAIL = "^\\w+([\\~*_&.]?\\w+)*@\\w+([\\.-]?\\w+)*.?\\w+$";
    public static final String REGEX_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$";
    public double balance;
    public String name;
    public String email;
    public String password;
    public Store store;
    
    public Account(String name, String email, String password, double balance)
    {
        this.name = name;
        this.email = email;
        this.password = password;
        this.balance = balance;
    }
    
    public boolean validate()
    {
        Pattern pattern = Pattern.compile(REGEX_EMAIL);
        Matcher match = pattern.matcher(email);
        
        Pattern p = Pattern.compile(REGEX_PASSWORD);
        Matcher m = p.matcher(password);
        
        return m.matches() && match.matches();
    }
}
