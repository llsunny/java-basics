package week01.day08;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class TaskDateUtils {
  
  public static boolean isWithinRange(
    LocalDate date,
    LocalDate start,
    LocalDate end
  ) {
    if (date == null || start == null || end == null) {
      throw new IllegalArgumentException("date, start, end 不能为 null");
    }
    if (start.isAfter(end)) {
      throw new IllegalArgumentException("开始日期不能晚于结束日期");
    }
    return !date.isBefore(start) && !date.isAfter(end);
  }

  public static boolean isOverdue(
    LocalDateTime deadline,
    LocalDateTime now,
    boolean completed
  ) {
    if (deadline == null || now == null) {
        throw new IllegalArgumentException("deadline 和 now 不能为 null");
    }
    if (completed) {
        return false;
    }
    return now.isAfter(deadline);
  }
}
