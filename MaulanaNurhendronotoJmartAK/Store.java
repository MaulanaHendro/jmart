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
    public static String REGEX_PHONE;
    public static String REGEX_NAME;
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
        name = "PT Madju Merdeka";
        address = "Jl. Kukusan";
        phoneNumber = "628777xxxx";
        return null;
    }
    
    public boolean validate()
    {
        Pattern pattern = Pattern.compile("^[0-9]{9,12}$");
        Matcher matcher = pattern.matcher(phoneNumber);
        boolean matchFound = matcher.find();
        String res = matchFound ? "FOUND!" : "NOT FOUND!";
        if(res == "FOUND")
        {
            return true;
        }
        else
        {
            return false;
        }
        
        //Pattern checkName = Pattern.compile("^[A-Z0-9a-z]{4,20}");
        //Matcher matchName = checkName.matcher(name);
          
    }
}
