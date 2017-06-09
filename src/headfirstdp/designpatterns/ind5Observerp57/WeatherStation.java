package headfirstdp.designpatterns.ind5Observerp57;

import headfirstdp.designpatterns.ind5Observerp57.displays.CurrentConditionsDisplay;
import headfirstdp.designpatterns.ind5Observerp57.displays.ForecastDisplay;
import headfirstdp.designpatterns.ind5Observerp57.displays.StatisticsDisplay;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}