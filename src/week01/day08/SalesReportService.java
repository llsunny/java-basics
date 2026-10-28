package week01.day08;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SalesReportService {
  public List<SalesOrder> filterSuccessOrders(List<SalesOrder> orderList, LocalDate start, LocalDate end) {
    if (orderList == null || start == null || end == null) {
        throw new IllegalArgumentException("订单列表、开始日期、结束日期不能为null");
    }
    if (start.isAfter(end)) {
        throw new IllegalArgumentException("开始日期不能晚于结束日期");
    }
    return orderList.stream()
            .filter(order -> !order.getOrderDate().isBefore(start) && !order.getOrderDate().isAfter(end))
            .filter(order -> Status.SUCCESS.equals(order.getStatus()))
            .collect(Collectors.toList());
  }

  public BigDecimal calculateSuccessAmount(List<SalesOrder> orderList, LocalDate start, LocalDate end) {
    List<SalesOrder> successOrders = filterSuccessOrders(orderList, start, end);
    return successOrders.stream()
          .map(SalesOrder::getPaidAmount)
          .reduce(BigDecimal.ZERO, BigDecimal::add)
          .setScale(2, RoundingMode.HALF_UP);
  }

  public List<SalesOrder> sortSuccessOrdersDescByAmount(List<SalesOrder> orderList, LocalDate start, LocalDate end) {
    List<SalesOrder> successOrders = filterSuccessOrders(orderList, start, end);
    return successOrders.stream()
          .sorted(
            Comparator.comparing(SalesOrder::getPaidAmount, Comparator.reverseOrder())
                      .thenComparing(SalesOrder::getId)
          )
          .collect(Collectors.toList());
  }
}
