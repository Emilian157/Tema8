package org.fasttrackit.tema8.exercise2;

public class BT implements BankingAccount{

    @Override
    public String withdraw() {
        return "You withdrawn money from BT. New total: ";
    }

    @Override
    public String deposit() {
        return "You deposited money to BT. New total: ";
    }
}