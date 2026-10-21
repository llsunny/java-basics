package week01.day02;

public class Main {
  public static void main(String[] args) {
    // Product apple = new Product("苹果", 500, 10);
    // Product banana = new Product("香蕉", 300, 5);

    // BankAccount bankAccount = new BankAccount("张三", 10000);
    // System.out.println(bankAccount.deposit(5000));
    // System.out.println(bankAccount.getBalance());

    // System.out.println(bankAccount.withdraw(3000));
    // System.out.println(bankAccount.getBalance());

    // System.out.println(bankAccount.withdraw(15000));
    // System.out.println(bankAccount.getBalance());

    // System.out.println(bankAccount.deposit(-100));
    // System.out.println(bankAccount.getBalance());

    // System.out.println(bankAccount.withdraw(12000));
    // System.out.println(bankAccount.getBalance());

    // System.out.println(bankAccount.withdraw(1));
    // System.out.println(bankAccount.getBalance());
    BankAccount tesAccount = new BankAccount("李四", -100);
    System.out.println(tesAccount.getBalance());
    System.out.println(tesAccount.deposit(0));
    System.out.println(tesAccount.getBalance());
    System.out.println(tesAccount.withdraw(0));
    System.out.println(tesAccount.getBalance());


  }
}
