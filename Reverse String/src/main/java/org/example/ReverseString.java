package org.example;

public class ReverseString {
    public String reverse(String inputString) {
        StringBuilder result = new StringBuilder(inputString);
        return String.valueOf(result.reverse());
    }
}
