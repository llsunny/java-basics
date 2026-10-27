package week01.day07;

public class Product {
  private final int id;
  private String name;
  private int price;
  private int stock;
  public Product(int id, String name, int price, int stock) {
    if (name == null || name.trim().isEmpty()) {
      throw new IllegalArgumentException("商品名称不能为空");
    }
    if (price <= 0) {
      throw new IllegalArgumentException("价格必须大于0");
    }
    if (stock < 0) {
      throw new IllegalArgumentException("不要创建非法商品");
    }
    if (id <= 0) {
      throw new IllegalArgumentException("id必须大于0");
    }
    this.id = id;
    this.name = name;
    this.price = price;
    this.stock = stock;
  }
  public boolean canBuy(int quantity) {
    return quantity > 0 && this.stock >= quantity;
  }
  public int getId() {
    return this.id;
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

  public boolean restoreStock(int quantity) {
    if (quantity > 0) {
      this.stock += quantity;
      return true;
    }
    return false;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (!(obj instanceof Product)) {
      return false;
    }

    Product other = (Product) obj;
    return this.id == other.id;
  }
  @Override
  public int hashCode() {
    return this.id;
  }
}
