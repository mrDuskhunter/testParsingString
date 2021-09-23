package org.example.testParsingString;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wordanalyzer")
public class WordAnalyzeController {
    @Autowired
    private LettersCountService service;

    @GetMapping("/analyze")
    public LetterCountResponse analyze(@RequestParam(value = "word") String word) {
        return service.pars(word);
    }
}
