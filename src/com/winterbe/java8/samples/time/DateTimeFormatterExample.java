package com.winterbe.java8.samples.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter
                .ofPattern("yyyy/MM/dd HH:mm:ss z");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter
                .ofPattern("yyyy/MM/dd");
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter
                .ofPattern("dd/MMM/YYYY");
        DateTimeFormatter formatterWithZone = dateTimeFormatter3
                .withZone(ZoneId.of("America/Los_Angeles"));
        ZoneId getZoneMethod = formatterWithZone.getZone();
        LocalTime time = LocalTime
                .parse("10:15:30", DateTimeFormatter.ISO_TIME);
        LocalDate date = LocalDate.parse("2015-04-10",
                DateTimeFormatter.ISO_DATE);
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        String formatter1 = dateTimeFormatter1.format(zonedDateTime);
        String formatter2 = dateTimeFormatter2.format(zonedDateTime);
        String formatter3 = dateTimeFormatter3.format(zonedDateTime);
        String formatterWithZoneStr = formatterWithZone.format(zonedDateTime);
        System.out.println("DateTimeFormatter Example Demo");
        System.out.println("------------------------------");
        System.out.println("DateTimeFormatter 1 : " + formatter1);
        System.out.println("DateTimeFormatter 2 : " + formatter2);
        System.out.println("DateTimeFormatter 3 : " + formatter3);
        System.out.println("DateTimeFormatter with Zone3 : " + formatterWithZoneStr);
        System.out.println("DateTimeFormatter().getZone() : " + getZoneMethod.getId());
        System.out.println("LocalTime.parser - DateTimeFormatter.ISO_TIME : "
                + time);
        System.out.println("LocalDate.parser - DateTimeFormatter.ISO_TIME : "
                + date);
    }
}