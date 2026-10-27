package week01.day07;

public class ArrayUtils {
  public static <T> T first(T[] items) {
    if (items == null || items.length == 0) {
      throw new IllegalArgumentException("参数不合法");
    }
    return items[0];
  }
}