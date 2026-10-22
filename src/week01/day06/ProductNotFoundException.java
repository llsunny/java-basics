package week01.day06;

public class ProductNotFoundException extends RuntimeException {
  public ProductNotFoundException(String message) {
    super(message);
  }
}
