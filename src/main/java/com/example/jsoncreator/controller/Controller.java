package com.example.jsoncreator.controller;

import com.example.jsoncreator.decorator.IndentDecorator;
import com.example.jsoncreator.decorator.JsonDecorator;
import com.example.jsoncreator.jsonComposite.JsonObject;
import com.example.jsoncreator.models.JsonArray;
import com.example.jsoncreator.models.JsonElement;
import com.example.jsoncreator.models.JsonProperty;
import com.example.jsoncreator.strategy.SortAlphabetically;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String createArray() {
        JsonProperty j = new JsonElement("element", true);
        JsonProperty a = new JsonArray("array", false, 1f, 2.4, 56);
        JsonProperty f = new JsonElement("aelement", 20);

        JsonProperty c = new JsonObject("object", new SortAlphabetically(), j, a, f);

        JsonDecorator d = new IndentDecorator(c);

        return d.writeToString();
    }
}
