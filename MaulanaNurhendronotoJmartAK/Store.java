package MaulanaNurhendronotoJmartAK;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Praktikum Modul 3
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Store extends Recognizable
{
    public static final String REGEX_PHONE = "^[0-9]{9,12}$";
    public static final String REGEX_NAME = "^[A-Z0-9a-z]{4,20}";
    public String name;
    public String address;
    public double balance;
    public String phoneNumber;
    
    public Store(String name, String address, String phoneNumber, double balance)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }
    
    public String toString()
    {
        String name = "Name: " + this.name + "\n";
        String address = "Weight: " + this.address + "\n";
        String phoneNumber = "conditionUsed: " + this.phoneNumber + "\n";
    
        return name+address+phoneNumber;
    }
    
    public boolean validate()
    {
    	Pattern pattern = Pattern.compile(REGEX_PHONE);
    	Matcher match = pattern.matcher(phoneNumber);
    	
    	Pattern p = Pattern.compile(REGEX_NAME);
    	Matcher m = p.matcher(name);
    	
    	return m.matches() && match.matches();
    }
}
