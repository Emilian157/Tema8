package org.fasttrackit.tema8.exercise2;

public class BankServer {
    private BRD brdBank;
    private BT btBank;
    private ING ingBank;
    private TotalAmount totalAmount;

    public BankServer(BRD brdBank, BT btBank, ING ingBank, TotalAmount totalAmount) {
        this.brdBank = brdBank;
        this.btBank = btBank;
        this.ingBank = ingBank;
        this.totalAmount = totalAmount;
    }

    public TotalAmount getTotalAmount() {
        return totalAmount;
    }



    public void withdrawFromBRD(double amount) {
        double totalAmount = getTotalAmount().getCurrentAmount();
        System.out.println(brdBank.withdraw() + (totalAmount - amount));
        getTotalAmount().setCurrentAmount(totalAmount - amount);
    }

    public void depositToBRD(double amount) {
        double totalAmount = getTotalAmount().getCurrentAmount();
        System.out.println(brdBank.deposit() + (totalAmount + amount));
        getTotalAmount().setCurrentAmount(totalAmount + amount);
    }

    public void withdrawFromBT(double amount) {
        double totalAmount = getTotalAmount().getCurrentAmount();
        System.out.println(btBank.withdraw() + (totalAmount - amount));
        getTotalAmount().setCurrentAmount(totalAmount - amount);
    }

    public void depositToBT(double amount) {
        double totalAmount = getTotalAmount().getCurrentAmount();
        System.out.println(btBank.deposit() + (totalAmount + amount));
        getTotalAmount().setCurrentAmount(totalAmount + amount);
    }

    public void withdrawFromING(double amount) {
        double totalAmount = getTotalAmount().getCurrentAmount();
        System.out.println(ingBank.withdraw() + (totalAmount - amount));
        getTotalAmount().setCurrentAmount(totalAmount - amount);
    }

    public void depositToING(double amount) {
        double totalAmount = getTotalAmount().getCurrentAmount();
        System.out.println(ingBank.deposit() + (totalAmount + amount));
        getTotalAmount().setCurrentAmount(totalAmount + amount);
    }
}
