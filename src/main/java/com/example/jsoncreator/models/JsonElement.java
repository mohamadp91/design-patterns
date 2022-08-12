package com.example.jsoncreator.models;

public class JsonElement extends JsonProperty {

    private Object value;

    public JsonElement(String name, Object value) {
        super();
        super.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "name : " + value.toString() + ",";
    }
}
