package sample.weather;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Created by yasuhiro on 2015/01/24.
 */
@Component
@Data
public class OpenWeatherConfig {

  private String service;

  private String url;

  private String forecastUrl;

}
