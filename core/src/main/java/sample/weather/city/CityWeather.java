package sample.weather.city;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import sample.weather.common.Coord;
import sample.weather.common.Weather;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by yasuhiro on 2015/01/24.
 */
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CityWeather {

  private Long id;
  private String name;
  private Integer cod;
  private List<Weather> weather;

  private Map<String, ?> sys;
  private Map<String, Double> main;
  private Map<String, ?> wind;
  private Map<String, ?> clouds;
  private Coord coord;
  private Date dt;

  private static String convertDegreeCelsius( Double d ) {
    return BigDecimal.valueOf(d).setScale(0, BigDecimal.ROUND_HALF_UP).toPlainString();
  }

  public String getTemp() {
    return convertDegreeCelsius(main.get("temp"));
  }

  public String getTempMin() {
    return convertDegreeCelsius(main.get("temp_min"));
  }

  public String getTempMax() {
    return convertDegreeCelsius(main.get("temp_max"));
  }

  public String getDate() {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    return sdf.format(dt);
  }
}
