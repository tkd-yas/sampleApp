package sample.weather.forecast;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import sample.weather.common.Coord;

/**
 * Created by yasuhiro on 2015/02/01.
 */
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class City {
  private String id;
  private String name;
  private Coord coord;
  private String country;
  private Integer population;
}
