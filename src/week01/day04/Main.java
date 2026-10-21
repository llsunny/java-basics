package week01.day04;

public class Main {
  public static void main(String[] args) {
    // ProductManager manager = new ProductManager();

    // // 空集合测试
    // System.out.println("空集合查找：" + manager.findById(9999));
    // System.out.println("空集合删除：" + manager.removeById(9999));

    // // 添加三件商品
    // Product apple = new Product(1001, "苹果", 500, 10);
    // Product banana = new Product(1002, "香蕉", 300, 5);
    // Product orange = new Product(1003, "橙子", 400, 8);

    // System.out.println("添加苹果：" + manager.addProduct(apple));
    // System.out.println("添加香蕉：" + manager.addProduct(banana));
    // System.out.println("添加橙子：" + manager.addProduct(orange));

    // // 重复 ID：应该失败，原商品不被覆盖
    // Product anotherApple = new Product(1001, "另一种苹果", 600, 20);
    // System.out.println("重复添加 ID=1001：" + manager.addProduct(anotherApple));

    // // 查找存在和不存在的 ID
    // Product found = manager.findById(1002);
    // System.out.println("查找 ID=1002：" +
    //     (found == null ? "未找到" : found.getName()));
    // System.out.println("查找 ID=9999：" + manager.findById(9999));

    // // 删除同一个 ID 两次
    // System.out.println("第一次删除 ID=1001：" + manager.removeById(1001));
    // System.out.println("第二次删除 ID=1001：" + manager.removeById(1001));

    // System.out.println("最终商品数量：" + manager.getCount());

    // System.out.println("添加null：" + manager.addProduct(null));

    ProductManager orderProducts  = new ProductManager();
    Product apple = new Product(1001, "苹果", 500, 10);
    Product banana = new Product(1002, "香蕉", 300, 5);
    orderProducts.addProduct(apple);
    orderProducts.addProduct(banana);
    OrderService orderService = new OrderService(orderProducts);
    Order order = orderService.createAndProcessOrder(1001, 3);
    System.out.println(order.getStatus());
    System.out.println(order.getTotalAmount());
    System.out.println(apple.getStock());
    Order order2 = orderService.createAndProcessOrder(1002, 5);
    System.out.println(order2.getStatus());
    System.out.println(order2.getTotalAmount());
    System.out.println(banana.getStock());
    Order order3 = orderService.createAndProcessOrder(1001, 8);
    System.out.println(order3.getStatus());
    System.out.println(order3.getTotalAmount());
    System.out.println(apple.getStock());

    Order order4 = orderService.createAndProcessOrder(9999, 2);
    System.out.println(order4 == null ? "商品不存在，没有创建订单" : order4.getStatus());

    Order order5 = orderService.createAndProcessOrder(1002, 1);
    System.out.println(order5.getStatus());
    System.out.println(order5.getTotalAmount());
    System.out.println(banana.getStock());

    Order order6 = orderService.createAndProcessOrder(1001, 0);
    System.out.println(order6.getStatus());
    System.out.println(order6.getTotalAmount());
    System.out.println(apple.getStock());
  }
}
