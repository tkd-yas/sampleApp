package test.sample.weather.forecast;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import sample.weather.forecast.Forecast;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yasuhiro on 2015/02/08.
 */
public class DailyTest {

  @Test
  public void test_date_format() {
    long dt = 1423360800;
    Date sut = new Date(dt * 1000);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
    Assert.assertThat(sdf.format(sut), Is.is("2015/02/08 11:00"));
  }

  @Test
  public void test_json_desirialize() throws Exception {
    InputStream is = this.getClass().getResourceAsStream("tokyo-forecast.json");
    ObjectMapper om = new ObjectMapper();
    Forecast sut = om.readValue(is, Forecast.class);
    Assert.assertThat(sut.getList().get(0).getClouds(), Is.is(92));
  }

}
