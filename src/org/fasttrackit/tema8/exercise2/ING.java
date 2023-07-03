package org.fasttrackit.tema8.exercise2;

public class ING implements BankingAccount{

    @Override
    public String withdraw() {
        return "You withdrawn money from ING. New total: ";
    }

    @Override
    public String deposit() {
        return "You deposited money to ING. New total: ";
    }
}
