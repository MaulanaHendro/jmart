package MaulanaNurhendronotoJmartAK;


/**
 * Praktikum Modul 3
 *
 * @Maulana Nurhendronoto (2006577542)
 */
public class Account extends Recognizable implements FileParser
{
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
    
    public String toString()
    {
        String name = "Name: " + this.name + "\n";
        String email = "Weight: " + this.email + "\n";
        String password = "conditionUsed: " + this.password + "\n";
    
        return name+email+password;
    }
}
