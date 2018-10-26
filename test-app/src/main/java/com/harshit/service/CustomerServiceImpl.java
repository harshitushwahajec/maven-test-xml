package com.harshit.service;

import java.util.List;

import com.harshit.model.Customer;
import com.harshit.repository.CustomerRepository;
import com.harshit.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	/* (non-Javadoc)
	 * @see com.harshit.service.CustomerSrvice#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		CustomerRepository customerRepository = new CustomerRepositoryImpl();
		return customerRepository.findAll();
	}
	
}
