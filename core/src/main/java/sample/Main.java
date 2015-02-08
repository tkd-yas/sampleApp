package sample;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import sample.index.IndexController;
import sample.weather.OpenWeatherClient;
import sample.weather.OpenWeatherConfig;
import sample.weather.WeatherController;

/**
 * Created by yasuhiro on 2015/01/24.
 */
@EnableAutoConfiguration
public class Main {

  public static void main( String[] args ) {
    SpringApplication.run(Main.class, args);
  }

  @Bean
  public static IndexController indexController() {
    return new IndexController();
  }

  @Bean
  public static WeatherController weatherController() {
    return new WeatherController();
  }


  @Bean
  @ConfigurationProperties(prefix = "weather")
  public OpenWeatherConfig openWeatherConfig() {
    return new OpenWeatherConfig();
  }

  @Bean
  public OpenWeatherClient openWeatherClient() {
    return new OpenWeatherClient(openWeatherConfig());
  }
}
