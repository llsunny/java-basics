package week01.day01;

public class Main {
  public static void main(String[] args) {
    // System.out.println("Java Learning Day 1");
    // System.out.println(doubleNumber(10));
    // int result = add(15, 25);
    // System.out.println(result);
    // System.out.println(isPositive(5));
    // System.out.println(isPositive(0));
    // System.out.println(isPositive(-3));
    // System.out.println(canBuy(10, 3));
    // System.out.println(canBuy(10, 10));
    // System.out.println(canBuy(10, 15));
    // System.out.println(canBuy(10, 0));
    // System.out.println(canBuy(10, -2));
    // System.out.println(canBuy(-5, 3));
    // System.out.println(calculateTotal(2590, 3));
    // System.out.println(calculateTotal(1000, 15));
    // System.out.println(calculateTotal(999, 0));
    // System.out.println(calculateTotal(999, -2));
    int stock = 10;
    int price = 2500;
    int[] quantities = {3, 15, 0, -2};
    for (int quantity : quantities) {

      if (quantity <= 0) {
        System.out.println("购买数量不合法");
  
      } else if (canBuy(stock, quantity)) {
        int total = calculateTotal(price, quantity);
        System.out.println("总价：" + total + "分");
      } else {
        System.out.println("库存不足");
      }
    }
  }
  // static int doubleNumber(int n) {
  //   return n * 2;
  // }
  // static int add(int a, int b) {
  //   return a + b;
  // }
  // static boolean isPositive(int n) {
  //   return n > 0;
  // }
  static boolean canBuy(int stock, int quantity) {
    return quantity > 0 && stock >= quantity;
  }
  static int calculateTotal(int price, int quantity) {
    return price * quantity;
  }
  
}
