package week01.day05;

public class PrefixNotifier implements Notifier {
  @Override
  public void send(String message) {
    System.out.println("[系统通知]" + message);
  }
}
