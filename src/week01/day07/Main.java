package week01.day07;
import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    // Product apple1 = new Product(1001, "苹果", 500, 10);
    // Product apple2 = new Product(1001, "苹果", 600, 20);
    // Product banana = new Product(1002, "香蕉", 300, 5);
    // Product apple3 = apple1;
    // System.out.println(apple1 == apple2);
    // System.out.println(apple1.equals(apple2));
    // System.out.println(apple2.equals(apple1));
    // System.out.println(apple1 == apple3);
    // System.out.println(apple1.equals(null));
    // System.out.println(apple1.equals("苹果"));

    // System.out.println(apple1.hashCode() == apple2.hashCode());

    // Set<Product> products = new HashSet<>();
    // System.out.println(products.add(apple1));
    // System.out.println(products.add(apple2));
    // System.out.println(products.add(apple3));
    // System.out.println(products.add(banana));
    // System.out.println(products.size());
    // apple1.changePrice(700);
    // System.out.println(apple1.equals(apple2));
    // Result<Product> productResult  = new Result<>(true, "商品查询成功", new Product(1001, "苹果", 500, 10));
    // System.out.println(productResult.getData().getName());
    // Result<String> textResult = new Result<>(true, "成功", "苹果");
    // System.out.println(textResult.getData());
    // Result<Integer> numberResult = new Result<>(true, "数量查询成功", 3);
    // System.out.println(numberResult.getData());

    // String firstName = ArrayUtils.first(new String[] {"苹果", "香蕉"});
    // System.out.println(firstName);
    // Product firstProduct = ArrayUtils.first(new Product[] {
    //   productResult.getData(),
    //   new Product(1002, "香蕉", 300, 5)
    // });
    // System.out.println(firstProduct.getName());
    // try {
    //   ArrayUtils.first((String[]) null);
    // } catch (IllegalArgumentException e) {
    //    System.out.println("null 数组：" + e.getMessage());
    // }

    // try {
    //   ArrayUtils.first(new String[0]);
    // } catch (IllegalArgumentException e) {
    //   System.out.println("空数组：" + e.getMessage());
    // }
    Product apple = new Product(1001, "苹果", 500, 10);
    Product banana = new Product(1002, "香蕉", 300, 10);
    Product orange = new Product(1003, "橙子", 400, 10);

    ProductManager productManager = new ProductManager();
    productManager.addProduct(apple);
    productManager.addProduct(banana);
    productManager.addProduct(orange);

    int[] ids = {1001, 1002, 1001, 9999, 1003, 1002, 8888};
    ProductBatchService productBatchService = new ProductBatchService(productManager);
    BatchQueryResult result = productBatchService.query(ids);

    for (Product product : result.getProducts()) {
      System.out.println("有效商品：" + product.getName());
    }

    for (int id : result.getMissingIds()) {
      System.out.println("不存在的商品ID：" + id);
    }
    int [] allExistingIds = {1003, 1001};
    BatchQueryResult allExistingResult =
    productBatchService.query(allExistingIds);
    for (Product product : allExistingResult.getProducts()) {
      System.out.println("有效商品：" + product.getName());
    }

    int [] allMissingIds = {9999, 8888, 9999};
    BatchQueryResult allMissingResult = 
    productBatchService.query(allMissingIds);
    for (int id : allMissingResult.getMissingIds()) {
      System.out.println("不存在的商品ID：" + id);
    }
    int [] emptyIds = {};
    BatchQueryResult emptyResult = 
    productBatchService.query(emptyIds);
    System.out.println(emptyResult.getProducts().size());
    System.out.println(emptyResult.getMissingIds().size());

    System.out.println("全存在时缺失数量：" + allExistingResult.getMissingIds().size());
    System.out.println("全不存在时有效数量：" + allMissingResult.getProducts().size());
    try {
      productBatchService.query(null);
    } catch(IllegalArgumentException e) {
      System.out.println("入参不能为null");
    }
    System.out.println(apple.getStock());


  }
}
