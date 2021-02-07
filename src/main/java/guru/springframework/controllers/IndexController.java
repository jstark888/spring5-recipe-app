package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Jeff Stark on 2/6/2021
 */

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String getIndex() {
        System.out.println("Getting index page!!!");
        return "index";
    }
}
