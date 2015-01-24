package sample.weather;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yasuhiro on 2015/01/24.
 */
@Component
public class OpenWeatherClient {

  private static final Logger logger = LoggerFactory.getLogger(OpenWeatherClient.class);

  private OpenWeatherConfig config;

  @Autowired
  public OpenWeatherClient( OpenWeatherConfig openWeatherConfig ) {
    this.config = openWeatherConfig;
  }


  public Object executeQuery( String city ) {
    RestTemplate restTemplate = new RestTemplate();
    Map<String, Object> params = new HashMap<>();
    params.put("city", city);
    logger.info("request : {}?{}", config.url, params);
    return restTemplate.getForObject(config.url + "?q={city}", CityWeather.class, params);
  }

}
