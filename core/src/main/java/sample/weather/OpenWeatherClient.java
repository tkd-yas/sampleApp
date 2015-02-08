package sample.weather;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import sample.weather.city.CityWeather;
import sample.weather.forecast.Forecast;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yasuhiro on 2015/01/24.
 */
@Component
public class OpenWeatherClient {

  private static final Logger logger = LoggerFactory.getLogger(OpenWeatherClient.class);

  @Autowired
  private final OpenWeatherConfig openWeatherConfig;


  public OpenWeatherClient( OpenWeatherConfig openWeatherConfig ) {
    this.openWeatherConfig = openWeatherConfig;
  }

  public CityWeather getCityWeather( String city ) {
    RestTemplate restTemplate = new RestTemplate();
    Map<String, Object> params = new HashMap<>();
    params.put("city", city);
    logger.info("request : url: {}, params: {}", openWeatherConfig.getUrl(), params);
    return restTemplate.getForObject(openWeatherConfig.getUrl(), CityWeather.class, params);
  }

  public Forecast getForecastByCityId( String cityId, Integer days ) {
    RestTemplate rt = new RestTemplate();
    Map<String, Object> params = new HashMap<>();
    params.put("cityId", cityId);
    params.put("days", days);
    logger.info("request : url: {}, params: {}", openWeatherConfig.getForecastUrl(), params);
    return rt.getForObject(openWeatherConfig.getForecastUrl(), Forecast.class, params);
  }
}
