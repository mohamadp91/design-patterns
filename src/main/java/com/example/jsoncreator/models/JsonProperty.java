package com.example.jsoncreator.models;

public abstract class JsonProperty {
    protected String name;

    public String getName() {
        return name;
    }

    public JsonProperty getInstance() {
        return this;
    }

    public String toString(){
        return getName() + ": ";
    };
}
