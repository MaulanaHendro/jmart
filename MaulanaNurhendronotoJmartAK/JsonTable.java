package MaulanaNurhendronotoJmartAK;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Vector;
import com.google.gson.*;
import com.google.gson.stream.JsonReader;


public class JsonTable<T> extends Vector <Object>
{
	public final String filepath;
	private static final Gson gson = new Gson();
	
	public JsonTable(Class<T>clazz, String filepath) throws IOException
	{
		this.filepath = filepath;
	}
	
	public static <T> T ReadJson(Class<T>clazz, String filepath) throws FileNotFoundException
	{
		final JsonReader reader  = new JsonReader(new FileReader(filepath));
		return gson.fromJson(reader, clazz);
	}
	
	public void writeJson() throws IOException
	{
		writeJson(this, this.filepath);
	}
	
	public static void writeJson(Object object, String filepath) throws IOException
	{
		FileWriter fwrite = new FileWriter(filepath);
		fwrite.write(gson.toJson(object));
		fwrite.close();
	}
	
	public static void main(String[] args)
	{
		try
		{
			String filepath = "account.json";
			
			JsonTable<Account> tableAccount = new JsonTable<>(Account.class, filepath);
			//tableAccount.add(new Account("name", "email", "password"));
			tableAccount.writeJson();
			
			tableAccount = new JsonTable<>(Account.class, filepath);
			tableAccount.forEach(account -> System.out.println(account.toString()));
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
	}
}
