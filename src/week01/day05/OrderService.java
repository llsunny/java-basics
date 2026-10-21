package week01.day05;


public class OrderService {
  private final ProductRepository productRepository;

  public OrderService(ProductRepository productRepository) {
    if (productRepository == null) {
      throw new IllegalArgumentException("商品仓储不能为空");
    }
    this.productRepository = productRepository;
  }

  public Order createAndProcessOrder(int productId, int quantity) {
    Product product = productRepository.findById(productId);
    if (product == null) {
      return null;
    }
    Order order = new Order(product, quantity);
    order.processPurchase();
    return order;
  }
}
