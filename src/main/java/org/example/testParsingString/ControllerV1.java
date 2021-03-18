package org.example.testParsingString;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/wordanalyzer")
public class ControllerV1 {
    @GetMapping("/analyze")
    public String controllerV1(
            @RequestParam(name="word", required=false) String word, Model model) {
        String result = Parser.parser(word);
        model.addAttribute("result", result);
        return "analyze";
    }
}
