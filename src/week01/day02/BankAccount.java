package week01.day02;

public class BankAccount {
  private String owner;
  private int balance;

  public BankAccount(String owner, int balance) {
    this.owner = owner;
    if (balance < 0) {
      this.balance = 0;
    } else {
      this.balance = balance;
    }
  }
  public int getBalance() {
    return this.balance;
  }

  public boolean deposit(int amount) {
    if (amount <= 0) {
      return false;
    }
    this.balance += amount;
    return true;
  }

  public boolean withdraw(int amount) {

    if (amount > 0 && amount <= this.balance) {
      this.balance -= amount;
      return true;
    } else {
      return false;
    }
  }
}
