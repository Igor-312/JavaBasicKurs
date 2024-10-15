package homework_24.task2;

public class ElectronicWallet implements PaymentSystem {

    private double balanceInDollars;

    public ElectronicWallet(double balanceInDollars) {
        this.balanceInDollars = balanceInDollars;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount <= balanceInDollars) {
            balanceInDollars-= amount;
            System.out.printf("Снято %s Dollars. Новый баланс: %s Dollars.\n", amount, balanceInDollars);
        }else {
            System.out.println("Недостаточно средств.\n");
        }
    }

    @Override
    public void depositTransfer(double amount) {
        balanceInDollars += amount;
        System.out.printf("Поступило %s Dollars. Новый баланс: %s Dollars.\n", amount, balanceInDollars);
    }

    @Override
    public double checkBalance() {
        return balanceInDollars;
    }
}
