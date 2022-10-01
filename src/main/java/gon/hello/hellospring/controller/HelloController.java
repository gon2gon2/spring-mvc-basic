package gon.hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        // data라는 key, hello라는 value
        model.addAttribute("data", "hello!");
        return "hello";
    }
}
