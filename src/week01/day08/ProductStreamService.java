package week01.day08;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;
public class ProductStreamService {
  public static List<Product> findAvailable(List<Product> products) {
    if (products == null) {
      throw new IllegalArgumentException("商品列表不能为null");
    }
    return products.stream()
      .filter(product -> product.getStock() > 0)
      .collect(Collectors.toList());
  }

  public static List<String> getNamesSortedByPrice(List<Product> products) {
    if (products == null) {
        throw new IllegalArgumentException("商品列表不能为null");
    }
    return products.stream()
            .sorted(Comparator.comparing(Product::getPrice))
            .map(Product::getName)
            .collect(Collectors.toList());
  }

  public static long countOutOfStock(List<Product> products) {
    if (products == null) {
        throw new IllegalArgumentException("商品列表不能为null");
    }
    return products.stream()
            .filter(product -> product.getStock() == 0)
            .count();
}
}
