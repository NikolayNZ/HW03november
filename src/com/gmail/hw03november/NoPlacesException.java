package com.gmail.hw03november;

public class NoPlacesException extends Exception {
    private String name;

    public NoPlacesException(String name) {
        this.name = name;
    }
    public String getMessage() {
        return String.format("\nНет мест,для %s, так как в группе должно быть только 10 человек", name );
    }
}
