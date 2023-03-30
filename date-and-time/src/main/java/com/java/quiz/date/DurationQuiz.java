package com.java.quiz.date;

import java.time.Duration;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DurationQuiz {

    public static void main(String[] args) {
        ZonedDateTime ord =
                ZonedDateTime.of(2021, 3, 27, 17, 30, 0, 0,
                        ZoneId.of("America/Chicago"));

        ZonedDateTime waw =
                ZonedDateTime.of(2021, 3, 28, 9, 35, 0, 0,
                        ZoneId.of("Europe/Warsaw"));

        Duration timeInPlane = Duration.between(ord, waw);

        //long timeInPlane = ChronoUnit.HOURS.between(ord, waw); // Will print the number of hours

        System.out.print("Time in plane is: " + timeInPlane); // Will print time in the format of Period of Time of 9 Hours and 5 Minutes
    }

}
