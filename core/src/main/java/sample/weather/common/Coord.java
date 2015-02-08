package sample.weather.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

/**
 * Created by yasuhiro on 2015/02/01.
 */
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Coord {
  private Double lon;
  private Double lat;
}
