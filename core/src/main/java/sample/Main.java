package sample;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
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
  public static OpenWeatherClient openWeatherClient(){
    return new OpenWeatherClient(openWeatherConfig());
  }

  @Bean
  public static OpenWeatherConfig openWeatherConfig(){
    return new OpenWeatherConfig();
  }
}
