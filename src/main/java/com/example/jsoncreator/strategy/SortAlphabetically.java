package com.example.jsoncreator.strategy;

import com.example.jsoncreator.models.JsonProperty;

import java.util.Comparator;
import java.util.List;

public class SortAlphabetically implements SortStrategy {
    @Override
    public List<JsonProperty> sortComponents(List<JsonProperty> components) {
        return components.stream().sorted(Comparator.comparing(JsonProperty::getName)).toList();
    }
}
