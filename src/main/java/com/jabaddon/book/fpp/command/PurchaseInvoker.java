package com.jabaddon.book.fpp.command;

import java.util.ArrayList;
import java.util.List;

public class PurchaseInvoker {
    public List<Purchase> _purchaseList = new ArrayList<>();

    public void addPurchase(Purchase purchase) {
        _purchaseList.add(purchase);
    }

    public void apply() {
        for (Purchase purchase : _purchaseList) {
            purchase.execute();
        }
    }
}
