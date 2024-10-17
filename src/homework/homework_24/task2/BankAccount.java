package homework.homework_24.task2;

public class BankAccount implements PaymentSystem {
    private double balanceInEuros;

    public BankAccount(double initialBalance) {
        this.balanceInEuros = initialBalance;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount <= balanceInEuros) {
            balanceInEuros -= amount;
            System.out.printf("Снято %s Euro. Новый баланс: %s Euro.\n", amount, balanceInEuros);
        } else {
            System.out.println("Недостаточно средств.\n");
        }
    }

    @Override
    public void depositTransfer(double amount) {
        balanceInEuros += amount;
        System.out.printf("Поступило %s Euro. Новый баланс: %s Euro.\n", amount, balanceInEuros);
    }

    @Override
    public double checkBalance() {
        return balanceInEuros;
    }
}
