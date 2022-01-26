package ru.itsjava.proxy;

public class AbstractBookDaoImplProxy extends AbstractBookDao{

    @Override
    public String getBook(long id) {
        System.out.println("Privet iz AbstractBookDaoImplProxy");
        return new AbstractBookDaoImpl().getBook(1L);
    }
}
