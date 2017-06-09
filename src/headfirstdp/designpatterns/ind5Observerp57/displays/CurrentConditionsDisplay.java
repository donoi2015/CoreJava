package headfirstdp.designpatterns.ind5Observerp57.displays;

import headfirstdp.designpatterns.ind5Observerp57.interfaces.DisplayElement;
import headfirstdp.designpatterns.ind5Observerp57.interfaces.Observer;
import headfirstdp.designpatterns.ind5Observerp57.interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
	this.weatherData = weatherData;
	weatherData.registerObserver(this);
    }

    @Override
    public void update(float aTemp, float aHumidity, float aPressure) {
	temperature = aTemp;
	humidity = aHumidity;
	display();
    }

    @Override
    public void display() {
	System.out.println("Current conditions: " + temperature
		+ "F degrees and " + humidity + "% humidity");
    }

}
