package sample.weather;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yasuhiro on 2015/01/24.
 */
@RestController
public class WeatherController {

  @RequestMapping("weather")
  public Object weather() {
    return "weather";
  }
}
