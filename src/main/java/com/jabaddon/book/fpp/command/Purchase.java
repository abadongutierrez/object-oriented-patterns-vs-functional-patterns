package com.jabaddon.book.fpp.command;

public class Purchase implements Command {
    private final Double _amount;
    private final CashRegister _cashRegister;

    public Purchase(CashRegister cashRegister, Double amount) {
        _cashRegister = cashRegister;
        _amount = amount;
    }

    @Override
    public void execute() {
        _cashRegister.addCash(_amount);
    }
}
