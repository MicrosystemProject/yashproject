package code.microsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import code.microsystem.entity.Customer;
import code.microsystem.service.CustomerService;

@RestController
@RequestMapping("/manageemp/api/v1")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping("/")
	public String test() {
		return "Testing API";
	}

	@PostMapping("/addCustomer")
	public ResponseEntity<String> addNewCustmer(@RequestBody Customer customer) {
		customerService.addCusomer(customer);

		return new ResponseEntity<String>("Add New Custmer", HttpStatus.OK);
	}
	
	@GetMapping("/getCustomers")
	public List<Customer> getCustomers(){
		
		return customerService.getCustomers();
	}
}
