package week01.day04;

public class Order {
  private final String productName;
  private final int unitPrice;
  private final int quantity;
  private int totalAmount;
  private final Product product;
  public enum Status {
    UNPROCESSED,
    SUCCESS,
    FAILED
  }
  private Status status;
  public Order (Product product, int quantity) {
    this.productName = product.getName();
    this.unitPrice = product.getPrice();
    this.quantity = quantity;
    this.product = product;
    this.status = Status.UNPROCESSED;
  }
  public String getProductName() {
    return this.productName;
  }

  public int getUnitPrice() {
    return this.unitPrice;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public int getTotalAmount() {
    return this.totalAmount;
  }

  public Status getStatus() {
    return this.status;
  }

  public boolean processPurchase() {
    if (this.status != Status.UNPROCESSED) {
      return false;
    }
    boolean isSuccessful = product.purchase(quantity);
    if (isSuccessful) {
      this.status = Status.SUCCESS;
      this.totalAmount = this.unitPrice * quantity;
      return true;
    } else {
      this.totalAmount = 0;
      this.status = Status.FAILED;
      return false;
    }
  }
}
