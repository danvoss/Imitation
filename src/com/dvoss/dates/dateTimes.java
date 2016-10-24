package com.dvoss.dates;

import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * Created by Dan on 10/24/16.
 */
public class dateTimes {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DAY_OF_WEEK));

        System.out.println(LocalDateTime.now().getDayOfWeek());

        System.out.println(LocalDateTime.of(2017, 1, 6, 1, 1).getDayOfWeek());
    }
}
