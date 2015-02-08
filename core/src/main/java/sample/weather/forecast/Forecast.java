package sample.weather.forecast;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

import java.util.List;

/**
 * Created by yasuhiro on 2015/02/01.
 */
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {

  private String cod;
  private String message;
  private City city;
  private Integer cnt;
  private List<Daily> list;

}
