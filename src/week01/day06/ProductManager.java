package week01.day06;
import java.util.HashMap;
import java.util.Map;


public class ProductManager implements ProductRepository {
  private final Map<Integer, Product> products = new HashMap<>();
  
  public int getCount() {
    return products.size();
  }
  @Override
  public Product findById(int id) {

    return products.get(id);
  }

  public boolean addProduct(Product product) {
    if (product == null || products.containsKey(product.getId())) {
      return false;
    }
    products.put(product.getId(), product);
    return true;
  } 
  public boolean removeById(int id) {
    return products.remove(id) != null;
  }
}
