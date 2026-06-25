package org.fastcampus.common.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeCalculator {

  private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

  public TimeCalculator() {
  }

  public static LocalDate getDateDaysAgo(int daysAgo) {
    LocalDate currDate =  LocalDate.now();
    return currDate.minusDays(daysAgo);
  }

  public static String getFormattedDate(LocalDateTime dateTime) {
    if (dateTime == null) {
      return "";
    }
    return dateTime.format(formatter);
  }
}
