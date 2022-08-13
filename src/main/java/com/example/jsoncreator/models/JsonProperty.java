package com.example.jsoncreator.models;

public abstract class JsonProperty implements JsonComponent {

    protected String name;

    public String getName() {
        return name;
    }

    @Override
    public JsonProperty getInstance() {
        return this;
    }

    @Override
    public String writeToString() {
        return getName() + " : ";
    }
}
