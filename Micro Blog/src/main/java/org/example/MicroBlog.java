package org.example;

public class MicroBlog {
    public static void main(String[] args) {
        MicroBlog.truncate("Victria");
        MicroBlog.truncate(null);
    }

    public static String truncate(String input) {
        return input.codePointCount(0, input.length()) < 6 ? input : input.substring(0, input.offsetByCodePoints(0, 5));
    }
}

