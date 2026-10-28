package week01.day08;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
  public static void main(String[] args) {
    // try {
    //   PriceCalculator.applyDiscount(new BigDecimal("100"), new BigDecimal("1.2"));
    // } catch (IllegalArgumentException e) {
    //   System.out.println(e.getMessage());
    // }

    // BigDecimal total = PriceCalculator.calculateTotal(new BigDecimal("12.50"), 3);
    // System.out.println(total); // 37.50
    // System.out.println(PriceCalculator.applyDiscount(total, new BigDecimal("0.8")));

    // System.out.println(PriceCalculator.applyDiscount(new BigDecimal("19.99"), new BigDecimal("0.85")));

    // System.out.println(PriceCalculator.applyDiscount(new BigDecimal("100"), new BigDecimal("0")));
    // System.out.println(PriceCalculator.applyDiscount(new BigDecimal("100"), new BigDecimal("1")));

    // try {
    //   PriceCalculator.calculateTotal(new BigDecimal("0"), 3);
    // } catch (IllegalArgumentException e) {
    //   System.out.println(e.getMessage());
    // }

    // try {
    //   PriceCalculator.calculateTotal(new BigDecimal("12.50"), -1);
    // } catch (IllegalArgumentException e) {
    //   System.out.println(e.getMessage());
    // }

    // try {
    //   PriceCalculator.applyDiscount(new BigDecimal("100"), new BigDecimal("1.2"));
    // } catch (IllegalArgumentException e) {
    //   System.out.println(e.getMessage());
    // }

    // try {
    //   PriceCalculator.calculateTotal(null, 1);
    // } catch (IllegalArgumentException e) {
    //   System.out.println(e.getMessage());
    // }

    // LocalDate start = LocalDate.of(2026, 10, 20);
    // LocalDate end = LocalDate.of(2026, 10, 30);

    // LocalDateTime deadline = LocalDateTime.of(2026, 10, 27, 17, 0);
    // System.out.println("10月19日在区间内：" + TaskDateUtils.isWithinRange(LocalDate.of(2026,10,19), start, end));
    // System.out.println("10月20日在区间内：" + TaskDateUtils.isWithinRange(LocalDate.of(2026,10,20), start, end));
    // System.out.println("10月25日在区间内：" + TaskDateUtils.isWithinRange(LocalDate.of(2026,10,25), start, end));
    // System.out.println("10月30日在区间内：" + TaskDateUtils.isWithinRange(LocalDate.of(2026,10,30), start, end));
    // System.out.println("10月31日在区间内：" + TaskDateUtils.isWithinRange(LocalDate.of(2026,10,31), start, end));

    // try {
    //   TaskDateUtils.isWithinRange(start, LocalDate.of(2026,10,30), LocalDate.of(2026,10,20));
    // } catch (IllegalArgumentException e) {
    //   System.out.println(e.getMessage());
    // }

    // try {
    //   TaskDateUtils.isWithinRange(null, start, end);
    // } catch (IllegalArgumentException e) {
    //   System.out.println("判断日期为 null：" + e.getMessage());
    // }

    // try {
    //   TaskDateUtils.isWithinRange(start, null, end);
    // } catch (IllegalArgumentException e) {
    //   System.out.println("开始日期为 null：" + e.getMessage());
    // }

    // try {
    //   TaskDateUtils.isWithinRange(start, start, null);
    // } catch (IllegalArgumentException e) {
    //   System.out.println("结束日期为 null：" + e.getMessage());
    // }

    // System.out.println("16:59未完成是否逾期：" + TaskDateUtils.isOverdue(deadline, LocalDateTime.of(2026,10,27,16,59), false));
    // System.out.println("17:00未完成是否逾期：" + TaskDateUtils.isOverdue(deadline, LocalDateTime.of(2026,10,27,17,00), false));
    // System.out.println("17:01未完成是否逾期：" + TaskDateUtils.isOverdue(deadline, LocalDateTime.of(2026,10,27,17,01), false));
    // System.out.println("18:00已完成是否逾期：" + TaskDateUtils.isOverdue(deadline, LocalDateTime.of(2026,10,27,18,00), true));
    // try {
    //   TaskDateUtils.isOverdue(null, deadline, false);
    // } catch (IllegalArgumentException e) {
    //   System.out.println(e.getMessage());
    // }

    // try {
    //   TaskDateUtils.isOverdue(deadline, null, true);
    // } catch (IllegalArgumentException e) {
    //   System.out.println("已完成但当前时间为 null：" + e.getMessage());
    // }

    // List<Product> products = Arrays.asList(
    //     new Product(1001, "苹果", 500, 10),
    //     new Product(1002, "香蕉", 300, 0),
    //     new Product(1003, "橙子", 400, 5),
    //     new Product(1004, "牛奶", 650, 0),
    //     new Product(1005, "面包", 250, 8)
    // );
    // List<Product> available = ProductStreamService.findAvailable(products);
    // List<String> sortedNames = ProductStreamService.getNamesSortedByPrice(products);
    // long outOfStockCount = ProductStreamService.countOutOfStock(products);
    
    // System.out.println("有库存商品：");
    // for (Product p : available) {
    //     System.out.println(p.getName());
    // }
    // System.out.println("\n按价格排序后的商品名称：");
    // for (String name : sortedNames) {
    //     System.out.println(name);
    // }
    // System.out.println("\n无库存商品数量：");
    // System.out.println(outOfStockCount);

    // List<Product> emptyProducts = Collections.emptyList();
    // System.out.println("\n空列表有库存商品数量：" + ProductStreamService.findAvailable(emptyProducts).size());
    // System.out.println("空列表排序后名称数量：" + ProductStreamService.getNamesSortedByPrice(emptyProducts).size());
    // System.out.println("空列表无库存商品数量：" + ProductStreamService.countOutOfStock(emptyProducts));

    // try {
    //   ProductStreamService.findAvailable(null);
    // } catch (IllegalArgumentException e) {
    //   System.out.println("有库存查询传入 null：" + e.getMessage());
    // }
    // try {
    //   ProductStreamService.getNamesSortedByPrice(null);
    // } catch (IllegalArgumentException e) {
    //   System.out.println("价格排序传入 null：" + e.getMessage());
    // }
    // try {
    //   ProductStreamService.countOutOfStock(null);
    // } catch (IllegalArgumentException e) {
    //   System.out.println("无库存统计传入 null：" + e.getMessage());
    // }

    // System.out.println("\n原列表顺序与库存：");
    // for (Product product : products) {
    //   System.out.println(product.getName() + "：" + product.getStock());
    // }

    List<SalesOrder> orderList = Arrays.asList(
                new SalesOrder(1001, "苹果", LocalDate.of(2026,10,20), Status.SUCCESS, new BigDecimal("30.00")),
                new SalesOrder(1002, "香蕉", LocalDate.of(2026,10,21), Status.CANCELLED, new BigDecimal("20.00")),
                new SalesOrder(1003, "牛奶", LocalDate.of(2026,10,22), Status.SUCCESS, new BigDecimal("45.50")),
                new SalesOrder(1004, "面包", LocalDate.of(2026,10,23), Status.FAILED, new BigDecimal("0.00")),
                new SalesOrder(1005, "橙子", LocalDate.of(2026,10,24), Status.SUCCESS, new BigDecimal("19.99")),
                new SalesOrder(1006, "苹果", LocalDate.of(2026,10,25), Status.SUCCESS, new BigDecimal("12.50")),
                new SalesOrder(1007, "牛奶", LocalDate.of(2026,10,26), Status.CANCELLED, new BigDecimal("35.00"))
        );
    
    SalesReportService service = new SalesReportService();
    LocalDate queryStart = LocalDate.of(2026,10,21);
    LocalDate queryEnd = LocalDate.of(2026,10,25);
  
    List<SalesOrder> successList = service.filterSuccessOrders(orderList, queryStart, queryEnd);
    BigDecimal total = service.calculateSuccessAmount(orderList, queryStart, queryEnd);
    List<SalesOrder> sortedList = service.sortSuccessOrdersDescByAmount(orderList, queryStart, queryEnd);

    System.out.println("===== 区间【2026-10-21 ~ 2026-10-25】 =====");
    System.out.println("成功订单数量：" + successList.size());
    System.out.println("成功订单总额：" + total);
    System.out.println("按金额降序排序结果：");
    for (SalesOrder o : sortedList) {
      System.out.printf("%d %s %s%n", o.getId(), o.getProductName(), o.getPaidAmount());
    }
    System.out.println("\n==== 边界1：空列表 ====");
    List<SalesOrder> emptyList = new ArrayList<>();
    List<SalesOrder> case2 = service.filterSuccessOrders(emptyList, queryStart, queryEnd);
    BigDecimal total2 = service.calculateSuccessAmount(emptyList, queryStart, queryEnd);
    System.out.println("结果列表大小："+case2.size() + "，总额："+total2);

    System.out.println("\n==== 边界2：null列表（预期抛异常） ====");
    try {
      service.filterSuccessOrders(null, queryStart, queryEnd);
    } catch (IllegalArgumentException e) {
      System.out.println("捕获异常：" + e.getMessage());
    }

    System.out.println("\n==== 边界3：null开始日期（预期抛异常） ====");
    try {
      service.filterSuccessOrders(orderList, null, queryEnd);
    } catch (IllegalArgumentException e) {
      System.out.println("捕获异常：" + e.getMessage());
    }
    System.out.println("\n==== 边界3-2：null结束日期（预期抛异常） ====");
    try {
        service.filterSuccessOrders(orderList, queryStart, null);
    } catch (IllegalArgumentException e) {
        System.out.println("捕获异常：" + e.getMessage());
    }
    System.out.println("\n==== 边界4：开始日晚于结束日（2026-10-25 ~ 10-21，预期抛异常） ====");
    try {
      service.filterSuccessOrders(orderList, queryEnd, queryStart);
    } catch (IllegalArgumentException e) {
      System.out.println("捕获异常：" + e.getMessage());
    }

    System.out.println("\n==== 边界5：区间内没有SUCCESS订单（10.21~10.21，只有CANCELLED） ====");
    LocalDate s21e21 = LocalDate.of(2026,10,21);
    List<SalesOrder> case5 = service.filterSuccessOrders(orderList, s21e21, s21e21);
    BigDecimal total5 = service.calculateSuccessAmount(orderList, s21e21, s21e21);
    System.out.println("结果列表大小："+case5.size() + "，总额："+total5);

    System.out.println("\n==== 边界5-2：空列表执行排序方法 ====");
    List<SalesOrder> sortedEmpty = service.sortSuccessOrdersDescByAmount(emptyList, queryStart, queryEnd);
    System.out.println("空列表排序后长度：" + sortedEmpty.size());

    System.out.println("\n==== 边界6：两笔订单金额相同，按订单ID升序 ====");
    List<SalesOrder> sameAmountOrders = new ArrayList<>();
    sameAmountOrders.add(new SalesOrder(1009, "芒果", LocalDate.of(2026,10,22), Status.SUCCESS, new BigDecimal("30.00")));
    sameAmountOrders.add(new SalesOrder(1008, "葡萄", LocalDate.of(2026,10,22), Status.SUCCESS, new BigDecimal("30.00")));
    List<SalesOrder> sortedSame = service.sortSuccessOrdersDescByAmount(sameAmountOrders, queryStart, queryEnd);
    for (SalesOrder o : sortedSame) {
      System.out.println(o.getId() + " " + o.getProductName() + " " + o.getPaidAmount());
    }

    System.out.println("\n==== 边界7：校验原始列表不会被修改 ====");
    String beforeIds = orderList.stream()
            .map(o -> String.valueOf(o.getId()))
            .collect(Collectors.joining(","));
    System.out.println("排序前原始ID序列：" + beforeIds);       
    service.sortSuccessOrdersDescByAmount(orderList, queryStart, queryEnd);

    // 排序后：再次拼接全部订单id
    String afterIds = orderList.stream()
        .map(o -> String.valueOf(o.getId()))
        .collect(Collectors.joining(","));
    System.out.println("排序后原始ID序列：" + afterIds);
    System.out.println("原始列表顺序是否一致：" + beforeIds.equals(afterIds));
  }

}
