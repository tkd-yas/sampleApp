package sample.weather.forecast;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import sample.weather.common.Weather;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by yasuhiro on 2015/02/01.
 */
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Daily {

  private Date dt;
  private Temp temp;
  private Double pressure;
  private Integer humidity;
  private List<Weather> weather;
  private Double speed;
  private Integer deg;
  private Integer clouds;
  private Double rain;

  /**
   * weater getter.
   * 要素は常に1つ？であるため、最初の要素を返却する。
   *
   * @return weather
   */
  public Weather getWeather() {
    if ( weather == null || weather.isEmpty() ) {
      return null;
    }
    return weather.get(0);
  }

  /**
   * 日付をフォーマットする。
   * 日付はミリ秒の単位でないので、× 1000する。
   *
   * @return
   */
  public String getDt() {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd\nHH:mm");
    return sdf.format(new Date(dt.getTime() * 1000));
  }

}
