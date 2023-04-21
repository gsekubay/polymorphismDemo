package DataAccess;

import Entity.Customer;

public class NHibernate implements ICustomerDal{
    @Override
    public void add(Customer customer) {
        System.out.println("NHibernate Framework");
    }

    @Override
    public boolean customerExist(Customer customer) {
        return true;
    }
}
