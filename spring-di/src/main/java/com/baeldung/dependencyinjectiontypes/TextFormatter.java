package com.baeldung.dependencyinjectiontypes;

import org.springframework.stereotype.Component;

@Component
public class TextFormatter {

    public String format(String text) {
        return text.toUpperCase();
    }
}
