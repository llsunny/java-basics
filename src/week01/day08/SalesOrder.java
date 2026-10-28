package week01.day08;

import java.math.BigDecimal;
import java.time.LocalDate;

enum Status {
  SUCCESS,
  FAILED,
  CANCELLED
}
public class SalesOrder {
  private final int id;                 // 订单 ID
  private final String productName;     // 商品名称
  private final LocalDate orderDate;    // 下单日期
  private final Status status;          // 订单状态
  private final BigDecimal paidAmount;  // 实付金额

  public SalesOrder(
    int id,
    String productName,
    LocalDate orderDate,
    Status status,
    BigDecimal paidAmount
  ) {
    if (id <= 0) {
      throw new IllegalArgumentException("订单ID必须大于0");
    }
    if (productName == null || productName.trim().isEmpty()) {
      throw new IllegalArgumentException("商品名称不能为空");
    }
    if (orderDate == null) {
      throw new IllegalArgumentException("下单日期不能为空");
    }
    if (status == null) {
      throw new IllegalArgumentException("订单状态不能为空");
    }
    if (paidAmount == null || paidAmount.compareTo(BigDecimal.ZERO) < 0) {
      throw new IllegalArgumentException("实付金额不能为null或负数");
    }
    this.id = id;
    this.productName = productName;
    this.orderDate = orderDate;
    this.status = status;
    this.paidAmount = paidAmount;
  }

  public int getId() {
    return id;
  }

  public String getProductName() {
    return productName;
  }

  public Status getStatus() {
    return status;
  }

  public LocalDate getOrderDate() {
    return orderDate;
  }

  public BigDecimal getPaidAmount() {
    return paidAmount;
  }
}
