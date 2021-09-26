package by.epam.task1.util;

public class CalorieUtil {
  public static boolean isCalorieInRange(
      int actualCalorie, int minInclusive, int maxInclusive) {
    return actualCalorie >= minInclusive && actualCalorie <= maxInclusive;
  }
}
