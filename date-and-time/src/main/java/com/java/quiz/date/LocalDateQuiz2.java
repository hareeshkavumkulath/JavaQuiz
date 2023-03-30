package com.java.quiz.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateQuiz2 {

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.now();
        birthday = birthday.plus(12, ChronoUnit.MONTHS);
        DayOfWeek dow = birthday.getDayOfWeek();
        System.out.println(dow.getValue());
    }

}
