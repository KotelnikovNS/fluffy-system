package Lesson7_HW;

import java.io.IOException;
import Lesson7_HW.WeatherBase;

public interface WeatherModel {
    void getWeather(String selectedCity, Period period) throws IOException;

    public List<WeatherBase> getSavedToWeatherBase();
}
