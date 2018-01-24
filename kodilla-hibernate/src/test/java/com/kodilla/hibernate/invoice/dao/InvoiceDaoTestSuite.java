package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product phone = new Product("Samsung");
        Product phone2 = new Product("Iphone");
        Product phone3 = new Product("Sony");

        Item item = new Item(phone, new BigDecimal(1599.99), 2);
        Item item2 = new Item(phone2, new BigDecimal(2599.00), 3);
        Item item3 = new Item(phone3, new BigDecimal(999.99), 5);

        item.setProduct(phone);
        item2.setProduct(phone2);
        item3.setProduct(phone3);

        phone.getItemsList().add(item);
        phone.getItemsList().add(item2);
        phone.getItemsList().add(item3);

        Invoice invoice = new Invoice("FV/1234/124");
        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.delete(id);
    }
}
