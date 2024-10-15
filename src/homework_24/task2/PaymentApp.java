package homework_24.task2;

public class PaymentApp {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(1000);
        bankAccount.withdrawMoney(1200);
        bankAccount.depositTransfer(50);
        bankAccount.checkBalance();

        System.out.println("=================================");

        ElectronicWallet electronicWallet = new ElectronicWallet(500);
        electronicWallet.withdrawMoney(100);
        electronicWallet.depositTransfer(40);
        electronicWallet.checkBalance();

    }
}
