package com.kodilla.stream.invoice.simple;

public final class SimpleItem {
    private final SimpleProduct product;
    private final double quantity;

    public SimpleItem(final SimpleProduct procuct, final double quantity) {
        this.product = procuct;
        this.quantity = quantity;
    }

    public SimpleProduct getProcuct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getValue() {
        return product.getProductPrice() * quantity;
    }
}
