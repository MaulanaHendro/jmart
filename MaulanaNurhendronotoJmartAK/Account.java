package MaulanaNurhendronotoJmartAK;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Praktikum Modul 3
 *
 * @Maulana Nurhendronoto (2006577542)
 */
public class Account extends Recognizable implements FileParser
{
    public static String REGEX_EMAIL = "^\\w+([\\~*_&.]?\\w+)*@\\w+([\\.-]?\\w+)*.?\\w+$";
    public static final String REGEX_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$";
    public String name;
    public String email;
    public String password;
    
    public Account(int id, String name, String email, String password)
    {
        super(id);
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    @Override
    public boolean read (String content){
        return false;
    }
    
    public boolean validate()
    {
        Pattern pattern = Pattern.compile(REGEX_EMAIL);
        Matcher match = pattern.matcher(email);
        
        Pattern p = Pattern.compile(REGEX_PASSWORD);
        Matcher m = p.matcher(password);
        
        return m.matches() && match.matches();
    }
    
    public String toString()
    {
        String name = "Name: " + this.name + "\n";
        String email = "Weight: " + this.email + "\n";
        String password = "conditionUsed: " + this.password + "\n";
    
        return name+email+password;
    }
}
