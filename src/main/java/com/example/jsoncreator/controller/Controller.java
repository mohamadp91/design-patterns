package com.example.jsoncreator.controller;

import com.example.jsoncreator.jsonComposite.JsonObject;
import com.example.jsoncreator.models.JsonArray;
import com.example.jsoncreator.models.JsonElement;
import com.example.jsoncreator.models.JsonProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String createArray() {
        JsonProperty j = new JsonElement("hello",true);
        JsonProperty a = new JsonArray("hi",false,1f,2.4,56);
        JsonProperty b = new JsonObject("all",j);
        ((JsonObject)b).add(a);
        return b.toString();
    }
}
