package ru.geekbrains.hib;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        MySessionFactory mySessionFactory = new MySessionFactory("hibernate.cfg.xml");
        ProductDAO productDAO = new ProductDAO(mySessionFactory.getSessionFactory());

        Product p1 = new Product("Cucumber", 13);
        productDAO.saveOrUpdate(p1);
        Product p2 = new Product("Tomato", 15);
        productDAO.saveOrUpdate(p2);

        Product findProduct = productDAO.findById(1L);
        System.out.println(findProduct);

        List<Product> products = productDAO.findAll();

        productDAO.deleteById(2L);

    }
}
