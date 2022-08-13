package com.example.jsoncreator.models;

import java.util.ArrayList;
import java.util.Arrays;

public class JsonArray extends JsonProperty {

    ArrayList<Object> objectArray = new ArrayList<>();

    public JsonArray(String name, Object... values) {
        super();
        super.name = name;
        objectArray.addAll(Arrays.stream(values).toList());
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String writeToString() {
        StringBuilder property = new StringBuilder(super.writeToString() + " [");
        objectArray.forEach((o) -> {
            property.append(o.toString());
            if (o != objectArray.get(objectArray.size() - 1))
                property.append(",");
        });
        property.append("],");
        return property.toString();
    }
}
