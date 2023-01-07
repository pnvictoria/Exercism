package org.example;

public class LogLevels {
    public static void main(String[] args) {
        LogLevels.message("[WARNING]:  Disk almost full\r\n");
        // => "Disk almost full"

        LogLevels.logLevel("[ERROR]: Invalid operation");
        // => "error"

        LogLevels.reformat("[INFO]: Operation completed");
        // => "Operation completed (info)"
    }

    public static String message(String logLine) {
        return logLine.split("]:")[1].trim();
    }

    public static String logLevel(String logLine) {
        return logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]")).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}

