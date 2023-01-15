package code.microsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import code.microsystem.entity.Customer;
import code.microsystem.repository.CustmerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustmerRepository custmerRepository;
	
	@Override
	public Customer addCusomer(Customer customer) {
		
		return custmerRepository.save(customer);
	}

	@Override
	public List<Customer> getCustomers() {
		
		return custmerRepository.findAll();
	}

}
