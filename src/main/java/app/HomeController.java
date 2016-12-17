package app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Chocks on 12/17/16.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}
