package com.example.jsoncreator.models;

public abstract class JsonProperty implements JsonComponent {
    protected String name;

    public String getName() {
        return name;
    }

    @Override
    public JsonComponent getInstance() {
        return this;
    }

    @Override
    public abstract String toString();
}
