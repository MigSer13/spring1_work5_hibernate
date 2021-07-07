package ru.geekbrains.hib;

public class MainApp {
    public static void main(String[] args) {
        MySessionFactory mySessionFactory = new MySessionFactory("hibernate.cfg.xml");
        ProductDAO productDAO = new ProductDAO(mySessionFactory.getSessionFactory());

        Product p1 = new Product("Cucumber", 13);
        productDAO.saveOrUpdate(p1);
    }
}
