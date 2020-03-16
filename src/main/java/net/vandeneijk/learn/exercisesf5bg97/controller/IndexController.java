/**
 * Created by Robert van den Eijk on 16-3-2020.
 */

package net.vandeneijk.learn.exercisesf5bg97.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String getIndexPage() {
        return "index";
    }
}
