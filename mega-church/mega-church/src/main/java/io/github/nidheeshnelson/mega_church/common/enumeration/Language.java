package io.github.nidheeshnelson.mega_church.common.enumeration;

public enum Language {
    ENGLISH("en", "English"),
    MALAYALAM("ml", "Malayalam"),
    HINDI("hi", "Hindi"),
    TAMIL("ta", "Tamil");

    private final String code;
    private final String label;

    Language(String code, String label) {
        this.code = code;
        this.label = label;
    }

    public String getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }
}
