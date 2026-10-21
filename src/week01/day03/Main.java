package week01.day03;

public class Main {
  public static void main(String[] args) {
    Product apple = new Product("苹果", 500, 10);
    Order order = new Order(apple, 3);
    System.out.println(order.getStatus()); 
    System.out.println(apple.getStock());
    System.out.println(order.processPurchase());
    System.out.println(order.getStatus());
    System.out.println(order.getTotalAmount());
    System.out.println(apple.getStock());

    Order order2 = new Order(apple, 8);
    System.out.println(order2.getStatus()); 
    System.out.println(order2.processPurchase());
    System.out.println(order2.getStatus());
    System.out.println(order2.processPurchase());
    System.out.println(apple.getStock());

    System.out.println(order2.getTotalAmount());
    System.out.println(apple.getStock());

    Order order3 = new Order(apple, 7);
    System.out.println(order3.getStatus()); 
    System.out.println(order3.processPurchase());
    System.out.println(order3.getStatus());
    System.out.println(order3.getTotalAmount());
    System.out.println(apple.getStock());

    Order order4 = new Order(apple, 1);
    System.out.println(order4.getStatus()); 
    System.out.println(order4.processPurchase());
    System.out.println(order4.getStatus());
    System.out.println(order4.getTotalAmount());
    System.out.println(apple.getStock());

    Product banana = new Product("香蕉", 300, 10);

    Order order5 = new Order(banana, 2);
    System.out.println(order5.getStatus()); 
    banana.changePrice(500);
    System.out.println(order5.processPurchase());
    System.out.println(order5.getStatus());
    System.out.println(order5.getTotalAmount());
    System.out.println(order5.processPurchase());
    System.out.println(banana.getStock());
    System.out.println(banana.getPrice());
    System.out.println(banana.changePrice(0));
    System.out.println(banana.getPrice());
    Order order6 = new Order(banana, 2);
    System.out.println(order6.processPurchase());
    System.out.println(order6.getTotalAmount());
    System.out.println(order5.getTotalAmount());

    Product testProduct = new Product("测试商品", 500, 10);
    Order zeroOrder = new Order(testProduct, 0);
    System.out.println("购买前状态：" + zeroOrder.getStatus());
    System.out.println(zeroOrder.processPurchase());
    System.out.println(zeroOrder.getStatus());

    System.out.println("订单金额：" + zeroOrder.getTotalAmount());
    System.out.println("剩余库存：" + testProduct.getStock());

    Order negativeOrder = new Order(testProduct, -2);
    System.out.println("购买前状态：" + negativeOrder.getStatus());

    System.out.println(negativeOrder.processPurchase());

    System.out.println("买-2件是否成功：" + negativeOrder.getStatus());
    System.out.println("订单金额：" + negativeOrder.getTotalAmount());
    System.out.println("剩余库存：" + testProduct.getStock());

    try {
      new Product("错误商品", 0, 10);
    } catch (IllegalArgumentException e) {
      System.out.println("拒绝非法价格：" + e.getMessage());
    }
    
    try {
      new Product("错误商品库存", 11, -1);
    } catch (IllegalArgumentException e) {
      System.out.println("拒绝非法库存：" + e.getMessage());
    }

    String[] invalidNames = {null, "", "   "};

    for (String invalidName : invalidNames) {
      try {
        new Product(invalidName, 500, 10);
        System.out.println("测试失败：非法名称被接受了");
      } catch (IllegalArgumentException e) {
        System.out.println("非法名称被拒绝：" + e.getMessage());
      }
    }
  }
}
