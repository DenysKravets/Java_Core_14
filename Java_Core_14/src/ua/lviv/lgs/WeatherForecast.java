package ua.lviv.lgs;

public class WeatherForecast 
{

	private String weather;
	private int temperature;
	
	public WeatherForecast(String weather, int temperature)
	{
		super();
		this.weather = weather;
		this.temperature = temperature;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "WeatherForecast [weather=" + weather + ", temperature=" + temperature + "]";
	}
	
	
	
}
