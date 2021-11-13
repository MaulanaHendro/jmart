package MaulanaNurhendronotoJmartAK;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

/**
 * JMart Praktikum Modul 1, 2, 3, 4, 5, 6
 *
 * @author Maulana Nurhendronoto (2006577542)
 * @
 */
public class Jmart
{
	public static List<Product> filterByAccountId(List<Product>list, int accountId, int page, int pageSize)
	{
		return paginate(list, page, pageSize, product -> product.accountId == accountId);
	}
	
	public static List<Product> filterByCategory(List<Product>list, ProductCategory category)
	{
		List<Product>returnCategory = new ArrayList<Product>();
		for(Product product : list)
		{
			if(product.category.equals(category))
			{
				returnCategory.add(product);
			}
		}
		return returnCategory;
	}
	
	public static List<Product> filterByName(List<Product>list, String search, int page, int pageSize)
	{
		return paginate(list, page, pageSize, product -> product.name.toLowerCase().contains(search.toLowerCase()));
	}
	
	public static List<Product> filterByPrice(List<Product> list, double minPrice, double maxPrice)
	{
		List<Product> returnPrice = new ArrayList<Product>();
		for(Product product : list)
		{
			if(minPrice <= 0.0 && product.price < minPrice)
			{
				continue;
			}
			if(maxPrice <= 0.0 && product.price > maxPrice)
			{
				continue;
			}
			returnPrice.add(product);
		}
		return returnPrice;
	}
	
	public static void main(String[] args)
	{
		System.out.println("account id: " + new Account(null, null, null, -1).id);
		System.out.println("account id: " + new Account(null, null, null, -1).id);
		System.out.println("account id: " + new Account(null, null, null, -1).id);

		System.out.println("payment id: " + new Payment(-1, -1, -1, null).id);
		System.out.println("payment id: " + new Payment(-1, -1, -1, null).id);
		System.out.println("payment id: " + new Payment(-1, -1, -1, null).id);
		
		try
		{
			List<Product>list = read("C:\\Users\\USER\\Documents\\Hendro\\Java Programming BlueJ\\jmart\\randomProductList.json");
			List<Product>filterName = filterByName(list, "gtx", 1, 5);
			filterName.forEach(product -> System.out.println(product.name));
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
		
		try
		{
			List<Product>list = read("C:\\Users\\USER\\Documents\\Hendro\\Java Programming BlueJ\\jmart\\randomProductList.json");
			List<Product>filterAccountId = filterByAccountId(list, 1, 0, 5);
			filterAccountId.forEach(product -> System.out.println(product.accountId));
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
		
		try
		{
			List<Product>list = read("C:\\Users\\USER\\Documents\\Hendro\\Java Programming BlueJ\\jmart\\randomProductList.json");
			List<Product>filtered = filterByPrice(list, 13000.0, 20000.0);
			filtered.forEach(product -> System.out.println(product.price));
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
	}
	
	private static List<Product>paginate(List<Product>list, int page, int pageSize, Predicate<Product>pred)
	{
		int iteration = 0;
		int occurence = 0;
		int startId = page * pageSize;
		List<Product>pageList = new ArrayList<>(pageSize);
		
		for(; iteration < list.size() && occurence < startId; iteration++)
		{
			if(pred.predicate(list.get(iteration)))
			{
				iteration++;
			}
		}
		for(int i = iteration; i < list.size() && pageList.size() < pageSize; i++)
		{
			if(pred.predicate(list.get(i)))
			{
				pageList.add(list.get(i));
			}
		}
		return pageList;
	}
	
	public static List<Product>read(String filepath) throws FileNotFoundException
	{
		Gson gson = new Gson();
		Type userListType = new TypeToken<ArrayList<Product>>() {
		}.getType();
		BufferedReader br = new BufferedReader(new FileReader(filepath));
		List<Product> returnList = gson.fromJson(br,  userListType);
		return returnList;
	}

}
