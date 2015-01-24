package sample.weather;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by yasuhiro on 2015/01/24.
 */
@Component
@ConfigurationProperties(prefix = "weather")
public class OpenWeatherConfig {

  String service;

  String url = "http://api.openweathermap.org/data/2.5/weather";

}
