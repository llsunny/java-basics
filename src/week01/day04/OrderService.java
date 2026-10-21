package week01.day04;


public class OrderService {
  private final ProductManager productManager;

  public OrderService(ProductManager productManager) {
    if (productManager == null) {
      throw new IllegalArgumentException("商品管理器不能为空");
    }
    this.productManager = productManager;
  }

  public Order createAndProcessOrder(int productId, int quantity) {
    Product product = productManager.findById(productId);
    if (product == null) {
      return null;
    }
    Order order = new Order(product, quantity);
    order.processPurchase();
    return order;
  }
}
