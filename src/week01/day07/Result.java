package week01.day07;

public class Result<T> {
  private final boolean isSuccess;
  private final String message;
  private final T data;
  public Result(boolean isSuccess, String message, T data) {
    this.isSuccess = isSuccess;
    this.message = message;
    this.data = data;
  }

  public boolean getSuccess() {
    return isSuccess;
  }

  public String getMessage() {
    return message;
  }

  public T getData() {
    return data;
  }
}
