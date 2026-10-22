package week01.day06;

public class Main {
  public static void main(String[] args) {
    Product apple = new Product(1001, "苹果", 500, 10);
  
    ProductManager manage = new ProductManager();
    manage.addProduct(apple);

    OrderService orderService = new OrderService(manage);
    Order first = orderService.createAndProcessOrder(1001, 3);
    System.out.println("买3件：" + first.getStatus() + "，库存：" + apple.getStock());

    try {
      orderService.createAndProcessOrder(9999, 2);
    } catch (ProductNotFoundException e) {
      System.out.println("商品不存在：" + e.getMessage());
    }

    try {
      orderService.createAndProcessOrder(1001, 0);
    } catch (IllegalArgumentException e) {
      System.out.println("购买0件：" + e.getMessage() + "，库存：" + apple.getStock());
    }

    try {
      orderService.createAndProcessOrder(1001, -2);
    } catch (IllegalArgumentException e) {
      System.out.println("购买-2件：" + e.getMessage() + "，库存：" + apple.getStock());
    }

    Order insufficient = orderService.createAndProcessOrder(1001, 8);
    System.out.println("买8件：" + insufficient.getStatus() + "，库存：" + apple.getStock());

    Order last = orderService.createAndProcessOrder(1001, 2);
    System.out.println("再买2件：" + last.getStatus() + "，库存：" + apple.getStock());

    // 同时存在“商品不存在”和“数量非法”时，验证你选定的校验顺序
    try {
      orderService.createAndProcessOrder(9999, 0);
    } catch (ProductNotFoundException e) {
      System.out.println("9999号商品、购买0件：" + e.getClass().getSimpleName());
    }

    System.out.println("测试结束");
  }
}
