package DataAccess;

import Entity.Customer;

public interface ICustomerDal {

    void add(Customer customer);
    boolean customerExist(Customer customer);
}
