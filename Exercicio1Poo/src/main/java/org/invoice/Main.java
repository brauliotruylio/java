package org.invoice;

public class Main {
    public static void main(String[] args) {

        Invoice inv = new Invoice(1, "Mouse", -5, 120.0f );
        System.out.println("Valor total: " + inv.getInvoiceAmount());
    }
}