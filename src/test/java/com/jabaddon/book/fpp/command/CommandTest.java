package com.jabaddon.book.fpp.command;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CommandTest {

    @Test
    public void testCashRegisterInit() {
        CashRegister cashRegister = new CashRegister(0d);
        assertThat(cashRegister.getTotal(), is(0d));
    }

    @Test
    public void testApplyPurchases() {
        PurchaseInvoker purchaseInvoker = new PurchaseInvoker();
        CashRegister cashRegister = new CashRegister(100d);

        purchaseInvoker.addPurchase(new Purchase(cashRegister, 50d));
        purchaseInvoker.addPurchase(new Purchase(cashRegister, 10d));
        purchaseInvoker.addPurchase(new Purchase(cashRegister, 20d));

        purchaseInvoker.apply();

        assertThat(cashRegister.getTotal(), is(180d));

        cashRegister.reset(100d);

        assertThat(cashRegister.getTotal(), is(100d));

        purchaseInvoker.apply();

        assertThat(cashRegister.getTotal(), is(180d));
    }
}
