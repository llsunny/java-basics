package week01.day03;

public class Product {
  private String name;
  private int price;
  private int stock;
  public Product(String name, int price, int stock) {
    if (name == null || name.trim().isEmpty()) {
      throw new IllegalArgumentException("商品名称不能为空");
    }
    if (price <= 0) {
      throw new IllegalArgumentException("价格必须大于0");
    }
    if (stock < 0) {
      throw new IllegalArgumentException("不要创建非法商品");
    }
    this.name = name;
    this.price = price;
    this.stock = stock;
  }
  public boolean canBuy(int quantity) {
    return quantity > 0 && this.stock >= quantity;
  }
  public String getName() {
    return this.name;
  }

  public int getPrice() {
    return this.price;
  }
  public int getStock() {
    return this.stock;
  }
  public boolean purchase(int quantity) {
    if (canBuy(quantity)) {
      this.stock -= quantity;
      return true;
    } else {
      return false;
    }
  }
  public boolean changePrice(int newPrice) {
    if (newPrice <= 0) {
      return false;
    }
    this.price = newPrice;
    return true;
  }

}
