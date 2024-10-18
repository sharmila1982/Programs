public interface Accountoperation {
abstract void deposit(double dep);
abstract double getBalance();
abstract void withdraw(double wd) throws InsufficientBalanceException;
}
