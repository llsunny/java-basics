package week01.day06;


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
      throw new ProductNotFoundException("商品不存在");
    }
    if (quantity <= 0) {
      throw new IllegalArgumentException("购买数量必须大于0");
    }
    Order order = new Order(product, quantity);
    order.processPurchase();
    return order;
  }
}
