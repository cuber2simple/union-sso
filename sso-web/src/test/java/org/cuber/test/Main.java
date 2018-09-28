package org.cuber.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter yyyy_MM = DateTimeFormatter.ofPattern("yyyy_MM");
        LocalDateTime.parse("2018_09",yyyy_MM);
    }
}
