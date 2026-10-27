package week01.day07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProductBatchService {
  private final ProductRepository productRepository;
  
  public ProductBatchService(ProductRepository productRepository) {

    if (productRepository == null) {
      throw new IllegalArgumentException("商品仓储不能为 null");
    }
    this.productRepository = productRepository;
  }

  public BatchQueryResult query(int[] ids) {
    if (ids == null) {
      throw new IllegalArgumentException("商品 ID 数组不能为 null");
    }
    List<Product> products = new ArrayList<>();
    List<Integer> missingIds = new ArrayList<>();
    Set<Integer> seenIds = new HashSet<>();

    for (int id : ids) {
      if (!seenIds.contains(id)) {
        continue;
      }

      Product product = productRepository.findById(id);
      
      if (product != null) {
        products.add(product);
      } else {
        missingIds.add(id);
      }
    }

    return new BatchQueryResult(products, missingIds);
  }
}
