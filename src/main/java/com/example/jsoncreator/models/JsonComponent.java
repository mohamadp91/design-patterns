package com.example.jsoncreator.models;

import java.util.ArrayList;

public interface JsonComponent {

    public JsonProperty getInstance();

    public String writeToString();

}
