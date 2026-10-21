package week01.day02;

public class Product {
  String name;
  int price;
  private int stock;
  public Product(String name, int price, int stock) {
    this.name = name;
    this.price = price;
    this.stock = stock;
  }
  public boolean canBuy(int quantity) {
    return quantity > 0 && this.stock >= quantity;
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
}
