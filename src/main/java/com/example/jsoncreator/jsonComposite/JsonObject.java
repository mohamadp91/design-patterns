package com.example.jsoncreator.jsonComposite;

import com.example.jsoncreator.models.JsonComponent;

import java.util.ArrayList;
import java.util.Arrays;

public class JsonObject implements JsonComponent {

    ArrayList<JsonComponent> children = new ArrayList<>();
    private String name;

    public JsonObject(String name, JsonComponent... jsonComponents) {
        this.name = name;
        children.addAll(Arrays.stream(jsonComponents).toList());
    }

    public void add(JsonComponent jsonComponent) {
        children.add(jsonComponent);
    }

    public void remove(JsonComponent jsonComponent) {
        children.remove(jsonComponent);
    }

    @Override
    public JsonComponent getInstance() {
        return this;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name).append(": {");
        children.forEach((o) -> {
            stringBuilder.append(o.toString());
        });
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
