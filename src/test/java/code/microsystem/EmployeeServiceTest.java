package code.microsystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import code.microsystem.entity.Customer;
import code.microsystem.repository.CustmerRepository;
import code.microsystem.service.CustomerService;

@SpringBootTest
public class EmployeeServiceTest {

	@Mock
	CustmerRepository custmerRepository;
	@Mock
	CustomerService customerService;
	@Test
	public void addCustmerTest() {
	 Customer customer=new Customer("Arvind","Sharma");
when(customerService.addCusomer(customer)).thenReturn(customer);
	assertEquals(customerService.addCusomer(customer), customer);
	 
	}
	
	@Test
	public void getCustomersTest() {
		List<Customer> customerList=new ArrayList<>();
		customerList.add(new Customer("James", "Jack"));
		customerList.add(new Customer("Kelly","James"));
		when(customerService.getCustomers()).thenReturn(customerList);
		assertEquals(customerService.getCustomers(), customerList);
	}
}
