package com.hiperdino.util;

public class Format {
    
    public static String header(String title, char c) {

        StringBuilder header = new StringBuilder();

        int titleLength = title.length();
        int sidesLength = (45 - titleLength) / 2;

        header.append(repeatChar(c, 47)).append("\n")
              .append(repeatChar(c, sidesLength - 1)).append("  ")
              .append(title)
              .append("  ").append(repeatChar(c, sidesLength - 1));

        if ((45 - titleLength - 8) % 2 == 1) {
            header.append(c);
        }

        return header.toString();
    }

    private static String repeatChar(char c, int n) {

        return String.valueOf(c).repeat(Math.max(0, n));    
    }
}
