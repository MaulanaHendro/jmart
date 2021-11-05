package MaulanaNurhendronotoJmartAK;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Praktikum Modul 3
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Store extends Recognizable implements FileParser
{
    public static String REGEX_PHONE = "^[0-9]{9,12}$";
    public static String REGEX_NAME = "^[A-Z0-9a-z]{4,20}";
    public String name;
    public String address;
    public String phoneNumber;
    
    public Store(int accountId, String name, String address, String phoneNumber)
    {
        super(accountId);
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    public Store(Account account, String name, String address, String phoneNumber)
    {
        super(account.id);
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    public boolean read (String content)
    {
        return false;
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
