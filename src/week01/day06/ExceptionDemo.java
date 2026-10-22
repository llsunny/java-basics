package week01.day06;

public class ExceptionDemo {
  public static void main(String[] args) {
    for(int quantity : new int[] {3, 0, -2}) {
      try {
        placeOrder(quantity);
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    }
    System.out.println("全部测试结束");
  }

  public static void validateQuantity(int quantity) {
    if (quantity <= 0) {
      throw new IllegalArgumentException("购买数量必须大于0");
    }
  }

  public static void placeOrder(int quantity) {
    validateQuantity(quantity);
    System.out.println("订单校验通过");
  }

}
