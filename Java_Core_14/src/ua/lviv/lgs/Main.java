package ua.lviv.lgs;

import java.util.*;

public class Main 
{

	public static void main(String[] args) 
	{
		
		Set<WeatherForecast> weatherForecast = new HashSet<WeatherForecast>();
		
		weatherForecast.add(new WeatherForecast("Humid", 15));
		weatherForecast.add(new WeatherForecast("Sunny", 36));
		weatherForecast.add(new WeatherForecast("Foggy", 14));
		weatherForecast.add(new WeatherForecast("Sunless", 24));
		weatherForecast.add(new WeatherForecast("Dry", 34));
		
		for(Object object: weatherForecast)
		{
			System.out.println(object);
		}
		
		System.out.println();
		
		weatherForecast = new TreeSet<WeatherForecast>(new WeatherForecastComparator());
		
		weatherForecast.add(new WeatherForecast("Humid", 15));
		weatherForecast.add(new WeatherForecast("Sunny", 36));
		weatherForecast.add(new WeatherForecast("Foggy", 14));
		weatherForecast.add(new WeatherForecast("Sunless", 24));
		weatherForecast.add(new WeatherForecast("Dry", 34));
		
		//Sorted by WeatherForecastComparator
		for(Object object: weatherForecast)
		{
			System.out.println(object);
		}
		
		Commodity commodity = new Commodity();
		
		while(true)
		{
			System.out.println();
			
			System.out.println("Menu:"
					+ "\n1 Add;"
					+ "\n2 Remove;"
					+ "\n3 Replace;"
					+ "\n4 Sort by name;"
					+ "\n5 Sort by length;"
					+ "\n6 Sort by width;"
					+ "\n7 Sort by weight;"
					+ "\n8 Close;");
			
			Scanner scan = new Scanner(System.in);
			
			int decision = scan.nextInt();
			
			switch(decision)
			{
			case 1:
			{
				commodity.addProduct();
				break;
			}
			case 2:
			{
				commodity.removeProduct();
				break;
			}
			case 3:
			{
				commodity.replaceProduct();
				break;
			}
			case 4:
			{
				commodity.sortByName();
				break;
			}
			case 5:
			{
				commodity.sortByLength();
				break;
			}
			case 6:
			{
				commodity.sortBywidth();
				break;
			}
			case 7:
			{
				commodity.sortByWeigth();
				break;
			}
			case 8:
			{
				System.exit(0);
				break;
			}
			}
			System.out.println(commodity.getGoods());
		}
		
	}

}
