package com.example.jsoncreator.strategy;

import com.example.jsoncreator.models.JsonProperty;

import java.util.List;

public interface SortStrategy {

    List<JsonProperty> sortComponents(List<JsonProperty> components);
}
