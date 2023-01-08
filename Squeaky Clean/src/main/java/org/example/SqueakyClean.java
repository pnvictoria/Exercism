package org.example;

public class SqueakyClean {
    public static void main(String[] args) {
        SqueakyClean.clean("my   Id");
    }

    static String clean(String identifier) {
        for (int i = 0; i < identifier.length(); i++) {
            if (identifier.charAt(i) == '-'){
                identifier = identifier.substring(0, i+1) + identifier.substring(i+1, i+2).toUpperCase() + identifier.substring(i+2);
            }
        }
        return identifier.replace("-", "").replace(" ", "_").replaceAll("\\p{Cntrl}", "CTRL").replaceAll("[α-ω]",  "").replaceAll("[^\\p{L}_]",  "");
    }
}

