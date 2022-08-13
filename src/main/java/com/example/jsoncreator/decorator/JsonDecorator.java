package com.example.jsoncreator.decorator;

import com.example.jsoncreator.models.JsonComponent;
import com.example.jsoncreator.models.JsonProperty;

public abstract class JsonDecorator implements JsonComponent {

    protected JsonComponent jsonComponent;

    public JsonDecorator(JsonComponent jsonComponent) {
        this.jsonComponent = jsonComponent;
    }

    @Override
    public String writeToString() {
        return jsonComponent.writeToString();
    }

    @Override
    public JsonProperty getInstance() {
        return jsonComponent.getInstance();
    }
}
