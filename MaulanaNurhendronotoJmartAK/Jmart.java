package MaulanaNurhendronotoJmartAK;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.*;

/**
 * JMart Praktikum Modul 1, 2, 3, 4, 5, 6
 *
 * @author Maulana Nurhendronoto (2006577542)
 * @
 */
public class Jmart
{
	class Country
	{
		public String name;
		public int population;
		public List<String> listOfStates;
	}
	
	public static void main(String[] args)
	{
		String filepath = "C:\\Users\\USER\\Documents\\Hendro\\Java Programming BlueJ\\jmart\\city.json";
		Gson gson = new Gson();
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(filepath));
			Country input = gson.fromJson(br,  Country.class);
			System.out.println("name: " + input.name);
			System.out.println("population: " + input.population);
			System.out.println("states:");
			input.listOfStates.forEach(state -> System.out.println(state));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static List<Product> filterByPrice(List<Product> list, double minPrice, double maxPrice)
	{
		List<Product> result = new ArrayList<Product>();
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
			result.add(product);
		}
		return result;
	}

}
