package sample;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import sample.index.IndexController;
import sample.weather.WeatherController;

/**
 * Created by yasuhiro on 2015/01/24.
 */
@RestController
@EnableAutoConfiguration
public class Main {

  public static void main( String[] args ) {
    SpringApplication.run(Main.class, args);
  }

  @Bean
  public IndexController indexController() {
    return new IndexController();
  }

  @Bean
  public WeatherController weatherController() {
    return new WeatherController();
  }

}
