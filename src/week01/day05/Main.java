package week01.day05;

public class Main {
  public static void main(String[] args) {
    
    ProductManager productManager  = new ProductManager();
    Product apple = new Product(1001, "苹果", 500, 10);
    Product banana = new Product(1002, "香蕉", 300, 5);
    Product strawberry = new Product(1003, "草莓", 300, 5);

    productManager.addProduct(apple);
    productManager.addProduct(banana);

    OrderService orderService = new OrderService(productManager);
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

    ProductRepository fixedRepository = new FixedProductRepository();
    OrderService fixedService = new OrderService(fixedRepository);
    Order milkOrder1 = fixedService.createAndProcessOrder(2001, 3);
    System.out.println(milkOrder1.getStatus());
    System.out.println(milkOrder1.getTotalAmount());
    System.out.println(fixedRepository.findById(2001).getStock());
    Order milkOrder2 = fixedService.createAndProcessOrder(2001, 5);
    System.out.println(milkOrder2.getStatus());
    System.out.println(milkOrder2.getTotalAmount());
    System.out.println(fixedRepository.findById(2001).getStock());
    Order milkOrder3 = fixedService.createAndProcessOrder(2001, 3);
    System.out.println(milkOrder3.getStatus());
    System.out.println(milkOrder3.getTotalAmount());
    System.out.println(fixedRepository.findById(2001).getStock());

    Order breadOrder1 = fixedService.createAndProcessOrder(2002, 6);
    System.out.println(breadOrder1.getStatus());
    System.out.println(breadOrder1.getTotalAmount());
    System.out.println(fixedRepository.findById(2002).getStock());

    System.out.println(fixedRepository.findById(9999));

    System.out.println("取消前苹果库存：" + apple.getStock());
    System.out.println("成功订单首次取消：" + order.cancel());
    System.out.println("取消后订单状态：" + order.getStatus());
    System.out.println("取消后苹果库存：" + apple.getStock());
    System.out.println("成功订单再次取消：" + order.cancel());
    System.out.println("再次取消后苹果库存：" + apple.getStock());
    System.out.println("已取消订单再次购买：" + order.processPurchase());
    System.out.println("再次购买后苹果库存：" + apple.getStock());

    System.out.println("失败订单取消：" + order3.cancel());
    System.out.println("失败订单状态：" + order3.getStatus());
    System.out.println("失败订单取消后苹果库存：" + apple.getStock());

    Order order7 = new Order(strawberry, 2);
    System.out.println("未处理订单取消：" + order7.cancel());
    System.out.println("未处理订单状态：" + order7.getStatus());
    System.out.println("未处理订单取消后草莓库存：" + strawberry.getStock());

    Product orange = new Product(1004, "橙子", 400, 10);
    
    Order orangeOrderA = new Order(orange, 3);
    Order orangeOrderB = new Order(orange, 2);

    orangeOrderA.processPurchase();
    orangeOrderB.processPurchase();
    System.out.println(orange.getStock());
    orangeOrderA.cancel();
    System.out.println(orange.getStock());
    System.out.println(orangeOrderA.cancel());
    System.out.println(orange.getStock());

  }
}
