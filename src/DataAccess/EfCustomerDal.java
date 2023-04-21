package DataAccess;

import Entity.Customer;

public class EfCustomerDal implements ICustomerDal{

    @Override
    public void add(Customer customer) {
        System.out.println("Entity Framework");
    }

    @Override
    public boolean customerExist(Customer customer) {
        return true;
    }
}
