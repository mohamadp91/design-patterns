package com.example.jsoncreator.decorator;

import com.example.jsoncreator.models.JsonComponent;

public class IndentDecorator extends JsonDecorator {

    private static final String INDENT = "    ";
    private static final String BREAK_LINE = "\n";
    private static int INDENT_COUNT = 0;
    private int textSize;
    private StringBuffer textStringBuffer = new StringBuffer();

    public IndentDecorator(JsonComponent jsonComponent) {
        super(jsonComponent);
    }

    @Override
    public String writeToString() {
        textStringBuffer = new StringBuffer(super.writeToString());
        textSize = textStringBuffer.length();

        addBaseCurlyBracket();

        return decorateJson();
    }

    private void addBaseCurlyBracket() {
        textStringBuffer.insert(0, "{").append("}");
    }

    private String decorateJson() {

        for (int i = 0; i < textSize; i++) {
            if (textStringBuffer.charAt(i) == '{') {
                INDENT_COUNT += 1;
                addBreakLines(i + 1);
                addIndent(i + 2, INDENT_COUNT);
            } else if (textStringBuffer.charAt(i) == '}' && textStringBuffer.charAt(i + 1) == ',') {
                INDENT_COUNT -= 1;
                addBreakLines(i + 2);
                addIndent(i + 3, INDENT_COUNT);
            } else if (textStringBuffer.charAt(i) == ',') {
                addBreakLines(i + 1);
                addIndent(i + 2, INDENT_COUNT);
            }
        }
        return textStringBuffer.toString();
    }

    private void addBreakLines(int index) {
        textSize += 1;
        textStringBuffer.insert(index, BREAK_LINE);
    }

    private void addIndent(int index, int count) {
        String indent = "";
        for (int i = 1; i < count; i++) {
            indent += INDENT;
            textSize += 4;
        }

        textStringBuffer.insert(index, indent);
    }

}
