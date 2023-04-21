package Business;

import DataAccess.ICustomerDal;
import Entity.Customer;

public class CustomerManager {
    private ICustomerDal customerDal;


    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;

    }
    public void  add(Customer customer){
        //Utility.Validate(new CustomerValidator(),customer);
        customerDal.add(customer);
        System.out.println("Müşteri eklendi");

    }
}
