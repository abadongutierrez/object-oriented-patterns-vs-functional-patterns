package com.jabaddon.book.fpp.command;

public class CashRegister {
    private Double _total;

    public CashRegister(Double total) {
        _total = total;
    }

    public void addCash(Double cash) {
        _total += cash;
    }

    public Double getTotal() {
        return _total;
    }

    public void reset(Double newTotal) {
        _total = newTotal;
    }
}
