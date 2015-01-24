package sample.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yasuhiro on 2015/01/24.
 */
@Controller
public class IndexController {

  @RequestMapping({"", "/"})
  public String index() {
    return "index.html";
  }
}
