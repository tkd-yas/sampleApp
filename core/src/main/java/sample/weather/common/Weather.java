package sample.weather.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

/**
 * Created by yasuhiro on 2015/02/01.
 */
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
  //  "weather":[{"id":800,"main":"Clear","description":"sky is clear","icon":"01n"}]
  private Long id;
  private String main;
  private String description;
  private String icon;
}
