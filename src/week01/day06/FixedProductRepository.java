package week01.day06;


public class FixedProductRepository implements ProductRepository {
  private final Product milk;
  private final Product bread;
  
  public FixedProductRepository() {
    milk = new Product(2001, "牛奶", 650, 10);
    bread = new Product(2002, "面包", 350, 6);
  }

  @Override
  public Product findById(int id) {
    if (id == 2001) {
      return milk;
    }
    if (id == 2002) {
      return bread;
    }
    return null;
  }
}
