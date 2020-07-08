package ua.lviv.lgs;

import java.util.*;

public class WeatherForecastComparator implements Comparator<WeatherForecast>
{

	@Override
	public int compare(WeatherForecast arg0, WeatherForecast arg1) 
	{
		if(arg0.getTemperature() > arg1.getTemperature())
		{
			return 1;
		} 
		if(arg0.getTemperature() < arg1.getTemperature())
		{
			return -1;
		}
		return arg0.getWeather().compareTo(arg1.getWeather());
	}

}
