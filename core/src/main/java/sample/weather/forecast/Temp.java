package sample.weather.forecast;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

/**
 * Created by yasuhiro on 2015/02/01.
 */
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Temp {

  public static final Double ABSOLUTE_ZERO_KELVIN = -273.15;

  //  "temp":{"day":272.7,"min":264.79,"max":272.7,"night":264.79,"eve":272.7,"morn":272.7}
  private Double day;
  private Double min;
  private Double max;
  private Double night;
  private Double eve;
  private Double morn;

}
