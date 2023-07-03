package org.fasttrackit.tema8.exercise2;

public class BRD implements BankingAccount{

    @Override
    public String withdraw() {
        return "You withdrawn money from BRD. New total: ";
    }

    @Override
    public String deposit() {
        return "You deposited money to BRD. New total: ";
    }
}
