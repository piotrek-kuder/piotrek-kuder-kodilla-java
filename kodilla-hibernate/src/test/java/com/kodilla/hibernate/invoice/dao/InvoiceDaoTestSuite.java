package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Invoice invoice1 = new Invoice("INV/01/21");

        Product product1 = new Product("product1");
        Product product2 = new Product("product2");
        Product product3 = new Product("product3");

        Item item1 = new Item(new BigDecimal(11), 1);
        Item item2 = new Item(new BigDecimal(22), 2);
        Item item3 = new Item(new BigDecimal(33), 3);

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);

        product1.getItems().add(item1);
        product2.getItems().add(item2);
        product3.getItems().add(item3);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);

        //When
        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();

        //Then
        System.out.println(invoice1);
        assertNotEquals(0, invoice1Id);

        //CleanUp
        invoiceDao.deleteById(invoice1Id);
    }
}
