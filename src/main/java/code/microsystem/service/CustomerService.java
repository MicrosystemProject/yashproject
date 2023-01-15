package code.microsystem.service;

import java.util.List;

import code.microsystem.entity.Customer;


public interface CustomerService {
	
   public Customer addCusomer(Customer customer);

public List<Customer> getCustomers();
}
