package sample.weather;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yasuhiro on 2015/01/24.
 */
@RestController
public class WeatherController {

  private static final Logger logger = LoggerFactory.getLogger(WeatherController.class);

  @Autowired
  private OpenWeatherClient openWeatherClient;

  @RequestMapping("/weather")
  public Object weather( @RequestParam String city ) {
    logger.info("weather requested : " + city);

    Object result = openWeatherClient.executeQuery(city);
    return result;
  }
}
