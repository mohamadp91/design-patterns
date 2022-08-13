package com.example.jsoncreator.jsonComposite;

import com.example.jsoncreator.models.JsonProperty;

import java.util.ArrayList;
import java.util.Arrays;

public class JsonObject extends JsonProperty {

    ArrayList<JsonProperty> children = new ArrayList<>();

    public JsonObject(String name, JsonProperty... jsonComponents) {
        super();
        super.name = name;
        children.addAll(Arrays.stream(jsonComponents).toList());
    }

    public void add(JsonProperty jsonComponent) {
        children.add(jsonComponent);
    }

    public void remove(JsonProperty jsonComponent) {
        children.remove(jsonComponent);
    }

    @Override
    public JsonProperty getInstance() {
        return this;
    }

    @Override
    public String writeToString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.writeToString()).append("{ ");
        children.forEach((o) -> {
            stringBuilder.append(o.writeToString());
        });
        stringBuilder.append("},");
        return stringBuilder.toString();
    }
}
