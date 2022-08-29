package com.example.jsoncreator.jsonComposite;

import com.example.jsoncreator.models.JsonProperty;
import com.example.jsoncreator.strategy.SortStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonObject extends JsonProperty {

    List<JsonProperty> children = new ArrayList<>();
    private SortStrategy sortStrategy;

    public JsonObject(String name, SortStrategy sortStrategy, JsonProperty... jsonComponents) {
        super();
        super.name = name;
        this.sortStrategy = sortStrategy;
        children.addAll(Arrays.stream(jsonComponents).toList());
        this.sort();
    }

    public void add(JsonProperty jsonComponent) {
        children.add(jsonComponent);
    }

    public void remove(JsonProperty jsonComponent) {
        children.remove(jsonComponent);
    }

    public void sort() {
        children = sortStrategy.sortComponents(children);
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

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }
}
