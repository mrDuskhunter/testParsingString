package org.example.testParsingString;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerV1 {
    @GetMapping("/greeting")
    public String controllerV1(
            @RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        String result = Parser.parser(name);
        model.addAttribute("name", result);
        return "greeting";
    }
}
