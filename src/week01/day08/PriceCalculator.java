package week01.day08;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class PriceCalculator {

    public static BigDecimal calculateTotal(BigDecimal unitPrice, int quantity) {
      if (unitPrice == null) {
        throw new IllegalArgumentException("单价不能为null");
      }
      if (unitPrice.compareTo(BigDecimal.ZERO) <= 0) {
        throw new IllegalArgumentException("单价必须大于0");
      }
      if (quantity <= 0) {
        throw new IllegalArgumentException("数量必须大于0");
      }
      return unitPrice.multiply(BigDecimal.valueOf(quantity));
    }

    public static BigDecimal applyDiscount(BigDecimal total, BigDecimal discountRate) {
      if (total == null) {
        throw new IllegalArgumentException("总价不能为null");
      }
      if (total.compareTo(BigDecimal.ZERO) < 0) {
        throw new IllegalArgumentException("总金额不能小于0");
      }
      if (discountRate == null) {
        throw new IllegalArgumentException("折扣率不能为null");
      }
      if (discountRate.compareTo(BigDecimal.ZERO) < 0 || discountRate.compareTo(BigDecimal.ONE) > 0) {
        throw new IllegalArgumentException("折扣率范围必须为0到1");
      }
      return total.multiply(discountRate).setScale(2, RoundingMode.HALF_UP);
    }
}
