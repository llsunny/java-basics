package week01.day07;

import java.util.List;

public class BatchQueryResult {
  private final List<Product> products;
  private final List<Integer> missingIds;

  public BatchQueryResult(List<Product> products, List<Integer> missingIds) {
    this.products = products;
    this.missingIds = missingIds;
  }

  public List<Product> getProducts() {
    return products;
  }

  public List<Integer> getMissingIds() {
    return missingIds;
  }
}
